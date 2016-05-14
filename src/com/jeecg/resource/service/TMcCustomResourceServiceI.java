package com.jeecg.resource.service;
import com.jeecg.resource.entity.TMcCustomResourceEntity;
import com.jeecg.resource.entity.TMcCustomResourceProblemEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TMcCustomResourceServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TMcCustomResourceEntity tMcCustomResource,
	        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TMcCustomResourceEntity tMcCustomResource,
	        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList);
	public void delMain (TMcCustomResourceEntity tMcCustomResource);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TMcCustomResourceEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TMcCustomResourceEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TMcCustomResourceEntity t);
}
