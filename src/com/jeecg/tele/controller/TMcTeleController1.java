package com.jeecg.tele.controller;

import com.jeecg.tele.entity.TMcTeleEntity;
import com.jeecg.tele.entity.TMcTeleSubEntity;
import com.jeecg.tele.page.TMcTelePage;
import com.jeecg.tele.page.TMcTelePage1;
import com.jeecg.tele.page.TMcTelePage2;
import com.jeecg.tele.service.TMcTeleServiceI;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.ExceptionUtil;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.ResourceUtil;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSUser;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author onlineGenerator
 * @version V1.0
 * @Title: Controller
 * @Description: 客群信息
 * @date 2016-06-30 21:28:28
 */
@Scope("prototype")
@Controller
@RequestMapping("/tMcTeleController1")
public class TMcTeleController1 extends BaseController {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger.getLogger(TMcTeleController1.class);

    @Autowired
    private TMcTeleServiceI tMcTeleService;
    @Autowired
    private SystemService systemService;
    @Autowired
    private Validator validator;

    /**
     * 客群信息列表 页面跳转
     *
     * @return
     */
    @RequestMapping(params = "list")
    public ModelAndView list(HttpServletRequest request) {
        return new ModelAndView("com/jeecg/tele/tMcTeleList1");
    }

    /**
     * easyui AJAX请求数据
     *
     * @param request
     * @param response
     * @param dataGrid
     */

