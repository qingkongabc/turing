<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>现场派单</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tMcWorkOrderController.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${tMcWorkOrderPage.id }">
					<input id="branchCode" name="branchCode" type="hidden" value="${tMcWorkOrderPage.branchCode }">
					<input id="customResourceId" name="customResourceId" type="hidden" value="${tMcWorkOrderPage.customResourceId }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								派单生成时间:
							</label>
						</td>
						<td class="value">
									  <input id="createDate" name="createDate" type="text" style="width: 150px" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" value='<fmt:formatDate value='${tMcWorkOrderPage.createDate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">派单生成时间</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								资产记录月份:
							</label>
						</td>
						<td class="value">
									  <input id="createMonth" name="createMonth" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()" value='<fmt:formatDate value='${tMcWorkOrderPage.createMonth}' type="date" pattern="yyyy-MM"/>'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">资产记录月份</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								机构名称:
							</label>
						</td>
						<td class="value">
						     	 <input id="branchName" name="branchName" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.branchName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">机构名称</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								归属经理:
							</label>
						</td>
						<td class="value">
						     	 <input id="manager" name="manager" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.manager}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">归属经理</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								客户号:
							</label>
						</td>
						<td class="value">
						     	 <input id="customCode" name="customCode" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.customCode}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">客户号</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								客户姓名:
							</label>
						</td>
						<td class="value">
						     	 <input id="customName" name="customName" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.customName}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">客户姓名</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								身份证号码:
							</label>
						</td>
						<td class="value">
						     	 <input id="customIc" name="customIc" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.customIc}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">身份证号码</label>
						</td>
					<tr>
						<td align="right">
							<label class="Validform_label">
								是否有房产:
							</label>
						</td>
						<td class="value">
						     	 <input id="ownHouse" name="ownHouse" type="text" style="width: 150px" class="inputxt"  value='${tMcWorkOrderPage.ownHouse}'>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否有房产</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								派单类型:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="workOrderType" type="list"
										typeGroupCode="wo_option" defaultVal="${tMcWorkOrderPage.workOrderType}" hasLabel="false"  title="派单类型"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">派单类型</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/workorder/tMcWorkOrder.js"></script>		
