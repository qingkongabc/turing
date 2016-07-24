<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>客户资产问题记录</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  function viewoperation(operationId) {
	  createwindow("<t:mutiLang langKey="资产详情" langArg="common.operation"/>", "tMcCustomResourceController.do?goUpdate&load=detail&id=" + operationId, "100%", "100%");
  }
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="tMcCustomResourceProblem1Controller.do?doUpdate" tiptype="1" >
					<input id="id" name="id" type="hidden" value="${tMcCustomResourceProblem1Page.id }">
					<input id="customResourceId" name="customResourceId" type="hidden" value="${tMcCustomResourceProblem1Page.customResourceId }">
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
			<tr>
				<td align="right">
					<label class="Validform_label">
						月份:
					</label>
				</td>
				<td class="value">
					<input id="createMonth" name="createMonth" type="text" style="width: 150px" readonly
						   class="Wdate"
						   value='<fmt:formatDate value='${tMcCustomResourceProblem1Page.createMonth}' type="date" pattern="yyyy-MM"/>'>
                    <a href="#" class="easyui-linkbutton l-btn l-btn-plain" plain="true" icon="icon-search" onclick="viewoperation('${tMcCustomResourceProblem1Page.customResourceId }')" id="">
                        <span>资产详情</span>
                    </a>
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
					<input id="customCode" name="customCode" type="text" readonly
						   style="width: 150px" class="inputxt" value='${tMcCustomResourceProblem1Page.customCode}'>
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
					<input id="customName" name="customName" type="text" readonly
						   style="width: 150px" class="inputxt" value='${tMcCustomResourceProblem1Page.customName}'>
					<span class="Validform_checktip"></span>
					<label class="Validform_label" style="display: none;">客户姓名</label>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="Validform_label">
						资产存在问题:
					</label>
				</td>
				<td class="value">
					<t:dictSelect field="problem" type="radio" readonly="readonly"
								  typeGroupCode="prob_type" defaultVal="${tMcCustomResourceProblem1Page.problem}" hasLabel="false" title="资产存在问题"></t:dictSelect>
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
					<textarea name="otherProblem" maxlength="2000" style="width: 95%;height: 50px;" readonly
							  type="text" class="inputxt">${tMcCustomResourceProblem1Page.otherProblem}</textarea>
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
					<textarea name="remark" maxlength="2000" style="width: 95%;height: 50px;" readonly
							  type="text" class="inputxt">${tMcCustomResourceProblem1Page.remark}</textarea>
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
					<t:dictSelect field="deal" type="radio" readonly="readonly"
								  typeGroupCode="deal_type" defaultVal="${tMcCustomResourceProblem1Page.deal}" hasLabel="false" title="下一步处理流程"></t:dictSelect>
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
					<textarea name="otherDeal" maxlength="2000" style="width: 95%;height: 50px;" readonly
							  type="text" class="inputxt">${tMcCustomResourceProblem1Page.otherDeal}</textarea>
					<span class="Validform_checktip"></span>
					<label class="Validform_label" style="display: none;">其他处理请填写</label>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="Validform_label">
						情况说明:
					</label>
				</td>
				<td class="value">
					<textarea name="feedback" maxlength="2000" style="width: 95%;height: 50px;"
							  type="text" class="inputxt">${tMcCustomResourceProblem1Page.feedback}</textarea>
					<span class="Validform_checktip"></span>
					<label class="Validform_label" style="display: none;">其他处理请填写</label>
				</td>
			</tr>
			</table>
		</t:formvalid>
 </body>
  <script src = "webpage/com/jeecg/resourceproblem/tMcCustomResourceProblem1.js"></script>
