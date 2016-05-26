package com.jeecg.resourceproblem.service.impl;
import com.jeecg.resourceproblem.service.TMcCustomResourceProblem1ServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.resourceproblem.entity.TMcCustomResourceProblem1Entity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.UUID;
import java.io.Serializable;

@Service("tMcCustomResourceProblem1Service")
@Transactional
public class TMcCustomResourceProblem1ServiceImpl extends CommonServiceImpl implements TMcCustomResourceProblem1ServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((TMcCustomResourceProblem1Entity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((TMcCustomResourceProblem1Entity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((TMcCustomResourceProblem1Entity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TMcCustomResourceProblem1Entity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TMcCustomResourceProblem1Entity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TMcCustomResourceProblem1Entity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,TMcCustomResourceProblem1Entity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{custom_resource_id}",String.valueOf(t.getCustomResourceId()));
 		sql  = sql.replace("#{problem}",String.valueOf(t.getProblem()));
 		sql  = sql.replace("#{other_problem}",String.valueOf(t.getOtherProblem()));
 		sql  = sql.replace("#{remark}",String.valueOf(t.getRemark()));
 		sql  = sql.replace("#{deal}",String.valueOf(t.getDeal()));
 		sql  = sql.replace("#{other_deal}",String.valueOf(t.getOtherDeal()));
 		sql  = sql.replace("#{create_month}",String.valueOf(t.getCreateMonth()));
 		sql  = sql.replace("#{custom_code}",String.valueOf(t.getCustomCode()));
 		sql  = sql.replace("#{custom_name}",String.valueOf(t.getCustomName()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}