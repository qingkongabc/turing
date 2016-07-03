package com.jeecg.tele.service.impl;

import com.jeecg.tele.service.TMcTeleServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.tele.entity.TMcTeleEntity;
import com.jeecg.tele.entity.TMcTeleSubEntity;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;

import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;


@Service("tMcTeleService")
@Transactional
public class TMcTeleServiceImpl extends CommonServiceImpl implements TMcTeleServiceI {

    public <T> void delete(T entity) {
        super.delete(entity);
        //执行删除操作配置的sql增强
        this.doDelSql((TMcTeleEntity) entity);
    }

    public void addMain(TMcTeleEntity tMcTele,
                        List<TMcTeleSubEntity> tMcTeleSubList) {
        //保存主信息
        this.save(tMcTele);

        /**保存-信息补录*/
        for (TMcTeleSubEntity tMcTeleSub : tMcTeleSubList) {
            //外键设置
            tMcTeleSub.setTeleIdFk(tMcTele.getId());
            this.save(tMcTeleSub);
        }
        //执行新增操作配置的sql增强
        this.doAddSql(tMcTele);
    }


    public void updateMain(TMcTeleEntity tMcTele,
                           List<TMcTeleSubEntity> tMcTeleSubList) {
        //保存主表信息
        this.saveOrUpdate(tMcTele);
        //===================================================================================
        //获取参数
        Object id0 = tMcTele.getId();
        //===================================================================================
        //1.查询出数据库的明细数据-信息补录
        String hql0 = "from TMcTeleSubEntity where 1 = 1 AND tELE_ID_FK = ? ";
        List<TMcTeleSubEntity> tMcTeleSubOldList = this.findHql(hql0, id0);
        //2.筛选更新明细数据-信息补录
        if (tMcTeleSubList != null && tMcTeleSubList.size() > 0) {
            for (TMcTeleSubEntity oldE : tMcTeleSubOldList) {
                boolean isUpdate = false;
                for (TMcTeleSubEntity sendE : tMcTeleSubList) {
                    //需要更新的明细数据-信息补录
                    if (oldE.getId().equals(sendE.getId())) {
                        try {
                            MyBeanUtils.copyBeanNotNull2Bean(sendE, oldE);
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
                    //如果数据库存在的明细，前台没有传递过来则是删除-信息补录
                    super.delete(oldE);
                }

            }
            //3.持久化新增的数据-信息补录
            for (TMcTeleSubEntity tMcTeleSub : tMcTeleSubList) {
                if (oConvertUtils.isEmpty(tMcTeleSub.getId())) {
                    //外键设置
                    tMcTeleSub.setTeleIdFk(tMcTele.getId());
                    this.save(tMcTeleSub);
                }
            }
        }
        //执行更新操作配置的sql增强
        this.doUpdateSql(tMcTele);
    }


    public void delMain(TMcTeleEntity tMcTele) {
        //删除主表信息
        this.delete(tMcTele);
        //===================================================================================
        //获取参数
        Object id0 = tMcTele.getId();
        //===================================================================================
        //删除-信息补录
        String hql0 = "from TMcTeleSubEntity where 1 = 1 AND tELE_ID_FK = ? ";
        List<TMcTeleSubEntity> tMcTeleSubOldList = this.findHql(hql0, id0);
        this.deleteAllEntitie(tMcTeleSubOldList);
    }


    /**
     * 默认按钮-sql增强-新增操作
     *
     * @param id
     * @return
     */
    public boolean doAddSql(TMcTeleEntity t) {
        return true;
    }

    /**
     * 默认按钮-sql增强-更新操作
     *
     * @param id
     * @return
     */
    public boolean doUpdateSql(TMcTeleEntity t) {
        return true;
    }

    /**
     * 默认按钮-sql增强-删除操作
     *
     * @param id
     * @return
     */
    public boolean doDelSql(TMcTeleEntity t) {
        return true;
    }

    /**
     * 替换sql中的变量
     *
     * @param sql
     * @return
     */
    public String replaceVal(String sql, TMcTeleEntity t) {
        sql = sql.replace("#{id}", String.valueOf(t.getId()));
        sql = sql.replace("#{create_name}", String.valueOf(t.getCreateName()));
        sql = sql.replace("#{create_by}", String.valueOf(t.getCreateBy()));
        sql = sql.replace("#{create_date}", String.valueOf(t.getCreateDate()));
        sql = sql.replace("#{update_name}", String.valueOf(t.getUpdateName()));
        sql = sql.replace("#{update_by}", String.valueOf(t.getUpdateBy()));
        sql = sql.replace("#{update_date}", String.valueOf(t.getUpdateDate()));
        sql = sql.replace("#{sys_org_code}", String.valueOf(t.getSysOrgCode()));
        sql = sql.replace("#{sys_company_code}", String.valueOf(t.getSysCompanyCode()));
        sql = sql.replace("#{bpm_status}", String.valueOf(t.getBpmStatus()));
        sql = sql.replace("#{data_resource}", String.valueOf(t.getDataResource()));
        sql = sql.replace("#{credential}", String.valueOf(t.getCredential()));
        sql = sql.replace("#{manager}", String.valueOf(t.getManager()));
        sql = sql.replace("#{company_name}", String.valueOf(t.getCompanyName()));
        sql = sql.replace("#{build_date}", String.valueOf(t.getBuildDate()));
        sql = sql.replace("#{business}", String.valueOf(t.getBusiness()));
        sql = sql.replace("#{contract}", String.valueOf(t.getContract()));
        sql = sql.replace("#{address}", String.valueOf(t.getAddress()));
        sql = sql.replace("#{customer_service}", String.valueOf(t.getCustomerService()));
        sql = sql.replace("#{customer_service_id}", String.valueOf(t.getCustomerServiceId()));
        sql = sql.replace("#{custom_name}", String.valueOf(t.getCustomName()));
        sql = sql.replace("#{id_card}", String.valueOf(t.getIdCard()));
        sql = sql.replace("#{custom_id}", String.valueOf(t.getCustomId()));
        sql = sql.replace("#{resource}", String.valueOf(t.getResource()));
        sql = sql.replace("#{loan_balance}", String.valueOf(t.getLoanBalance()));
        sql = sql.replace("#{deposit_balance}", String.valueOf(t.getDepositBalance()));
        sql = sql.replace("#{credit_card}", String.valueOf(t.getCreditCard()));
        sql = sql.replace("#{mobile_bank}", String.valueOf(t.getMobileBank()));
        sql = sql.replace("#{card}", String.valueOf(t.getCard()));
        sql = sql.replace("#{insurance}", String.valueOf(t.getInsurance()));
        sql = sql.replace("#{dd_balance}", String.valueOf(t.getDdBalance()));
        sql = sql.replace("#{funds_rate}", String.valueOf(t.getFundsRate()));
        sql = sql.replace("#{org_name}", String.valueOf(t.getOrgName()));
        sql = sql.replace("#{custom_manager}", String.valueOf(t.getCustomManager()));
        sql = sql.replace("#{UUID}", UUID.randomUUID().toString());
        return sql;
    }
}