package com.jeecg.resourceproblem.controller;
import com.jeecg.resourceproblem.entity.TMcCustomResourceProblem1Entity;
import com.jeecg.resourceproblem.service.TMcCustomResourceProblem1ServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jeecgframework.web.system.pojo.base.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.context.annotation.Scope;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import org.jeecgframework.core.util.ExceptionUtil;

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
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 客户资产问题记录
 * @author onlineGenerator
 * @date 2016-05-15 18:36:12
 * @version V1.0   
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/tMcCustomResourceProblem1Controller")
public class TMcCustomResourceProblem1Controller extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TMcCustomResourceProblem1Controller.class);

	@Autowired
	private TMcCustomResourceProblem1ServiceI tMcCustomResourceProblem1Service;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * 客户资产问题记录列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/resourceproblem/tMcCustomResourceProblem1List");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TMcCustomResourceProblem1Entity.class, dataGrid);
		//查询条件组装器
		String flag = request.getParameter("flag");
		if (StringUtils.isNotBlank(flag)) {
			TSUser u = ResourceUtil.getSessionUserName();
			tMcCustomResourceProblem1.setDealBy(u.getUserName());
			org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHqlWithNoRule(cq, tMcCustomResourceProblem1, request.getParameterMap());
		} else {
			org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcCustomResourceProblem1, request.getParameterMap());
		}
		try {
			//自定义追加查询条件
			String query_createMonth_begin = request.getParameter("createMonth_begin");
			String query_createMonth_end = request.getParameter("createMonth_end");
			if (StringUtil.isNotEmpty(query_createMonth_begin)) {
				cq.ge("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_begin));
			}
			if (StringUtil.isNotEmpty(query_createMonth_end)) {
				cq.le("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_end));
			}
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tMcCustomResourceProblem1Service.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除客户资产问题记录
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		tMcCustomResourceProblem1 = systemService.getEntity(TMcCustomResourceProblem1Entity.class, tMcCustomResourceProblem1.getId());
		message = "客户资产问题记录删除成功";
		try{
			tMcCustomResourceProblem1Service.delete(tMcCustomResourceProblem1);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产问题记录删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除客户资产问题记录
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "客户资产问题记录删除成功";
		try{
			for(String id:ids.split(",")){
				TMcCustomResourceProblem1Entity tMcCustomResourceProblem1 = systemService.getEntity(TMcCustomResourceProblem1Entity.class, 
				id
				);
				tMcCustomResourceProblem1Service.delete(tMcCustomResourceProblem1);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产问题记录删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加客户资产问题记录
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "客户资产问题记录添加成功";
		try{
			tMcCustomResourceProblem1Service.save(tMcCustomResourceProblem1);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "客户资产问题记录添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新客户资产问题记录
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "客户资产问题记录更新成功";
		TMcCustomResourceProblem1Entity t = tMcCustomResourceProblem1Service.get(TMcCustomResourceProblem1Entity.class, tMcCustomResourceProblem1.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tMcCustomResourceProblem1, t);
			tMcCustomResourceProblem1Service.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "客户资产问题记录更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 客户资产问题记录新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcCustomResourceProblem1.getId())) {
			tMcCustomResourceProblem1 = tMcCustomResourceProblem1Service.getEntity(TMcCustomResourceProblem1Entity.class, tMcCustomResourceProblem1.getId());
			req.setAttribute("tMcCustomResourceProblem1Page", tMcCustomResourceProblem1);
		}
		return new ModelAndView("com/jeecg/resourceproblem/tMcCustomResourceProblem1-add");
	}
	/**
	 * 客户资产问题记录编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcCustomResourceProblem1.getId())) {
			tMcCustomResourceProblem1 = tMcCustomResourceProblem1Service.getEntity(TMcCustomResourceProblem1Entity.class, tMcCustomResourceProblem1.getId());
			req.setAttribute("tMcCustomResourceProblem1Page", tMcCustomResourceProblem1);
		}
		return new ModelAndView("com/jeecg/resourceproblem/tMcCustomResourceProblem1-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tMcCustomResourceProblem1Controller");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TMcCustomResourceProblem1Entity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcCustomResourceProblem1, request.getParameterMap());

		//查询条件组装器
		String flag = request.getParameter("flag");
		if (StringUtils.isNotBlank(flag)) {
			TSUser u = ResourceUtil.getSessionUserName();
			tMcCustomResourceProblem1.setDealBy(u.getUserName());
			org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHqlWithNoRule(cq, tMcCustomResourceProblem1, request.getParameterMap());
		} else {
			org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcCustomResourceProblem1, request.getParameterMap());
		}
		try {
			//自定义追加查询条件
			String query_createMonth_begin = request.getParameter("createMonth_begin");
			String query_createMonth_end = request.getParameter("createMonth_end");
			if (StringUtil.isNotEmpty(query_createMonth_begin)) {
				cq.ge("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_begin));
			}
			if (StringUtil.isNotEmpty(query_createMonth_end)) {
				cq.le("createMonth", new SimpleDateFormat("yyyy-MM").parse(query_createMonth_end));
			}
		} catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();

		List<TMcCustomResourceProblem1Entity> tMcCustomResourceProblem1s = this.tMcCustomResourceProblem1Service.getListByCriteriaQuery(cq,false);
		for(TMcCustomResourceProblem1Entity resourceProblem1Entity : tMcCustomResourceProblem1s){
			String problem = resourceProblem1Entity.getProblem()+"";
			String problemVal = "";
			TSTypegroup tsTypegroup = systemService.getTypeGroupByCode("prob_type");
			List<TSType> tsTypeList = tsTypegroup.getTSTypes();
			for (TSType tsType : tsTypeList) {
				if (problem.contains(tsType.getTypecode())){
					problemVal += tsType.getTypename()+",";
				}
			}
			resourceProblem1Entity.setProblemStr(problemVal);

			String deal = resourceProblem1Entity.getDeal()+"";
			String dealVal = "";
			tsTypegroup = systemService.getTypeGroupByCode("deal_type");
			tsTypeList = tsTypegroup.getTSTypes();
			for (TSType tsType : tsTypeList) {
				if (deal.contains(tsType.getTypecode())){
					dealVal += tsType.getTypename()+",";
				}
			}
			resourceProblem1Entity.setDealStr(dealVal);
		}
		modelMap.put(NormalExcelConstants.FILE_NAME,"客户资产问题记录");
		modelMap.put(NormalExcelConstants.CLASS,TMcCustomResourceProblem1Entity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("客户资产问题记录列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tMcCustomResourceProblem1s);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TMcCustomResourceProblem1Entity tMcCustomResourceProblem1,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"客户资产问题记录");
    	modelMap.put(NormalExcelConstants.CLASS,TMcCustomResourceProblem1Entity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("客户资产问题记录列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
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
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<TMcCustomResourceProblem1Entity> listTMcCustomResourceProblem1Entitys = ExcelImportUtil.importExcel(file.getInputStream(),TMcCustomResourceProblem1Entity.class,params);
				for (TMcCustomResourceProblem1Entity tMcCustomResourceProblem1 : listTMcCustomResourceProblem1Entitys) {
					tMcCustomResourceProblem1Service.save(tMcCustomResourceProblem1);
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
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<TMcCustomResourceProblem1Entity> list() {
		List<TMcCustomResourceProblem1Entity> listTMcCustomResourceProblem1s=tMcCustomResourceProblem1Service.getList(TMcCustomResourceProblem1Entity.class);
		return listTMcCustomResourceProblem1s;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TMcCustomResourceProblem1Entity task = tMcCustomResourceProblem1Service.get(TMcCustomResourceProblem1Entity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TMcCustomResourceProblem1Entity tMcCustomResourceProblem1, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcCustomResourceProblem1Entity>> failures = validator.validate(tMcCustomResourceProblem1);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		tMcCustomResourceProblem1Service.save(tMcCustomResourceProblem1);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = tMcCustomResourceProblem1.getId();
		URI uri = uriBuilder.path("/rest/tMcCustomResourceProblem1Controller/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TMcCustomResourceProblem1Entity tMcCustomResourceProblem1) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcCustomResourceProblem1Entity>> failures = validator.validate(tMcCustomResourceProblem1);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		tMcCustomResourceProblem1Service.saveOrUpdate(tMcCustomResourceProblem1);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		tMcCustomResourceProblem1Service.deleteEntityById(TMcCustomResourceProblem1Entity.class, id);
	}
}
