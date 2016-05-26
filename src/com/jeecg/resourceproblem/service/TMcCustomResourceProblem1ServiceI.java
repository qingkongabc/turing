package com.jeecg.resourceproblem.service;
import com.jeecg.resourceproblem.entity.TMcCustomResourceProblem1Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TMcCustomResourceProblem1ServiceI extends CommonService{
	
 	public <T> void delete(T entity);
 	
 	public <T> Serializable save(T entity);
 	
 	public <T> void saveOrUpdate(T entity);
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TMcCustomResourceProblem1Entity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TMcCustomResourceProblem1Entity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TMcCustomResourceProblem1Entity t);
}
