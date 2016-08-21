<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
$(document).ready(function(){
	if (location.href.indexOf("load=detail") != -1) {
			$(":input").attr("disabled","true");
		$("#cho").hide();
		}

	$("input[name$='deal']").click(function () {
		val = $(this).val();
		if (val == 2) {
			$("#dealTr").show();
			$("#realName").attr("datatype", "*");
		} else {
			$("#dealTr").hide();
			$("#pageReceiverIds").val("");
			$("#realName").val("");
			$("#realName").removeAttr("datatype");
		}
	});

	var deal = $("input[name$='deal']:checked").val();
	if (2 != deal) {
		$("#dealTr").hide();
	}
    });
</script>
<div style="width: auto;height: 480px;overflow-y:auto;overflow-x:auto;">
<table cellpadding="0" cellspacing="1" class="formtable" id="tMcCustomResourceProblem_table" >
	<tbody id="add_tMcCustomResourceProblem_table" >	
	<c:if test="${fn:length(tMcCustomResourceProblemList)  <= 0 }">
			<tr>
				<input name="tMcCustomResourceProblemList[0].id" type="hidden"  value="${poVal.id}"/>
				<input name="tMcCustomResourceProblemList[0].customResourceId" type="hidden"  value="${poVal.customResourceId}"/>
				<input name="tMcCustomResourceProblemList[0].createMonth" type="hidden"  value="${poVal.createMonth}"/>
				<input name="tMcCustomResourceProblemList[0].customCode" type="hidden"  value="${poVal.customCode}"/>
                <input name="tMcCustomResourceProblemList[0].customName" type="hidden"  value="${poVal.customName}"/>
                <input name="tMcCustomResourceProblemList[0].createName" type="hidden"  value="${poVal.createName}"/>
                <input name="tMcCustomResourceProblemList[0].createBy" type="hidden"  value="${poVal.createBy}"/>
                <input name="tMcCustomResourceProblemList[0].createDate" type="hidden"  value="${poVal.createDate}"/>
                <input name="tMcCustomResourceProblemList[0].updateName" type="hidden"  value="${poVal.updateName}"/>
                <input name="tMcCustomResourceProblemList[0].updateBy" type="hidden"  value="${poVal.updateBy}"/>
                <input name="tMcCustomResourceProblemList[0].updateDate" type="hidden"  value="${poVal.updateDate}"/>
                <input name="tMcCustomResourceProblemList[0].sysOrgCode" type="hidden"  value="${poVal.sysOrgCode}"/>
                <input name="tMcCustomResourceProblemList[0].sysCompanyCode" type="hidden"  value="${poVal.sysCompanyCode}"/>
                <input name="tMcCustomResourceProblemList[0].bpmStatus" type="hidden"  value="${poVal.bpmStatus}"/>
			</tr>
				<tr>
				  <td align="right">
					<label class="Validform_label">
						资产存在问题:
					</label>
				  </td>
				  <td class="value">
					<t:dictSelect field="tMcCustomResourceProblemList[0].problem" type="checkbox"
								typeGroupCode="prob_type" defaultVal="${tMcCustomResourceProblemPage.problem}" hasLabel="false"  title="资产存在问题"></t:dictSelect>
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
					  <textarea name="tMcCustomResourceProblemList[0].otherProblem" maxlength="2000"
								style="width: 70%;height: 50px;"
								type="text" class="inputxt"></textarea>
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
					  <textarea name="tMcCustomResourceProblemList[0].remark" maxlength="2000"
								style="width: 70%;height: 50px;"
								type="text" class="inputxt"></textarea>
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
							<t:dictSelect field="tMcCustomResourceProblemList[0].deal" type="radio"
										typeGroupCode="deal_type" defaultVal="${tMcCustomResourceProblemPage.deal}" hasLabel="false"  title="下一步处理流程"></t:dictSelect>
					  <label class="Validform_label" style="display: none;">下一步处理流程</label>
				  </td>
				</tr>
		<tr id="dealTr">
			<td align="right">
				<label class="Validform_label">
					选择处理人:
				</label>
			</td>
			<td class="value">
				<input name="tMcCustomResourceProblemList[0].dealBy" type="hidden" value="${poVal.dealBy}"
					   id="pageReceiverIds">
				<input name="tMcCustomResourceProblemList[0].dealName" class="inputxt" value="${poVal.dealName}"
					   id="realName" readonly="readonly"/>
				<t:choose hiddenName="pageReceiverIds" hiddenid="userName"
						  url="tMcCustomResourceController.do?goAddUserToRole" name="userList"
						  icon="icon-search" title="选择处理人" textname="realName" inputTextname="realName" isclear="true"
						  isInit="true" width="800px"></t:choose>
			</td>
		</tr>
				<tr>
				  <td align="right">
					<label class="Validform_label">
						其他处理请填写:
					</label>
				  </td>
				  <td class="value">
					  <textarea name="tMcCustomResourceProblemList[0].otherDeal" maxlength="2000"
								style="width: 70%;height: 50px;"
								type="text" class="inputxt"></textarea>
					  <label class="Validform_label" style="display: none;">其他处理请填写</label>
				  </td>
				</tr>
	</c:if>
	<c:if test="${fn:length(tMcCustomResourceProblemList)  > 0 }">
		<c:forEach items="${tMcCustomResourceProblemList}" var="poVal" varStatus="stuts" begin="0" end="0">
			<tr>
                <input name="tMcCustomResourceProblemList[0].id" type="hidden" value="${poVal.id}"/>
                <input name="tMcCustomResourceProblemList[0].customResourceId" type="hidden" value="${poVal.customResourceId}"/>
                <input name="tMcCustomResourceProblemList[0].createMonth" type="hidden" value="${poVal.createMonth}"/>
                <input name="tMcCustomResourceProblemList[0].customCode" type="hidden" value="${poVal.customCode}"/>
                <input name="tMcCustomResourceProblemList[0].customName" type="hidden" value="${poVal.customName}"/>
                <input name="tMcCustomResourceProblemList[0].createName" type="hidden"  value="${poVal.createName}"/>
                <input name="tMcCustomResourceProblemList[0].createBy" type="hidden"  value="${poVal.createBy}"/>
                <input name="tMcCustomResourceProblemList[0].createDate" type="hidden"  value="${poVal.createDate}"/>
                <input name="tMcCustomResourceProblemList[0].updateName" type="hidden"  value="${poVal.updateName}"/>
                <input name="tMcCustomResourceProblemList[0].updateBy" type="hidden"  value="${poVal.updateBy}"/>
                <input name="tMcCustomResourceProblemList[0].updateDate" type="hidden"  value="${poVal.updateDate}"/>
                <input name="tMcCustomResourceProblemList[0].sysOrgCode" type="hidden"  value="${poVal.sysOrgCode}"/>
                <input name="tMcCustomResourceProblemList[0].sysCompanyCode" type="hidden"  value="${poVal.sysCompanyCode}"/>
                <input name="tMcCustomResourceProblemList[0].bpmStatus" type="hidden"  value="${poVal.bpmStatus}"/>
			</tr>
			<tr>
			  <td align="right">
				<label class="Validform_label">
					资产存在问题:
				</label>
			  </td>
			  <td class="value">
						<t:dictSelect field="tMcCustomResourceProblemList[0].problem" type="checkbox"
									typeGroupCode="prob_type" defaultVal="${poVal.problem}" hasLabel="false"  title="资产存在问题"></t:dictSelect>
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
				  <textarea name="tMcCustomResourceProblemList[0].otherProblem" maxlength="2000"
							style="width: 70%;height: 50px;"
							type="text" class="inputxt">${poVal.otherProblem}</textarea>
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
				  <textarea name="tMcCustomResourceProblemList[0].remark" maxlength="2000"
							style="width: 70%;height: 50px;"
							type="text" class="inputxt">${poVal.remark }</textarea>
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
						<t:dictSelect field="tMcCustomResourceProblemList[0].deal" type="radio"
									typeGroupCode="deal_type" defaultVal="${poVal.deal}" hasLabel="false"  title="下一步处理流程"></t:dictSelect>
				  <label class="Validform_label" style="display: none;">下一步处理流程</label>
			  </td>
			</tr>
			<tr id="dealTr">
				<td align="right">
					<label class="Validform_label">
						选择处理人:
					</label>
				</td>
				<td class="value">
					<input name="tMcCustomResourceProblemList[0].dealBy" type="hidden" value="${poVal.dealBy}"
						   id="pageReceiverIds">
					<input name="tMcCustomResourceProblemList[0].dealName" class="inputxt" value="${poVal.dealName}"
						   id="realName" readonly="readonly"/>
					<span id="cho"><t:choose hiddenName="pageReceiverIds" hiddenid="userName"
											 url="tMcCustomResourceController.do?goAddUserToRole" name="userList"
											 icon="icon-search" title="选择处理人" textname="realName"
											 inputTextname="realName" isclear="true" isInit="true"
											 width="800px"></t:choose></span>
				</td>
			</tr>
			<tr>
			  <td align="right">
				<label class="Validform_label">
					其他处理请填写:
				</label>
			  </td>
			  <td class="value">
				  <textarea name="tMcCustomResourceProblemList[0].otherDeal" maxlength="2000"
							style="width: 70%;height: 50px;"
							type="text" class="inputxt">${poVal.otherDeal}</textarea>
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
				  <textarea style="width: 70%;height: 50px;" readonly
							type="text" class="inputxt">${poVal.feedback}</textarea>
				</td>
			</tr>
			<tr>
				<td align="right">
					<label class="Validform_label"> 附件
					</label>
				</td>
				<td>
					<table>
						<tr style="height: 34px;">
							<c:forEach items="${documents}" var="vdocument">
								<td>
									<a href="commonController.do?viewFile&fileid=${vdocument.id}&subclassname=org.jeecgframework.web.system.pojo.base.JformInnerMailAttach" title="下载">${vdocument.attachmenttitle}.${vdocument.extend}</a>
								</td>
							</c:forEach>
						</tr>
					</table>
				</td>
			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>