    @RequestMapping(params = "datagrid")
    public void datagrid(TMcTeleEntity tMcTele, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
        CriteriaQuery cq = new CriteriaQuery(TMcTeleEntity.class, dataGrid);
        //查询条件组装器
        org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcTele);
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
            //cq.isNotNull("idCard");
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
        cq.add();
        this.tMcTeleService.getDataGridReturn(cq, true);
        TagUtil.datagrid(response, dataGrid);
    }

    /**
     * 删除客群信息
     *
     * @return
     */
    @RequestMapping(params = "doDel")
    @ResponseBody
    public AjaxJson doDel(TMcTeleEntity tMcTele, HttpServletRequest request) {
        AjaxJson j = new AjaxJson();
        tMcTele = systemService.getEntity(TMcTeleEntity.class, tMcTele.getId());
        String message = "客群信息删除成功";
        try {
            tMcTeleService.delMain(tMcTele);
            systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
        } catch (Exception e) {
            e.printStackTrace();
            message = "客群信息删除失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

    /**
     * 批量删除客群信息
     *
     * @return
     */
    @RequestMapping(params = "doBatchDel")
    @ResponseBody
    public AjaxJson doBatchDel(String ids, HttpServletRequest request) {
        AjaxJson j = new AjaxJson();
        String message = "客群信息删除成功";
        try {
            for (String id : ids.split(",")) {
                TMcTeleEntity tMcTele = systemService.getEntity(TMcTeleEntity.class,
                        id
                );
                tMcTeleService.delMain(tMcTele);
                systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
            }
        } catch (Exception e) {
            e.printStackTrace();
            message = "客群信息删除失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

    /**
     * 更新客群信息
     *
     * @return
     */
    @RequestMapping(params = "doUpdate")
    @ResponseBody
    public AjaxJson doUpdate(TMcTeleEntity tMcTele, TMcTelePage tMcTelePage, HttpServletRequest request) {
        List<TMcTeleSubEntity> tMcTeleSubList = tMcTelePage.getTMcTeleSubList();
        AjaxJson j = new AjaxJson();
        String message = "更新成功";
        try {
            tMcTeleService.updateMain(tMcTele, tMcTeleSubList);
            systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
        } catch (Exception e) {
            e.printStackTrace();
            message = "更新客群信息失败";
            throw new BusinessException(e.getMessage());
        }
        j.setMsg(message);
        return j;
    }

    /**
     * 客群信息编辑页面跳转
     *
     * @return
     */
    @RequestMapping(params = "goUpdate")
    public ModelAndView goUpdate(TMcTeleEntity tMcTele, HttpServletRequest req) {
        if (StringUtil.isNotEmpty(tMcTele.getId())) {
            tMcTele = tMcTeleService.getEntity(TMcTeleEntity.class, tMcTele.getId());
            req.setAttribute("tMcTelePage", tMcTele);
        }
        return new ModelAndView("com/jeecg/tele/tMcTele-update1");
    }


    /**
     * 加载明细列表[信息补录]
     *
     * @return
     */
    @RequestMapping(params = "tMcTeleSubList")
    public ModelAndView tMcTeleSubList(TMcTeleEntity tMcTele, HttpServletRequest req) {

        //===================================================================================
        //获取参数
        Object id0 = tMcTele.getId();
        //===================================================================================
        //查询-信息补录
        String hql0 = "from TMcTeleSubEntity where 1 = 1 AND tELE_ID_FK = ? ";
        try {
            List<TMcTeleSubEntity> tMcTeleSubEntityList = systemService.findHql(hql0, id0);
            req.setAttribute("tMcTeleSubList", tMcTeleSubEntityList);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        return new ModelAndView("com/jeecg/tele/tMcTeleSubList1");
    }

    /**
     * 导出excel
     *
     * @param request
     * @param response
     */
    @RequestMapping(params = "exportXls")
    public String exportXls(TMcTeleEntity tMcTele, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid, ModelMap map) {
        CriteriaQuery cq = new CriteriaQuery(TMcTeleEntity.class, dataGrid);
        //查询条件组装器
        org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tMcTele);
        try {
            //自定义追加查询条件
            //cq.isNotNull("customName");
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
        cq.add();
        List<TMcTeleEntity> list = this.tMcTeleService.getListByCriteriaQuery(cq, false);
        List<TMcTelePage2> pageList = new ArrayList<TMcTelePage2>();
        if (list != null && list.size() > 0) {
            for (TMcTeleEntity entity : list) {
                System.out.printf("=======================" + entity.getCustomName() + "======" + StringUtils.isBlank(entity.getCustomName()));
                try {
                    TMcTelePage2 page = new TMcTelePage2();
                    MyBeanUtils.copyBeanNotNull2Bean(entity, page);
                    Object id0 = entity.getId();
                    String hql0 = "from TMcTeleSubEntity where 1 = 1 AND tELE_ID_FK = ? ";
                    List<TMcTeleSubEntity> tMcTeleSubEntityList = systemService.findHql(hql0, id0);
                    page.setTMcTeleSubList(tMcTeleSubEntityList);
                    pageList.add(page);
                } catch (Exception e) {
                    logger.info(e.getMessage());
                }
            }
        }
        map.put(NormalExcelConstants.FILE_NAME, "客户价值");
        map.put(NormalExcelConstants.CLASS, TMcTelePage2.class);
        map.put(NormalExcelConstants.PARAMS, new ExportParams("客户价值列表", "导出人:" + ResourceUtil.getSessionUserName().getRealName(),
                "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST, pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
    }

    /**
     * 通过excel导入数据
     *
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
            params.setHeadRows(1);
            params.setNeedSave(true);
            try {
                List<TMcTelePage1> list = ExcelImportUtil.importExcel(file.getInputStream(), TMcTelePage1.class, params);
                TMcTeleEntity entity1 = null;
                int count = 0;
                for (TMcTelePage1 page : list) {
                    entity1 = new TMcTeleEntity();
                    MyBeanUtils.copyBeanNotNull2Bean(page, entity1);
                    String contract = page.getContract();
                    String hql = "from TMcTeleEntity where 1 = 1 AND contract = ? ";
                    List<TMcTeleEntity> tMcTeleEntityList = systemService.findHql(hql, contract);
                    if (tMcTeleEntityList.size() > 0) {
                        TMcTeleEntity tMcTeleEntity = tMcTeleEntityList.get(0);
                        MyBeanUtils.copyBeanNotNull2Bean(entity1, tMcTeleEntity);
                        tMcTeleService.saveOrUpdate(tMcTeleEntity);
                    } else {
                        count++;
                    }
                }
                if (list.size() != count) {
                    j.setMsg("文件导入成功,有" + count + "条记录未匹配!");
                } else {
                    j.setMsg("文件导入失败,记录全部无法匹配!");
                }
            } catch (Exception e) {
                j.setMsg("文件导入失败！");
                logger.error(ExceptionUtil.getExceptionMessage(e));
            } finally {
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
        map.put(NormalExcelConstants.FILE_NAME, "客户价值");
        map.put(NormalExcelConstants.CLASS, TMcTelePage1.class);
        map.put(NormalExcelConstants.PARAMS, new ExportParams("客户价值列表", "导出人:" + ResourceUtil.getSessionUserName().getRealName(),
                "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST, new ArrayList());
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
    }

    /**
     * 导入功能跳转
     *
     * @return
     */
    @RequestMapping(params = "upload")
    public ModelAndView upload(HttpServletRequest req) {
        req.setAttribute("controller_name", "tMcTeleController1");
        return new ModelAndView("common/upload/pub_excel_upload");
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<TMcTeleEntity> list() {
        List<TMcTeleEntity> listTMcTeles = tMcTeleService.getList(TMcTeleEntity.class);
        return listTMcTeles;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> get(@PathVariable("id") String id) {
        TMcTeleEntity task = tMcTeleService.get(TMcTeleEntity.class, id);
        if (task == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(task, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody TMcTelePage tMcTelePage, UriComponentsBuilder uriBuilder) {
        //调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
        Set<ConstraintViolation<TMcTelePage>> failures = validator.validate(tMcTelePage);
        if (!failures.isEmpty()) {
            return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
        }

        //保存
        List<TMcTeleSubEntity> tMcTeleSubList = tMcTelePage.getTMcTeleSubList();

        TMcTeleEntity tMcTele = new TMcTeleEntity();
        try {
            MyBeanUtils.copyBeanNotNull2Bean(tMcTele, tMcTelePage);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        tMcTeleService.addMain(tMcTele, tMcTeleSubList);

        //按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
        String id = tMcTelePage.getId();
        URI uri = uriBuilder.path("/rest/tMcTeleController/" + id).build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody TMcTelePage tMcTelePage) {
        //调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
        Set<ConstraintViolation<TMcTelePage>> failures = validator.validate(tMcTelePage);
        if (!failures.isEmpty()) {
            return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
        }

        //保存
        List<TMcTeleSubEntity> tMcTeleSubList = tMcTelePage.getTMcTeleSubList();

        TMcTeleEntity tMcTele = new TMcTeleEntity();
        try {
            MyBeanUtils.copyBeanNotNull2Bean(tMcTele, tMcTelePage);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        tMcTeleService.updateMain(tMcTele, tMcTeleSubList);

        //按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") String id) {
        TMcTeleEntity tMcTele = tMcTeleService.get(TMcTeleEntity.class, id);
        tMcTeleService.delMain(tMcTele);
    }
}
