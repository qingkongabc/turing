package com.jeecg.tele.service;

import com.jeecg.tele.entity.TMcTeleEntity;
import com.jeecg.tele.entity.TMcTeleSubEntity;

import java.util.List;

import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TMcTeleServiceI extends CommonService {

    public <T> void delete(T entity);

    /**
     * 添加一对多
     */
    public void addMain(TMcTeleEntity tMcTele,
                        List<TMcTeleSubEntity> tMcTeleSubList);

    /**
     * 修改一对多
     */
    public void updateMain(TMcTeleEntity tMcTele,
                           List<TMcTeleSubEntity> tMcTeleSubList);

    public void delMain(TMcTeleEntity tMcTele);

    /**
     * 默认按钮-sql增强-新增操作
     *
     * @param id
     * @return
     */
    public boolean doAddSql(TMcTeleEntity t);

    /**
     * 默认按钮-sql增强-更新操作
     *
     * @param id
     * @return
     */
    public boolean doUpdateSql(TMcTeleEntity t);

    /**
     * 默认按钮-sql增强-删除操作
     *
     * @param id
     * @return
     */
    public boolean doDelSql(TMcTeleEntity t);
}
