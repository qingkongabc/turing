<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tMcCustomResourceProblem1List" checkbox="true" fitColumns="false" title="客户资产问题记录" actionUrl="tMcCustomResourceProblem1Controller.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="客户资产id"  field="customResourceId"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月份"  field="createMonth" formatter="yyyy-MM"  query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="客户代码"  field="customCode"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户姓名"  field="customName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="资产存在问题"  field="problem"    queryMode="single" dictionary="prob_type" width="120"></t:dgCol>
   <t:dgCol title="其他问题请填写"  field="otherProblem"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="下一步处理流程"  field="deal"    queryMode="single" dictionary="deal_type" width="120"></t:dgCol>
   <t:dgCol title="其他处理请填写"  field="otherDeal"    queryMode="single"  width="120"></t:dgCol>
   <%--<t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tMcCustomResourceProblem1Controller.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="tMcCustomResourceProblem1Controller.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tMcCustomResourceProblem1Controller.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tMcCustomResourceProblem1Controller.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>--%>
   <t:dgToolBar title="查看" icon="icon-search" url="tMcCustomResourceProblem1Controller.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <%--<t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>--%>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/resourceproblem/tMcCustomResourceProblem1List.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#tMcCustomResourceProblem1Listtb").find("input[name='createMonth_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 			$("#tMcCustomResourceProblem1Listtb").find("input[name='createMonth_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'tMcCustomResourceProblem1Controller.do?upload', "tMcCustomResourceProblem1List");
}

//导出
function ExportXls() {
	JeecgExcelExport("tMcCustomResourceProblem1Controller.do?exportXls","tMcCustomResourceProblem1List");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tMcCustomResourceProblem1Controller.do?exportXlsByT","tMcCustomResourceProblem1List");
}
 </script>