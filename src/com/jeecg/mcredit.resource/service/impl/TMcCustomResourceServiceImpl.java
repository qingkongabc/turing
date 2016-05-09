package com.jeecg.mcredit.resource.service.impl;
import com.jeecg.mcredit.resource.service.TMcCustomResourceServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.mcredit.resource.entity.TMcCustomResourceEntity;
import com.jeecg.mcredit.resource.entity.TMcCustomResourceProblemEntity;

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


@Service("tMcCustomResourceService")
@Transactional
public class TMcCustomResourceServiceImpl extends CommonServiceImpl implements TMcCustomResourceServiceI {
	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TMcCustomResourceEntity)entity);
 	}
	
	public void addMain(TMcCustomResourceEntity tMcCustomResource,
	        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList){
			//保存主信息
			this.save(tMcCustomResource);
		
			/**保存-问题记录*/
			for(TMcCustomResourceProblemEntity tMcCustomResourceProblem:tMcCustomResourceProblemList){
				//外键设置
				tMcCustomResourceProblem.setCustomResourceId(tMcCustomResource.getId());
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
	    String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ? ";
	    List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemOldList = this.findHql(hql0,id0);
		//2.筛选更新明细数据-问题记录
		if(tMcCustomResourceProblemList!=null&&tMcCustomResourceProblemList.size()>0){
		for(TMcCustomResourceProblemEntity oldE:tMcCustomResourceProblemOldList){
			boolean isUpdate = false;
				for(TMcCustomResourceProblemEntity sendE:tMcCustomResourceProblemList){
					//需要更新的明细数据-问题记录
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-问题记录
		    		super.delete(oldE);
	    		}
	    		
			}
			//3.持久化新增的数据-问题记录
			for(TMcCustomResourceProblemEntity tMcCustomResourceProblem:tMcCustomResourceProblemList){
				if(oConvertUtils.isEmpty(tMcCustomResourceProblem.getId())){
					//外键设置
					tMcCustomResourceProblem.setCustomResourceId(tMcCustomResource.getId());
					this.save(tMcCustomResourceProblem);
				}
			}
		}
		//执行更新操作配置的sql增强
 		this.doUpdateSql(tMcCustomResource);
	}

	
	public void delMain(TMcCustomResourceEntity tMcCustomResource) {
		//删除主表信息
		this.delete(tMcCustomResource);
		//===================================================================================
		//获取参数
		Object id0 = tMcCustomResource.getId();
		//===================================================================================
		//删除-问题记录
	    String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ? ";
	    List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(tMcCustomResourceProblemOldList);
	}
	
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TMcCustomResourceEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TMcCustomResourceEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TMcCustomResourceEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TMcCustomResourceEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{branch_code}",String.valueOf(t.getBranchCode()));
 		sql  = sql.replace("#{branch_name}",String.valueOf(t.getBranchName()));
 		sql  = sql.replace("#{manager}",String.valueOf(t.getManager()));
 		sql  = sql.replace("#{custom_code}",String.valueOf(t.getCustomCode()));
 		sql  = sql.replace("#{custom_name}",String.valueOf(t.getCustomName()));
 		sql  = sql.replace("#{custom_ic}",String.valueOf(t.getCustomIc()));
 		sql  = sql.replace("#{product_type}",String.valueOf(t.getProductType()));
 		sql  = sql.replace("#{own_house}",String.valueOf(t.getOwnHouse()));
 		sql  = sql.replace("#{house_address}",String.valueOf(t.getHouseAddress()));
 		sql  = sql.replace("#{guaranty}",String.valueOf(t.getGuaranty()));
 		sql  = sql.replace("#{house_protect}",String.valueOf(t.getHouseProtect()));
 		sql  = sql.replace("#{transfer_other}",String.valueOf(t.getTransferOther()));
 		sql  = sql.replace("#{other_name}",String.valueOf(t.getOtherName()));
 		sql  = sql.replace("#{house_no}",String.valueOf(t.getHouseNo()));
 		sql  = sql.replace("#{wife_name}",String.valueOf(t.getWifeName()));
 		sql  = sql.replace("#{wife_ic}",String.valueOf(t.getWifeIc()));
 		sql  = sql.replace("#{wife_own_house}",String.valueOf(t.getWifeOwnHouse()));
 		sql  = sql.replace("#{wife_house_address}",String.valueOf(t.getWifeHouseAddress()));
 		sql  = sql.replace("#{wife_guaranty}",String.valueOf(t.getWifeGuaranty()));
 		sql  = sql.replace("#{wife_house_protect}",String.valueOf(t.getWifeHouseProtect()));
 		sql  = sql.replace("#{wife_transfer_other}",String.valueOf(t.getWifeTransferOther()));
 		sql  = sql.replace("#{wife_other_name}",String.valueOf(t.getWifeOtherName()));
 		sql  = sql.replace("#{wife_house_no}",String.valueOf(t.getWifeHouseNo()));
 		sql  = sql.replace("#{create_month}",String.valueOf(t.getCreateMonth()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}