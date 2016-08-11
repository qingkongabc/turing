package com.jeecg.workorder.controller;
import com.jeecg.resource.entity.TMcCustomResourceProblemEntity;
import com.jeecg.resourceproblem.entity.TMcCustomResourceProblem1Entity;
import com.jeecg.workorder.entity.TMcWorkOrderEntity;
import com.jeecg.workorder.service.TMcWorkOrderServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.jeecgframework.web.system.pojo.base.TSType;
import org.jeecgframework.web.system.pojo.base.TSTypegroup;
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
import org.jeecgframework.web.system.pojo.base.TSDepart;
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
 * @Description: 现场派单
 * @author onlineGenerator
 * @date 2016-05-15 23:26:07
 * @version V1.0   
 *
 */
@Scope("prototype")
@Controller
@RequestMapping("/tMcWorkOrderController")
public class TMcWorkOrderController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TMcWorkOrderController.class);

	@Autowired
	private TMcWorkOrderServiceI tMcWorkOrderService;
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
	 * 现场派单列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/workorder/tMcWorkOrderList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TMcWorkOrderEntity tMcWorkOrder,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TMcWorkOrderEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcWorkOrder, request.getParameterMap());
		try{
			//自定义追加查询条件
			String query_createDate_begin = request.getParameter("createDate_begin");
			String query_createDate_end = request.getParameter("createDate_end");
			if(StringUtil.isNotEmpty(query_createDate_begin)){
				cq.ge("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_begin));
			}
			if(StringUtil.isNotEmpty(query_createDate_end)){
				cq.le("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_end));
			}
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
		this.tMcWorkOrderService.getDataGridReturn(cq, true);
		List<TMcWorkOrderEntity> workOrderEntities = dataGrid.getResults();
		for (TMcWorkOrderEntity workOrderEntity : workOrderEntities) {
			String id = workOrderEntity.getCustomResourceId();
			TMcCustomResourceProblemEntity entity = systemService.findUniqueByProperty(TMcCustomResourceProblemEntity.class,"customResourceId",id);
            workOrderEntity.setProblem(entity.getProblemStr());
		}
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除现场派单
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TMcWorkOrderEntity tMcWorkOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		tMcWorkOrder = systemService.getEntity(TMcWorkOrderEntity.class, tMcWorkOrder.getId());
		message = "现场派单删除成功";
		try{
			tMcWorkOrderService.delete(tMcWorkOrder);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "现场派单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除现场派单
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		message = "现场派单删除成功";
		try{
			for(String id:ids.split(",")){
				TMcWorkOrderEntity tMcWorkOrder = systemService.getEntity(TMcWorkOrderEntity.class, 
				id
				);
				tMcWorkOrderService.delete(tMcWorkOrder);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "现场派单删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加现场派单
	 * 
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TMcWorkOrderEntity tMcWorkOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "现场派单添加成功";
		try{
			tMcWorkOrderService.save(tMcWorkOrder);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "现场派单添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新现场派单
	 * 
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TMcWorkOrderEntity tMcWorkOrder, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		message = "现场派单更新成功";
		TMcWorkOrderEntity t = tMcWorkOrderService.get(TMcWorkOrderEntity.class, tMcWorkOrder.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tMcWorkOrder, t);
			tMcWorkOrderService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "现场派单更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 现场派单新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TMcWorkOrderEntity tMcWorkOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcWorkOrder.getId())) {
			tMcWorkOrder = tMcWorkOrderService.getEntity(TMcWorkOrderEntity.class, tMcWorkOrder.getId());
			req.setAttribute("tMcWorkOrderPage", tMcWorkOrder);
		}
		return new ModelAndView("com/jeecg/workorder/tMcWorkOrder-add");
	}
	/**
	 * 现场派单编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TMcWorkOrderEntity tMcWorkOrder, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tMcWorkOrder.getId())) {
			tMcWorkOrder = tMcWorkOrderService.getEntity(TMcWorkOrderEntity.class, tMcWorkOrder.getId());
			req.setAttribute("tMcWorkOrderPage", tMcWorkOrder);
		}
		return new ModelAndView("com/jeecg/workorder/tMcWorkOrder-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tMcWorkOrderController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TMcWorkOrderEntity tMcWorkOrder,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TMcWorkOrderEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcWorkOrder, request.getParameterMap());
		try {
			//自定义追加查询条件
			String query_createDate_begin = request.getParameter("createDate_begin");
			String query_createDate_end = request.getParameter("createDate_end");
			if (StringUtil.isNotEmpty(query_createDate_begin)) {
				cq.ge("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_begin));
			}
			if (StringUtil.isNotEmpty(query_createDate_end)) {
				cq.le("createDate", new SimpleDateFormat("yyyy-MM-dd").parse(query_createDate_end));
			}
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
		List<TMcWorkOrderEntity> tMcWorkOrders = this.tMcWorkOrderService.getListByCriteriaQuery(cq,false);
		for(TMcWorkOrderEntity workOrderEntity : tMcWorkOrders){
			String type = workOrderEntity.getWorkOrderType();
			String typeVal = "";
			TSTypegroup tsTypegroup = systemService.getTypeGroupByCode("wo_option");
			List<TSType> tsTypeList = tsTypegroup.getTSTypes();
			for (TSType tsType : tsTypeList) {
				if (type.contains(tsType.getTypecode())){
					typeVal += tsType.getTypename()+",";
				}
			}
			workOrderEntity.setWorkOrderTypeStr(typeVal);

            String id = workOrderEntity.getCustomResourceId();
            TMcCustomResourceProblemEntity entity = systemService.findUniqueByProperty(TMcCustomResourceProblemEntity.class,"customResourceId",id);
            workOrderEntity.setProblem(entity.getProblemStr());
		}
		modelMap.put(NormalExcelConstants.FILE_NAME,"现场派单");
		modelMap.put(NormalExcelConstants.CLASS,TMcWorkOrderEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("现场派单列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tMcWorkOrders);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TMcWorkOrderEntity tMcWorkOrder,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"现场派单");
    	modelMap.put(NormalExcelConstants.CLASS,TMcWorkOrderEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("现场派单列表", "导出人:"+ResourceUtil.getSessionUserName().getRealName(),
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
				List<TMcWorkOrderEntity> listTMcWorkOrderEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TMcWorkOrderEntity.class,params);
				for (TMcWorkOrderEntity tMcWorkOrder : listTMcWorkOrderEntitys) {
					tMcWorkOrderService.save(tMcWorkOrder);
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
	public List<TMcWorkOrderEntity> list() {
		List<TMcWorkOrderEntity> listTMcWorkOrders=tMcWorkOrderService.getList(TMcWorkOrderEntity.class);
		return listTMcWorkOrders;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		TMcWorkOrderEntity task = tMcWorkOrderService.get(TMcWorkOrderEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody TMcWorkOrderEntity tMcWorkOrder, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcWorkOrderEntity>> failures = validator.validate(tMcWorkOrder);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		tMcWorkOrderService.save(tMcWorkOrder);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = tMcWorkOrder.getId();
		URI uri = uriBuilder.path("/rest/tMcWorkOrderController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody TMcWorkOrderEntity tMcWorkOrder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TMcWorkOrderEntity>> failures = validator.validate(tMcWorkOrder);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		tMcWorkOrderService.saveOrUpdate(tMcWorkOrder);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		tMcWorkOrderService.deleteEntityById(TMcWorkOrderEntity.class, id);
	}
}
