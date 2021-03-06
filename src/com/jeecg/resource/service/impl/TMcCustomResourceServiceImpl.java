package com.jeecg.resource.service.impl;

import com.jeecg.resource.service.TMcCustomResourceServiceI;
import com.jeecg.workorder.entity.TMcWorkOrderEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.resource.entity.TMcCustomResourceEntity;
import com.jeecg.resource.entity.TMcCustomResourceProblemEntity;

import org.jeecgframework.web.system.pojo.base.JformInnerMailAttach;
import org.jeecgframework.web.system.service.JformInnerMailServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;

import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;


@Service("tMcCustomResourceService")
@Transactional
public class TMcCustomResourceServiceImpl extends CommonServiceImpl implements TMcCustomResourceServiceI {

    @Autowired
    private JformInnerMailServiceI jformInnerMailService;

    public <T> void delete(T entity) {
        super.delete(entity);
        //执行删除操作配置的sql增强
        this.doDelSql((TMcCustomResourceEntity) entity);
    }

    public void addMain(TMcCustomResourceEntity tMcCustomResource,
                        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList) {
        //保存主信息
        tMcCustomResource.setBpmStatus("1");
        this.save(tMcCustomResource);

        /**保存-问题记录*/
        for (TMcCustomResourceProblemEntity tMcCustomResourceProblem : tMcCustomResourceProblemList) {
            //外键设置
            tMcCustomResourceProblem.setCustomResourceId(tMcCustomResource.getId());
            //外键设置
            tMcCustomResourceProblem.setCreateMonth(tMcCustomResource.getCreateMonth());
            //外键设置
            tMcCustomResourceProblem.setCustomCode(tMcCustomResource.getCustomCode());
            //外键设置
            tMcCustomResourceProblem.setCustomName(tMcCustomResource.getCustomName());
            this.save(tMcCustomResourceProblem);
        }
        //执行新增操作配置的sql增强
        this.doAddSql(tMcCustomResource);
    }


    public void updateMain(TMcCustomResourceEntity tMcCustomResource,
                           List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList) {
        //保存主表信息
        this.saveOrUpdate(tMcCustomResource);
        //===================================================================================
        //获取参数
        Object id0 = tMcCustomResource.getId();
        //===================================================================================
        //1.查询出数据库的明细数据-问题记录
        String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ?";
        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemOldList = this.findHql(hql0, id0);
        //2.筛选更新明细数据-问题记录
        if (tMcCustomResourceProblemList != null && tMcCustomResourceProblemList.size() > 0) {
            for (TMcCustomResourceProblemEntity oldE : tMcCustomResourceProblemOldList) {
                boolean isUpdate = false;
                for (TMcCustomResourceProblemEntity sendE : tMcCustomResourceProblemList) {
                    //需要更新的明细数据-问题记录
                    if (oldE.getId().equals(sendE.getId())) {
                        try {
                            MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
                            String deal = oldE.getDeal();
                            if (StringUtils.equals(deal, "2")) {
                                oldE.setBpmStatus("2");
                                tMcCustomResource.setBpmStatus("2");
                            }
                            if (StringUtils.equals(deal, "1")) {
                                oldE.setBpmStatus("4");
                                tMcCustomResource.setBpmStatus("4");
                            }
                            if (StringUtils.equals(deal, "3")) {
                                oldE.setBpmStatus("5");
                                tMcCustomResource.setBpmStatus("5");
                            }
                            this.saveOrUpdate(oldE);
                        } catch (Exception e) {
                            e.printStackTrace();
                            throw new BusinessException(e.getMessage());
                        }
                        isUpdate = true;
                        break;
                    }
                }
                if (!isUpdate) {
                    //如果数据库存在的明细，前台没有传递过来则是删除-问题记录
                    super.delete(oldE);
                }

            }
            //3.持久化新增的数据-问题记录
            for (TMcCustomResourceProblemEntity tMcCustomResourceProblem : tMcCustomResourceProblemList) {
                String deal = tMcCustomResourceProblem.getDeal();
                String problem = tMcCustomResourceProblem.getProblem();
                String otherDeal = tMcCustomResourceProblem.getOtherDeal();
                String otherProblem = tMcCustomResourceProblem.getOtherProblem();
                String remark = tMcCustomResourceProblem.getRemark();
                boolean isInsert = StringUtils.isNotBlank(deal) || StringUtils.isNotBlank(problem)
                        ||StringUtils.isNotBlank(otherDeal) ||StringUtils.isNotBlank(otherProblem)
                        ||StringUtils.isNotBlank(remark);
                if (isInsert && oConvertUtils.isEmpty(tMcCustomResourceProblem.getId())) {
                    //外键设置
                    tMcCustomResourceProblem.setCustomResourceId(tMcCustomResource.getId());
                    tMcCustomResourceProblem.setCreateMonth(tMcCustomResource.getCreateMonth());
                    tMcCustomResourceProblem.setCustomCode(tMcCustomResource.getCustomCode());
                    tMcCustomResourceProblem.setCustomName(tMcCustomResource.getCustomName());
                    tMcCustomResourceProblem.setCreateBy(tMcCustomResource.getCreateBy());
                    tMcCustomResourceProblem.setCreateName(tMcCustomResource.getCreateName());
                    tMcCustomResourceProblem.setSysOrgCode(tMcCustomResource.getSysOrgCode());
                    tMcCustomResourceProblem.setSysCompanyCode(tMcCustomResource.getSysCompanyCode());
                    tMcCustomResourceProblem.setBpmStatus("1");
                    if (StringUtils.isNotBlank(deal)) {
                        if (StringUtils.equals(deal, "2")) {
                            tMcCustomResourceProblem.setBpmStatus("2");
                            tMcCustomResource.setBpmStatus("2");
                            addWorkOrder(tMcCustomResource);
                        }
                        if (StringUtils.equals(deal, "1")) {
                            tMcCustomResourceProblem.setBpmStatus("4");
                            tMcCustomResource.setBpmStatus("4");
                        }
                        if (StringUtils.equals(deal, "3")) {
                            tMcCustomResourceProblem.setBpmStatus("5");
                            tMcCustomResource.setBpmStatus("5");
                        }
                    }
                    this.save(tMcCustomResourceProblem);
                }
            }
        }
        //执行更新操作配置的sql增强
        this.doUpdateSql(tMcCustomResource);
    }

