<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="tMcCustomResourceList" checkbox="true" fitColumns="false" title="客户资产" actionUrl="tMcCustomResourceController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="月份"  field="createMonth" formatter="yyyy-MM"  query="true" queryMode="group"  width="120"></t:dgCol>
   <t:dgCol title="机构号"  field="branchCode"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="归属行部"  field="branchName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户经理"  field="manager"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户代码"  field="customCode"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="客户姓名"  field="customName"   query="true" queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="身份证号码"  field="customIc"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="产品类型"  field="productType"    queryMode="single" dictionary="prod_type" width="120"></t:dgCol>
   <t:dgCol title="是否有房产"  field="ownHouse"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="房产地址"  field="houseAddress"    queryMode="single"  width="300"></t:dgCol>
   <t:dgCol title="是否被他行抵押"  field="guaranty"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="是否被他行资产保全"  field="houseProtect"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="是否过户给他人"  field="transferOther"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="若过户给他人请填姓名"  field="otherName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="房产证号"  field="houseNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="配偶"  field="wifeName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="配偶身份证号"  field="wifeIc"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否有房产"  field="wifeOwnHouse"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="房产地址"  field="wifeHouseAddress"    queryMode="single"  width="300"></t:dgCol>
   <t:dgCol title="是否被他行抵押"  field="wifeGuaranty"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="是否被他行资产保全"  field="wifeHouseProtect"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="是否过户给他人"  field="wifeTransferOther"    queryMode="single" dictionary="sf_yn" width="120"></t:dgCol>
   <t:dgCol title="若过户给他人请填姓名"  field="wifeOtherName"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="房产证号"  field="wifeHouseNo"    queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate" formatter="yyyy-MM-dd" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true"  queryMode="single" dictionary="bpm_status" width="120"></t:dgCol>
   <%--<t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tMcCustomResourceController.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="tMcCustomResourceController.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>--%>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tMcCustomResourceController.do?goUpdate" funname="update" operationCode="update" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="tMcCustomResourceController.do?doBatchDel" funname="deleteALLSelect" operationCode="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="tMcCustomResourceController.do?goUpdate" funname="detail" operationCode="detail" width="100%" height="100%"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls" operationCode="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls" operationCode="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT" operationCode="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/com/jeecg/resource/tMcCustomResourceList.js"></script>		
 <script type="text/javascript">
 $(document).ready(function(){
 		//给时间控件加上样式
 			$("#tMcCustomResourceListtb").find("input[name='createMonth_begin']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 			$("#tMcCustomResourceListtb").find("input[name='createMonth_end']").attr("class","Wdate").click(function(){WdatePicker({dateFmt:'yyyy-MM'});});
 });
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'tMcCustomResourceController.do?upload', "tMcCustomResourceList");
}

//导出
function ExportXls() {
	JeecgExcelExport("tMcCustomResourceController.do?exportXls","tMcCustomResourceList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("tMcCustomResourceController.do?exportXlsByT","tMcCustomResourceList");
}
 </script>