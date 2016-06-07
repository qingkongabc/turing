package com.jeecg.workorder.service.impl;
import com.jeecg.workorder.service.TMcWorkOrderServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.workorder.entity.TMcWorkOrderEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("tMcWorkOrderService")
@Transactional
public class TMcWorkOrderServiceImpl extends CommonServiceImpl implements TMcWorkOrderServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TMcWorkOrderEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((TMcWorkOrderEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((TMcWorkOrderEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TMcWorkOrderEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TMcWorkOrderEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TMcWorkOrderEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TMcWorkOrderEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{create_month}",String.valueOf(t.getCreateMonth()));
 		sql  = sql.replace("#{branch_name}",String.valueOf(t.getBranchName()));
 		sql  = sql.replace("#{manager}",String.valueOf(t.getManager()));
 		sql  = sql.replace("#{custom_code}",String.valueOf(t.getCustomCode()));
 		sql  = sql.replace("#{custom_name}",String.valueOf(t.getCustomName()));
 		sql  = sql.replace("#{custom_ic}",String.valueOf(t.getCustomIc()));
 		sql  = sql.replace("#{own_house}",String.valueOf(t.getOwnHouse()));
 		sql  = sql.replace("#{work_order_type}",String.valueOf(t.getWorkOrderType()));
 		sql  = sql.replace("#{branch_code}",String.valueOf(t.getBranchCode()));
 		sql  = sql.replace("#{custom_resource_id}",String.valueOf(t.getCustomResourceId()));
		sql = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
		sql = sql.replace("#{create_by}",String.valueOf(t.getCreateBy()));
		sql = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
		sql = sql.replace("#{update_by}",String.valueOf(t.getUpdateBy()));
		sql = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
		sql = sql.replace("#{sys_org_code}",String.valueOf(t.getSysOrgCode()));
		sql = sql.replace("#{sys_company_code}",String.valueOf(t.getSysCompanyCode()));
		sql = sql.replace("#{bpm_status}",String.valueOf(t.getBpmStatus()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}