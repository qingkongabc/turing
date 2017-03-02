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
             action="tMcTeleController.do?doUpdate">
    <input id="id" name="id" type="hidden" value="${tMcTelePage.id }">
    <input id="createName" name="createName" type="hidden" value="${tMcTelePage.createName }">
    <input id="createBy" name="createBy" type="hidden" value="${tMcTelePage.createBy }">
    <input id="createDate" name="createDate" type="hidden" value="${tMcTelePage.createDate }">
    <input id="disDate" name="disDate" type="hidden" value="${tMcTelePage.disDate }">
    <input id="updateName" name="updateName" type="hidden" value="${tMcTelePage.updateName }">
    <input id="updateBy" name="updateBy" type="hidden" value="${tMcTelePage.updateBy }">
    <input id="updateDate" name="updateDate" type="hidden" value="${tMcTelePage.updateDate }">
    <input id="sysOrgCode" name="sysOrgCode" type="hidden" value="${tMcTelePage.sysOrgCode }">
    <input id="sysCompanyCode" name="sysCompanyCode" type="hidden" value="${tMcTelePage.sysCompanyCode }">
    <input id="bpmStatus" name="bpmStatus" type="hidden" value="${tMcTelePage.bpmStatus }">
    <input id="customerServiceId" name="customerServiceId" type="hidden" value="${tMcTelePage.customerServiceId }">
    <input id="marketingStatus" name="marketingStatus" type="hidden" value="${tMcTelePage.marketingStatus }">
    <table cellpadding="0" cellspacing="1" class="formtable">
        <tr>
            <td align="right">
                <label class="Validform_label">机构号:</label>
            </td>
            <td class="value">
                <input id="branchCode" name="branchCode" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.branchCode}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">机构号</label>
            </td>
            <td align="right">
                <label class="Validform_label">归属行部:</label>
            </td>
            <td class="value">
                <input id="branchName" name="branchName" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.branchName}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">归属行部</label>
            </td>
            <td align="right">
                <label class="Validform_label">客户经理:</label>
            </td>
            <td class="value">
                <input id="telManager" name="telManager" type="text" style="width:90%" class="inputxt" readonly
                       value='${tMcTelePage.telManager}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">客户经理</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">数据来源:</label>
            </td>
            <td class="value">
                <input id="dataResource" name="dataResource" type="text" style="width:90%" class="inputxt"
                       datatype="*" value='${tMcTelePage.dataResource}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">数据来源</label>
            </td>
            <td align="right">
                <label class="Validform_label">证件号:</label>
            </td>
            <td class="value">
                <input id="credential" name="credential" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.credential}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">证件号</label>
            </td>
            <td align="right">
                <label class="Validform_label">企业名称:</label>
            </td>
            <td class="value">
                <input id="companyName" name="companyName" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.companyName}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">企业名称</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">注册资本:</label>
            </td>
            <td class="value">
                <input id="regCapital" name="regCapital" type="text" style="width:90%" class="inputxt" datatype="*"
                       value='${tMcTelePage.regCapital}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">注册资本</label>
            </td>
            <td align="right">
                <label class="Validform_label">法人:</label>
            </td>
            <td class="value">
                <input id="manager" name="manager" type="text" style="width:90%" class="inputxt" datatype="*"
                       value='${tMcTelePage.manager}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">法人</label>
            </td>
            <td align="right">
                <label class="Validform_label">成立时间:</label>
            </td>
            <td class="value">
                <input id="buildDate" name="buildDate" type="text" style="width:90%"
                       class="Wdate" onClick="WdatePicker()" datatype="*"
                       value='<fmt:formatDate value='${tMcTelePage.buildDate}' type="date" pattern="yyyy-MM-dd"/>'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">成立时间</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">经营范围:</label>
            </td>
            <td class="value" colspan="5">
                <textarea id="business" style="width:90%;height:100px;" class="inputxt" rows="20" cols="200"
                          name="business">${tMcTelePage.business}</textarea>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">经营范围</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">联系方式:</label>
            </td>
            <td class="value">
                <input id="contract" name="contract" type="text" style="width:90%" class="inputxt" datatype="*"
                       value='${tMcTelePage.contract}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">联系方式</label>
            </td>
            <td align="right">
                <label class="Validform_label">客服人员:</label>
            </td>
            <td class="value">
                <input id="customerService" name="customerService" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.customerService}' readonly>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">客服人员</label>
            </td>
            <td align="right">
                <label class="Validform_label"></label>
            </td>
            <td class="value">
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">地址范围:</label>
            </td>
            <td class="value" colspan="5">
                <input id="address" name="address" type="text" style="width: 90%" class="inputxt" datatype="*"
                       value='${tMcTelePage.address}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">地址</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">营销状态1:</label>
            </td>
            <td class="value">
                <input id="status1" name="status1" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.status1}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">营销状态1</label>
            </td>
            <td align="right">
                <label class="Validform_label">营销状态2:</label>
            </td>
            <td class="value">
                <input id="status2" name="status2" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.status2}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">营销状态2</label>
            </td>
            <td align="right">
                <label class="Validform_label">营销状态3:</label>
            </td>
            <td class="value">
                <input id="status3" name="status3" type="text" style="width:90%" class="inputxt"
                       value='${tMcTelePage.status3}'>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">营销状态3</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">产品:</label>
            </td>
            <td class="value" colspan="5">
                <textarea name="product" maxlength="2000" style="width: 90%"
                          type="text" class="inputxt">${tMcTelePage.product}</textarea>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">产品</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">备注:</label>
            </td>
            <td class="value" colspan="5">
                <textarea name="remark" maxlength="2000" style="width: 90%"
                          type="text" class="inputxt">${tMcTelePage.remark}</textarea>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">备注</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">落地状态:</label>
            </td>
            <td class="value">
                <t:dictSelect field="signStatus" type="radio"
                              typeGroupCode="sg_status" defaultVal="${tMcTelePage.signStatus}" hasLabel="false"></t:dictSelect>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">落地状态</label>
            </td>
            <td align="right">
                <label class="Validform_label">反馈状态:</label>
            </td>
            <td class="value" colspan="5">
                <t:dictSelect field="feedbackStatus" type="radio" readonly="readonly"
                              typeGroupCode="fb_status" defaultVal="${tMcTelePage.feedbackStatus}" hasLabel="false"></t:dictSelect>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">反馈状态</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">反馈信息:</label>
            </td>
            <td class="value" colspan="5">
                <textarea name="remark" maxlength="8000" style="width: 90%;height: 100%" readonly
                          type="text" rows="7" class="inputxt">${tMcTelePage.remark}</textarea>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">备注</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">客户姓名:</label>
            </td>
            <td class="value">
                <input id="customName" name="customName" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.customName}'>
            </td>
            <td align="right">
                <label class="Validform_label">身份证号:</label>
            </td>
            <td class="value">
                <input id="idCard" name="idCard" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.idCard}'>
            </td>
            <td align="right">
                <label class="Validform_label">客户号:</label>
            </td>
            <td class="value">
                <input id="customId" name="customId" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.customId}'>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">产品名称1:</label>
            </td>
            <td class="value">
                <input id="resource" name="resource" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.resource}'>
            </td>
            <td align="right">
                <label class="Validform_label">产品名称2:</label>
            </td>
            <td class="value">
                <input id="loanBalance" name="loanBalance" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.loanBalance}'>
            </td>
            <td align="right">
                <label class="Validform_label">金额1:</label>
            </td>
            <td class="value">
                <input id="depositBalance" name="depositBalance" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.depositBalance}'>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">金额2:</label>
            </td>
            <td class="value">
                <input id="creditCard" name="creditCard" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.creditCard}'>
            </td>
            <td align="right">
                <label class="Validform_label">存款日均:</label>
            </td>
            <td class="value">
                <input id="mobileBank" name="mobileBank" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.mobileBank}'>
            </td>
            <td align="right">
                <label class="Validform_label">金融资产日均:</label>
            </td>
            <td class="value">
                <input id="card" name="card" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.card}'>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">保险销售:</label>
            </td>
            <td class="value">
                <input id="insurance" name="insurance" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.insurance}'>
            </td>
            <td align="right">
                <label class="Validform_label">活期存款余额:</label>
            </td>
            <td class="value">
                <input id="ddBalance" name="ddBalance" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.ddBalance}'>
            </td>
            <td align="right">
                <label class="Validform_label">客服人员:</label>
            </td>
            <td class="value">
                <input id="fundsRate" name="fundsRate" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.fundsRate}'>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">机构:</label>
            </td>
            <td class="value">
                <input id="orgName" name="orgName" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.orgName}'>
            </td>
            <td align="right">
                <label class="Validform_label">客户经理:</label>
            </td>
            <td class="value">
                <input id="customManager" name="customManager" type="text" style="width: 90%" class="inputxt"
                       value='${tMcTelePage.customManager}'>
            </td>
            <td align="right">
            </td>
            <td class="value">
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
</body>
<script src="webpage/com/jeecg/tele/tMcTele.js"></script>