    private void addWorkOrder(TMcCustomResourceEntity tMcCustomResource) {
        try {
            TMcWorkOrderEntity tMcWorkOrder = new TMcWorkOrderEntity();
            BeanUtils.copyProperties(tMcWorkOrder, tMcCustomResource);
            tMcWorkOrder.setCreateDate(new Date());
            tMcWorkOrder.setWorkOrderType("1");
            tMcWorkOrder.setCustomResourceId(tMcCustomResource.getId());
            String sql = "select count(*) from t_mc_work_order where custom_resource_id = '" + tMcCustomResource.getId() + "'";
            long count = this.getCountForJdbc(sql);
            if (count == 0) {
                this.save(tMcWorkOrder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void delMain(TMcCustomResourceEntity tMcCustomResource) {
        //删除主表信息
        this.delete(tMcCustomResource);
        //===================================================================================
        //获取参数
        Object id0 = tMcCustomResource.getId();
        //===================================================================================
        //删除-问题记录
        String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ?";
        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemOldList = this.findHql(hql0, id0);
        this.deleteAllEntitie(tMcCustomResourceProblemOldList);
        //删除附件
        if(tMcCustomResourceProblemOldList != null && tMcCustomResourceProblemOldList.size()>0){
            List<JformInnerMailAttach> documents = this.findByProperty(JformInnerMailAttach.class, "mailid", tMcCustomResourceProblemOldList.get(0).getId());
            for (JformInnerMailAttach document : documents) {
                jformInnerMailService.deleteFile(document);
            }
        }

        //删除-现场派单
        String hql1 = "from TMcWorkOrderEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ?";
        List<TMcWorkOrderEntity> tMcWorkOrderEntityList = this.findHql(hql1, id0);
        this.deleteAllEntitie(tMcWorkOrderEntityList);
    }


    /**
     * 默认按钮-sql增强-新增操作
     *
     * @return
     */
    public boolean doAddSql(TMcCustomResourceEntity t) {
        return true;
    }

    /**
     * 默认按钮-sql增强-更新操作
     *
     * @return
     */
    public boolean doUpdateSql(TMcCustomResourceEntity t) {
        return true;
    }

    /**
     * 默认按钮-sql增强-删除操作
     *
     * @return
     */
    public boolean doDelSql(TMcCustomResourceEntity t) {
        return true;
    }

    /**
     * 替换sql中的变量
     *
     * @param sql
     * @return
     */
    public String replaceVal(String sql, TMcCustomResourceEntity t) {
        sql = sql.replace("#{id}", String.valueOf(t.getId()));
        sql = sql.replace("#{branch_code}", String.valueOf(t.getBranchCode()));
        sql = sql.replace("#{branch_name}", String.valueOf(t.getBranchName()));
        sql = sql.replace("#{manager}", String.valueOf(t.getManager()));
        sql = sql.replace("#{custom_code}", String.valueOf(t.getCustomCode()));
        sql = sql.replace("#{custom_name}", String.valueOf(t.getCustomName()));
        sql = sql.replace("#{custom_ic}", String.valueOf(t.getCustomIc()));
        sql = sql.replace("#{product_type}", String.valueOf(t.getProductType()));
        sql = sql.replace("#{own_house}", String.valueOf(t.getOwnHouse()));
        sql = sql.replace("#{house_address}", String.valueOf(t.getHouseAddress()));
        sql = sql.replace("#{guaranty}", String.valueOf(t.getGuaranty()));
        sql = sql.replace("#{house_protect}", String.valueOf(t.getHouseProtect()));
        sql = sql.replace("#{transfer_other}", String.valueOf(t.getTransferOther()));
        sql = sql.replace("#{other_name}", String.valueOf(t.getOtherName()));
        sql = sql.replace("#{house_no}", String.valueOf(t.getHouseNo()));
        sql = sql.replace("#{wife_name}", String.valueOf(t.getWifeName()));
        sql = sql.replace("#{wife_ic}", String.valueOf(t.getWifeIc()));
        sql = sql.replace("#{wife_own_house}", String.valueOf(t.getWifeOwnHouse()));
        sql = sql.replace("#{wife_house_address}", String.valueOf(t.getWifeHouseAddress()));
        sql = sql.replace("#{wife_guaranty}", String.valueOf(t.getWifeGuaranty()));
        sql = sql.replace("#{wife_house_protect}", String.valueOf(t.getWifeHouseProtect()));
        sql = sql.replace("#{wife_transfer_other}", String.valueOf(t.getWifeTransferOther()));
        sql = sql.replace("#{wife_other_name}", String.valueOf(t.getWifeOtherName()));
        sql = sql.replace("#{wife_house_no}", String.valueOf(t.getWifeHouseNo()));
        sql = sql.replace("#{create_month}", String.valueOf(t.getCreateMonth()));
        sql = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
        sql = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
        sql = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
        sql = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
        sql = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
        sql = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
        sql = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
        sql = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
        sql = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
        sql = sql.replace("#{UUID}", UUID.randomUUID().toString());
        return sql;
    }
}