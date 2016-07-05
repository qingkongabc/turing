<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="tMcTeleList" checkbox="true" fitColumns="false" title="客群信息"
                    actionUrl="tMcTeleController1.do?datagrid" idField="id" fit="true" queryMode="group">
            <t:dgCol title="id" field="id" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="创建人名称" field="createName" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="创建人登录名称" field="createBy" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="创建日期" field="createDate" formatter="yyyy-MM-dd" query="true" queryMode="group"
                     width="120"></t:dgCol>
            <t:dgCol title="更新人名称" field="updateName" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="更新人登录名称" field="updateBy" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="更新日期" field="updateDate" formatter="yyyy-MM-dd" hidden="true" queryMode="group"
                     width="120"></t:dgCol>
            <t:dgCol title="所属部门" field="sysOrgCode" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="所属公司" field="sysCompanyCode" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="数据来源" field="dataResource" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="证件号" field="credential" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="法人" field="manager" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="企业名称" field="companyName" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="成立时间" field="buildDate" formatter="yyyy-MM-dd" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="经营范围" field="business" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="联系方式" field="contract" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="地址" field="address" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客服人员" field="customerService" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客服人员id" field="customerServiceId" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="流程状态" field="bpmStatus" query="true" queryMode="single" dictionary="tel_status"
                     width="120"></t:dgCol>
            <t:dgCol title="客户姓名" field="customName" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="身份证号" field="idCard" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客户号" field="customId" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="金融资产" field="resource" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="贷款余额" field="loanBalance" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="存储余额" field="depositBalance" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="信用卡" field="creditCard" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="手机银行" field="mobileBank" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="财神卡" field="card" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="保险销售" field="insurance" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="活期存款余额" field="ddBalance" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="资金留存率" field="fundsRate" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="机构" field="orgName" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="客户经理" field="customManager" queryMode="group" width="120"></t:dgCol>
            <t:dgToolBar title="查看" icon="icon-search" url="tMcTeleController1.do?goUpdate" funname="detail" operationCode="detail"
                         width="100%" height="100%"></t:dgToolBar>
            <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls" operationCode="ImportXls"></t:dgToolBar>
            <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls" operationCode="ExportXls"></t:dgToolBar>
            <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT" operationCode="ExportXlsByT"></t:dgToolBar>
        </t:datagrid>
    </div>
</div>
<script src="webpage/com/jeecg/tele/tMcTeleList.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        //给时间控件加上样式
        $("#tMcTeleListtb").find("input[name='createDate_begin']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='createDate_end']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='updateDate_begin']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='updateDate_end']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='buildDate_begin']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='buildDate_end']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
    });

    //导入
    function ImportXls() {
        openuploadwin('Excel导入', 'tMcTeleController1.do?upload', "tMcTeleList");
    }

    //导出
    function ExportXls() {
        JeecgExcelExport("tMcTeleController1.do?exportXls", "tMcTeleList");
    }

    //模板下载
    function ExportXlsByT() {
        JeecgExcelExport("tMcTeleController1.do?exportXlsByT", "tMcTeleList");
    }
</script>