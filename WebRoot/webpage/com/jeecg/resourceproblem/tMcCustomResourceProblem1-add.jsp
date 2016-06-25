<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>客户资产问题记录</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tMcCustomResourceProblem1Controller.do?doAdd" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${tMcCustomResourceProblem1Page.id }">
					<input id="customResourceId" name="customResourceId" type="hidden" value="${tMcCustomResourceProblem1Page.customResourceId }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							资产存在问题:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="problem" type="checkbox"
									typeGroupCode="prob_type" defaultVal="${tMcCustomResourceProblem1Page.problem}" hasLabel="false"  title="资产存在问题"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">资产存在问题</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							其他问题请填写:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="otherProblem" name="otherProblem"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其他问题请填写</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="remark" name="remark"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							下一步处理流程:
						</label>
					</td>
					<td class="value">
							  <t:dictSelect field="deal" type="checkbox"
									typeGroupCode="deal_type" defaultVal="${tMcCustomResourceProblem1Page.deal}" hasLabel="false"  title="下一步处理流程"></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">下一步处理流程</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							其他处理请填写:
						</label>
					</td>
					<td class="value">
						  	 <textarea style="width:600px;" class="inputxt" rows="6" id="otherDeal" name="otherDeal"></textarea>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">其他处理请填写</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							月份:
						</label>
					</td>
					<td class="value">
							   <input id="createMonth" name="createMonth" type="text" style="width: 150px" 
					      						class="Wdate" onClick="WdatePicker()"
>    
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">月份</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							客户号:
						</label>
					</td>
					<td class="value">
					     	 <input id="customCode" name="customCode" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
						<label class="Validform_label" style="display: none;">客户号</label>
						</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							客户姓名:
						</label>
					</td>
					<td class="value">
					     	 <input id="customName" name="customName" type="text" style="width: 150px" class="inputxt" >
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">客户姓名</label>
						</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/resourceproblem/tMcCustomResourceProblem1.js"></script>		
