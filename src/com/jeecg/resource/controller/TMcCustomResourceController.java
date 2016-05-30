package com.jeecg.resource.controller;
import com.jeecg.resource.entity.TMcCustomResourceEntity;
import com.jeecg.resource.service.TMcCustomResourceServiceI;
import com.jeecg.resource.page.TMcCustomResourcePage;
import com.jeecg.resource.entity.TMcCustomResourceProblemEntity;

import java.util.*;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeecg.workorder.entity.TMcWorkOrderEntity;
import com.jeecg.workorder.service.TMcWorkOrderServiceI;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 客户资产
 * @author onlineGenerator
 * @date 2016-05-15 17:14:14
 * @version V1.0   
 *
 */
@Scope("prototype") 
@Controller
@RequestMapping("/tMcCustomResourceController")
public class TMcCustomResourceController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TMcCustomResourceController.class);

	@Autowired
	private TMcCustomResourceServiceI tMcCustomResourceService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	@Autowired
	private TMcWorkOrderServiceI tMcWorkOrderService;

	/**
	 * 客户资产列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/resource/tMcCustomResourceList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TMcCustomResourceEntity tMcCustomResource,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TMcCustomResourceEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcCustomResource);
		try{
		//自定义追加查询条件
		String query_createMonth_begin = request.getParameter("createMonth_begin");
		String query_createMonth_end = request.getParameter("createMonth_end");
		if(StringUtil.isNotEmpty(query_createMonth_begin)){
			cq.ge("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_begin));
		}
		if(StringUtil.isNotEmpty(query_createMonth_end)){
			cq.le("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_end));
		}
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tMcCustomResourceService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除客户资产
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TMcCustomResourceEntity tMcCustomResource, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		tMcCustomResource = systemService.getEntity(TMcCustomResourceEntity.class, tMcCustomResource.getId());
		String message = "客户资产删除成功";
		try{
			tMcCustomResourceService.delMain(tMcCustomResource);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除客户资产
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "客户资产删除成功";
		try{
			for(String id:ids.split(",")){
				TMcCustomResourceEntity tMcCustomResource = systemService.getEntity(TMcCustomResourceEntity.class,
				id
				);
				tMcCustomResourceService.delMain(tMcCustomResource);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加客户资产
	 * 
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TMcCustomResourceEntity tMcCustomResource,TMcCustomResourcePage tMcCustomResourcePage, HttpServletRequest request) {
		List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList =  tMcCustomResourcePage.getTMcCustomResourceProblemList();
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try{
			tMcCustomResourceService.addMain(tMcCustomResource, tMcCustomResourceProblemList);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 更新客户资产
	 * 
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TMcCustomResourceEntity tMcCustomResource,TMcCustomResourcePage tMcCustomResourcePage, HttpServletRequest request) {
		List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList =  tMcCustomResourcePage.getTMcCustomResourceProblemList();
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			tMcCustomResourceService.updateMain(tMcCustomResource, tMcCustomResourceProblemList);

			TMcCustomResourceProblemEntity problem = tMcCustomResourceProblemList.get(0);
			if(null != problem){
				String deal = problem.getDeal();
				if(StringUtils.isNotBlank(deal)){
					TMcWorkOrderEntity tMcWorkOrder = new TMcWorkOrderEntity();
					BeanUtils.copyProperties(tMcWorkOrder,tMcCustomResource);
					tMcWorkOrder.setCreateDate(new Date());
					tMcWorkOrder.setWorkOrderType("1");
					tMcWorkOrder.setCustomResourceId(tMcCustomResource.getId());
					String sql = "select count(*) from t_mc_work_order where custom_resource_id = '"+tMcCustomResource.getId()+"'";
					long count = tMcWorkOrderService.getCountForJdbc(sql);
					if(count == 0){
						tMcWorkOrderService.save(tMcWorkOrder);
					}
				}
			}

			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新客户资产失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 客户资产新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TMcCustomResourceEntity tMcCustomResource, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcCustomResource.getId())) {
			tMcCustomResource = tMcCustomResourceService.getEntity(TMcCustomResourceEntity.class, tMcCustomResource.getId());
			req.setAttribute("tMcCustomResourcePage", tMcCustomResource);
		}
		req.setAttribute("createMonth", new Date());
		return new ModelAndView("com/jeecg/resource/tMcCustomResource-add");
	}
	
	/**
	 * 客户资产编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TMcCustomResourceEntity tMcCustomResource, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcCustomResource.getId())) {
			tMcCustomResource = tMcCustomResourceService.getEntity(TMcCustomResourceEntity.class, tMcCustomResource.getId());
			req.setAttribute("tMcCustomResourcePage", tMcCustomResource);
		}
		return new ModelAndView("com/jeecg/resource/tMcCustomResource-update");
	}
	
	
	/**
	 * 加载明细列表[问题记录]
	 * 
	 * @return
	 */
	@RequestMapping(params = "tMcCustomResourceProblemList")
	public ModelAndView tMcCustomResourceProblemList(TMcCustomResourceEntity tMcCustomResource, HttpServletRequest req) {
	
		//===================================================================================
		//获取参数
		Object id0 = tMcCustomResource.getId();
		//===================================================================================
		//查询-问题记录
	    String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ? ";
	    try{
	    	List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemEntityList = systemService.findHql(hql0,id0);
			req.setAttribute("tMcCustomResourceProblemList", tMcCustomResourceProblemEntityList);
		}catch(Exception e){
			logger.info(e.getMessage());
		}
		return new ModelAndView("com/jeecg/resource/tMcCustomResourceProblemList");
	}

    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TMcCustomResourceEntity tMcCustomResource,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TMcCustomResourceEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcCustomResource);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TMcCustomResourceEntity> list=this.tMcCustomResourceService.getListByCriteriaQuery(cq, false);
    	List<TMcCustomResourcePage> pageList=new ArrayList<TMcCustomResourcePage>();
        if(list!=null&&list.size()>0){
        	for(TMcCustomResourceEntity entity:list){
        		try{
        		TMcCustomResourcePage page=new TMcCustomResourcePage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            	    Object id0 = entity.getId();
           		    Object cREATE_MONTH0 = entity.getCreateMonth();
           		    Object cUSTOM_CODE0 = entity.getCustomCode();
           		    Object cUSTOM_NAME0 = entity.getCustomName();
				    String hql0 = "from TMcCustomResourceProblemEntity where 1 = 1 AND cUSTOM_RESOURCE_ID = ?  AND cREATE_MONTH = ?  AND cUSTOM_CODE = ?  AND cUSTOM_NAME = ? ";
        	        List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemEntityList = systemService.findHql(hql0,id0,cREATE_MONTH0,cUSTOM_CODE0,cUSTOM_NAME0);
            		page.setTMcCustomResourceProblemList(tMcCustomResourceProblemEntityList);
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"客户资产");
        map.put(NormalExcelConstants.CLASS,TMcCustomResourcePage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("客户资产列表", "导出人:Jeecg",
            "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST,pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

    /**
	 * 通过excel导入数据
	 * @param request
	 * @param
	 * @return
	 */
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(2);
			params.setNeedSave(true);
			try {
				List<TMcCustomResourcePage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TMcCustomResourcePage.class, params);
				TMcCustomResourceEntity entity1=null;
				for (TMcCustomResourcePage page : list) {
					entity1=new TMcCustomResourceEntity();
					MyBeanUtils.copyBeanNotNull2Bean(page,entity1);
		            tMcCustomResourceService.addMain(entity1, new ArrayList<TMcCustomResourceProblemEntity>());
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			}
			return j;
	}
	/**
	* 导出excel 使模板
	*/
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ModelMap map) {
		map.put(NormalExcelConstants.FILE_NAME,"客户资产");
		map.put(NormalExcelConstants.CLASS,TMcCustomResourcePage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("客户资产列表", "导出人:"+ ResourceUtil.getSessionUserName().getRealName(),
		"导出信息"));
		map.put(NormalExcelConstants.DATA_LIST,new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	* 导入功能跳转
	*
	* @return
	*/
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "tMcCustomResourceController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TMcCustomResourceEntity> list() {
		List<TMcCustomResourceEntity> listTMcCustomResources=tMcCustomResourceService.getList(TMcCustomResourceEntity.class);
		return listTMcCustomResources;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TMcCustomResourceEntity task = tMcCustomResourceService.get(TMcCustomResourceEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TMcCustomResourcePage tMcCustomResourcePage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcCustomResourcePage>> failures = validator.validate(tMcCustomResourcePage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList =  tMcCustomResourcePage.getTMcCustomResourceProblemList();
		
		TMcCustomResourceEntity tMcCustomResource = new TMcCustomResourceEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(tMcCustomResource,tMcCustomResourcePage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		tMcCustomResourceService.addMain(tMcCustomResource, tMcCustomResourceProblemList);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = tMcCustomResourcePage.getId();
		URI uri = uriBuilder.path("/rest/tMcCustomResourceController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TMcCustomResourcePage tMcCustomResourcePage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcCustomResourcePage>> failures = validator.validate(tMcCustomResourcePage);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList =  tMcCustomResourcePage.getTMcCustomResourceProblemList();
		
		TMcCustomResourceEntity tMcCustomResource = new TMcCustomResourceEntity();
		try{
			MyBeanUtils.copyBeanNotNull2Bean(tMcCustomResource,tMcCustomResourcePage);
		}catch(Exception e){
            logger.info(e.getMessage());
        }
		tMcCustomResourceService.updateMain(tMcCustomResource, tMcCustomResourceProblemList);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		TMcCustomResourceEntity tMcCustomResource = tMcCustomResourceService.get(TMcCustomResourceEntity.class, id);
		tMcCustomResourceService.delMain(tMcCustomResource);
	}
}
