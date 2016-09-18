<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
    <div region="center" style="padding:0px;border:0px">
        <t:datagrid name="tMcTeleList" checkbox="true" fitColumns="false" title="客群信息"
                    actionUrl="tMcTeleController2.do?datagrid" idField="id" fit="true" queryMode="group">
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
            <t:dgCol title="机构号"  field="branchCode" queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="归属行部"  field="branchName" queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="客户经理"  field="telManager" queryMode="single"  width="120"></t:dgCol>
            <t:dgCol title="数据来源" field="dataResource" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="证件号" field="credential" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="企业名称" field="companyName" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="法人" field="manager" query="true" width="120"></t:dgCol>
            <t:dgCol title="成立时间" field="buildDate" formatter="yyyy-MM-dd" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="注册资本" field="regCapital" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="地址范围" field="address" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="经营范围" field="business" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="联系方式" field="contract" query="true" width="120"></t:dgCol>
            <t:dgCol title="客服人员" field="customerService" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="营销时间" field="disDate" formatter="yyyy-MM-dd" query="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="营销状态" field="marketingStatus" query="true" queryMode="single" width="120"
                     dictionary="mk_status"></t:dgCol>
            <t:dgCol title="营销状态1" field="status1" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="营销状态2" field="status2" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="营销状态3" field="status3" query="true" queryMode="single" width="120"></t:dgCol>
            <t:dgCol title="客服人员id" field="customerServiceId" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="流程状态" field="bpmStatus" query="true" queryMode="single" dictionary="tel_status"
                     width="120"></t:dgCol>
            <t:dgCol title="反馈状态" field="feedbackStatus" query="true" queryMode="single" dictionary="fb_status"
                     width="120"></t:dgCol>
            <t:dgCol title="客户姓名" field="customName" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="身份证号" field="idCard" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客户号" field="customId" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="产品名称1" field="resource" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="产品名称2" field="loanBalance" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="金额1" field="depositBalance" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="金额2" field="creditCard" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="存款日均" field="mobileBank" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="金融资产日均" field="card" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="保险销售" field="insurance" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="活期存款余额" field="ddBalance" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客服人员" field="fundsRate" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="机构" field="orgName" hidden="true" queryMode="group" width="120"></t:dgCol>
            <t:dgCol title="客户经理" field="customManager" hidden="true" queryMode="group" width="120"></t:dgCol>
            <%--<t:dgCol title="操作" field="opt" width="100"></t:dgCol>
            <t:dgDelOpt title="删除" url="tMcTeleController2.do?doDel&id={id}" />
            <t:dgToolBar title="录入" icon="icon-add" url="tMcTeleController2.do?goAdd" funname="add" width="100%" height="100%"></t:dgToolBar>--%>
            <t:dgToolBar title="反馈" icon="icon-edit" url="tMcTeleController2.do?goUpdate" funname="update" operationCode="update" width="100%"
                         height="100%"></t:dgToolBar>
            <t:dgToolBar title="查看" icon="icon-search" url="tMcTeleController2.do?goUpdate" funname="detail" width="100%" operationCode="detail"
                         height="100%"></t:dgToolBar>
            <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls" operationCode="ExportXls"></t:dgToolBar>
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
        $("#tMcTeleListtb").find("input[name='disDate_begin']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
        $("#tMcTeleListtb").find("input[name='disDate_end']").attr("class", "Wdate").click(function () {
            WdatePicker({dateFmt: 'yyyy-MM-dd'});
        });
    });

    //导出
    function ExportXls() {
        JeecgExcelExport("tMcTeleController2.do?exportXls", "tMcTeleList");
    }

</script>