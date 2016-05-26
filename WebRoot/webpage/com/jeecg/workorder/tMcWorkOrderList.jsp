<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tMcWorkOrderList" checkbox="true" fitColumns="false" title="现场派单" actionUrl="tMcWorkOrderController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="生成时间"  field="createDate" formatter="yyyy-MM-dd hh:mm:ss"  query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="记录月份"  field="createMonth" formatter="yyyy-MM"  query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="机构名称"  field="branchName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="归属经理"  field="manager"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户号"  field="customCode"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户姓名"  field="customName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号码"  field="customIc"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否有房产"  field="ownHouse"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="派单类型"  field="workOrderType"    queryMode="single" dictionary="wo_option" width="240"></t:dgCol>
   <t:dgCol title="机构号"  field="branchCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户资产id"  field="customResourceId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
  <%--<t:dgCol title="操作" field="opt" width="100"></t:dgCol>
  <t:dgDelOpt title="删除" url="tMcWorkOrderController.do?doDel&id={id}" />
  <t:dgToolBar title="录入" icon="icon-add" url="tMcWorkOrderController.do?goAdd" funname="add"></t:dgToolBar>
  <t:dgToolBar title="编辑" icon="icon-edit" url="tMcWorkOrderController.do?goUpdate" funname="update"></t:dgToolBar>
  <t:dgToolBar title="批量删除"  icon="icon-remove" url="tMcWorkOrderController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
  <t:dgToolBar title="查看" icon="icon-search" url="tMcWorkOrderController.do?goUpdate" funname="detail"></t:dgToolBar>
  <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
  <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/workorder/tMcWorkOrderList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#tMcWorkOrderListtb").find("input[name='createDate_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#tMcWorkOrderListtb").find("input[name='createDate_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#tMcWorkOrderListtb").find("input[name='createMonth_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 			$("#tMcWorkOrderListtb").find("input[name='createMonth_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'tMcWorkOrderController.do?upload', "tMcWorkOrderList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tMcWorkOrderController.do?exportXls","tMcWorkOrderList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tMcWorkOrderController.do?exportXlsByT","tMcWorkOrderList");
}
 </script>