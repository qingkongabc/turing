<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>客群信息</title>
    <t:base type="jquery,easyui,tools,DatePicker"></t:base>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#tt').tabs({
                onSelect: function (title) {
                    $('#tt .panel-body').css('width', 'auto');
                }
            });
            $(".tabs-wrap").css('width', '100%');
        });
    </script>
</head>
<body style="overflow-x: hidden;">
<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1"
             action="tMcTeleController.do?doAdd">
    <input id="id" name="id" type="hidden" value="${tMcTelePage.id }">
    <input id="createName" name="createName" type="hidden" value="${tMcTelePage.createName }">
    <input id="createBy" name="createBy" type="hidden" value="${tMcTelePage.createBy }">
    <input id="createDate" name="createDate" type="hidden" value="${tMcTelePage.createDate }">
    <input id="updateName" name="updateName" type="hidden" value="${tMcTelePage.updateName }">
    <input id="updateBy" name="updateBy" type="hidden" value="${tMcTelePage.updateBy }">
    <input id="updateDate" name="updateDate" type="hidden" value="${tMcTelePage.updateDate }">
    <input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${tMcTelePage.sysOrgCode }">
    <input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${tMcTelePage.sysCompanyCode }">
    <input id="bpmStatus" name="bpmStatus" type="hidden" value="${tMcTelePage.bpmStatus }">
    <input id="customName" name="customName" type="hidden" value="${tMcTelePage.customName }">
    <input id="idCard" name="idCard" type="hidden" value="${tMcTelePage.idCard }">
    <input id="customId" name="customId" type="hidden" value="${tMcTelePage.customId }">
    <input id="resource" name="resource" type="hidden" value="${tMcTelePage.resource }">
    <input id="loanBalance" name="loanBalance" type="hidden" value="${tMcTelePage.loanBalance }">
    <input id="depositBalance" name="depositBalance" type="hidden" value="${tMcTelePage.depositBalance }">
    <input id="creditCard" name="creditCard" type="hidden" value="${tMcTelePage.creditCard }">
    <input id="mobileBank" name="mobileBank" type="hidden" value="${tMcTelePage.mobileBank }">
    <input id="card" name="card" type="hidden" value="${tMcTelePage.card }">
    <input id="insurance" name="insurance" type="hidden" value="${tMcTelePage.insurance }">
    <input id="ddBalance" name="ddBalance" type="hidden" value="${tMcTelePage.ddBalance }">
    <input id="fundsRate" name="fundsRate" type="hidden" value="${tMcTelePage.fundsRate }">
    <input id="orgName" name="orgName" type="hidden" value="${tMcTelePage.orgName }">
    <input id="customManager" name="customManager" type="hidden" value="${tMcTelePage.customManager }">
    <table cellpadding="0" cellspacing="1" class="formtable">
        <tr>
            <td align="right">
                <label class="Validform_label">数据来源:</label>
            </td>
            <td class="value">
                <input id="dataResource" name="dataResource" type="text" style="width: 150px" class="inputxt"
                       datatype="*">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">数据来源</label>
            </td>
            <td align="right">
                <label class="Validform_label">证件号:</label>
            </td>
            <td class="value">
                <input id="credential" name="credential" type="text" style="width: 150px" class="inputxt">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">证件号</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">法人:</label>
            </td>
            <td class="value">
                <input id="manager" name="manager" type="text" style="width: 150px" class="inputxt" datatype="*">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">法人</label>
            </td>
            <td align="right">
                <label class="Validform_label">企业名称:</label>
            </td>
            <td class="value">
                <input id="companyName" name="companyName" type="text" style="width: 150px" class="inputxt">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">企业名称</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">成立时间:</label>
            </td>
            <td class="value">
                <input id="buildDate" name="buildDate" type="text" style="width: 150px"
                       class="Wdate" onClick="WdatePicker()" datatype="*">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">成立时间</label>
            </td>
            <td align="right">
                <label class="Validform_label">经营范围:</label>
            </td>
            <td class="value">
                <textarea id="business" style="width:600px;" class="inputxt" rows="6" name="business"></textarea>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">经营范围</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">联系方式:</label>
            </td>
            <td class="value">
                <input id="contract" name="contract" type="text" style="width: 150px" class="inputxt" datatype="*">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">联系方式</label>
            </td>
            <td align="right">
                <label class="Validform_label">地址:</label>
            </td>
            <td class="value">
                <input id="address" name="address" type="text" style="width: 150px" class="inputxt" datatype="*">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">地址</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">客服人员:</label>
            </td>
            <td class="value">
                <input id="customerService" name="customerService" type="text" style="width: 150px" class="inputxt">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">客服人员</label>
            </td>
            <td align="right">
                <label class="Validform_label">客服人员id:</label>
            </td>
            <td class="value">
                <input id="customerServiceId" name="customerServiceId" type="text" style="width: 150px" class="inputxt">
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">客服人员id</label>
            </td>
        </tr>
    </table>
    <div style="width: auto;height: 200px;">
            <%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
        <div style="width:800px;height:1px;"></div>
        <t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
            <t:tab href="tMcTeleController.do?tMcTeleSubList&id=${tMcTelePage.id}" icon="icon-search" title="信息补录"
                   id="tMcTeleSub"></t:tab>
        </t:tabs>
    </div>
</t:formvalid>
<!-- 添加 附表明细 模版 -->
<table style="display:none">
    <tbody id="add_tMcTeleSub_table_template">
    <tr>
        <td align="center">
            <div style="width: 25px;" name="xh"></div>
        </td>
        <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
        <td align="left">
            <t:dictSelect field="tMcTeleSubList[#index#].marketingStatus" type="list"
                          typeGroupCode="mk_status" defaultVal="" hasLabel="false" title="营销状态"></t:dictSelect>
            <label class="Validform_label" style="display: none;">营销状态</label>
        </td>
        <td align="left">
            <t:dictSelect field="tMcTeleSubList[#index#].produceService" type="list"
                          typeGroupCode="pd_service" defaultVal="" hasLabel="false" title="产品或服务需求"></t:dictSelect>
            <label class="Validform_label" style="display: none;">产品或服务需求</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].business" maxlength="200"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">主营业务</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].resourceStatus" maxlength="200"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">资产状况</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].contract" maxlength="32"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">联系方式</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].cardStatus" maxlength="200"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">信用卡情况</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].ownStatus" maxlength="200"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">负债状况</label>
        </td>
        <td align="left">
            <t:dictSelect field="tMcTeleSubList[#index#].creditStatus" type="list"
                          typeGroupCode="cd_status" defaultVal="" hasLabel="false" title="征信情况"></t:dictSelect>
            <label class="Validform_label" style="display: none;">征信情况</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].interestStatus" maxlength="200"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">结息情况</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].sellDate" maxlength="32"
                   type="text" class="Wdate" onClick="WdatePicker()" style="width:120px;"
            >
            <label class="Validform_label" style="display: none;">营销时间</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].customerService" maxlength="32"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">客服人员</label>
        </td>
        <td align="left">
            <input name="tMcTeleSubList[#index#].remark" maxlength="2000"
                   type="text" class="inputxt" style="width:120px;">
            <label class="Validform_label" style="display: none;">备注</label>
        </td>
    </tr>
    </tbody>
</table>
</body>
<script src="webpage/com/jeecg/tele/tMcTele.js"></script>
	