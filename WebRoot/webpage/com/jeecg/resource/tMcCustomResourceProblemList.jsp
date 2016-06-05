<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
$(document).ready(function(){
    	if(location.href.indexOf("load=detail")!=-1){
			$(":input").attr("disabled","true");
		}
    });
</script>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:auto;">
<table cellpadding="0" cellspacing="1" class="formtable" id="tMcCustomResourceProblem_table" >
	<tbody id="add_tMcCustomResourceProblem_table" >	
	<c:if test="${fn:length(tMcCustomResourceProblemList)  <= 0 }">
			<tr>
					<input name="tMcCustomResourceProblemList[0].id" type="hidden"  value="${poVal.id}"/>
					<input name="tMcCustomResourceProblemList[0].customResourceId" type="hidden"  value="${poVal.customResourceId}"/>
					<input name="tMcCustomResourceProblemList[0].createMonth" type="hidden"  value="${poVal.createMonth}"/>
					<input name="tMcCustomResourceProblemList[0].customCode" type="hidden"  value="${poVal.customCode}"/>
					<input name="tMcCustomResourceProblemList[0].customName" type="hidden"  value="${poVal.customName}"/>
			</tr>
				<tr>
				  <td align="right">
					<label class="Validform_label">
						资产存在问题:
					</label>
				  </td>
				  <td class="value">
					<t:dictSelect field="tMcCustomResourceProblemList[0].problem" type="radio"
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
					  <textarea name="tMcCustomResourceProblemList[0].otherProblem" maxlength="2000" style="width: 70%;height: 100px;"
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
					  <textarea name="tMcCustomResourceProblemList[0].remark" maxlength="2000" style="width: 70%;height: 100px;"
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
				<tr>
				  <td align="right">
					<label class="Validform_label">
						其他处理请填写:
					</label>
				  </td>
				  <td class="value">
					  <textarea name="tMcCustomResourceProblemList[0].otherDeal" maxlength="2000" style="width: 70%;height: 100px;"
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
			</tr>
			<tr>
			  <td align="right">
				<label class="Validform_label">
					资产存在问题:
				</label>
			  </td>
			  <td class="value">
						<t:dictSelect field="tMcCustomResourceProblemList[0].problem" type="radio"
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
				  <textarea name="tMcCustomResourceProblemList[0].otherProblem" maxlength="2000" style="width: 70%;height: 100px;"
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
				  <textarea name="tMcCustomResourceProblemList[0].remark" maxlength="2000" style="width: 70%;height: 100px;"
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
			<tr>
			  <td align="right">
				<label class="Validform_label">
					其他处理请填写:
				</label>
			  </td>
			  <td class="value">
				  <textarea name="tMcCustomResourceProblemList[0].otherDeal" maxlength="2000" style="width: 70%;height: 100px;"
							type="text" class="inputxt">${poVal.otherDeal}</textarea>
				  <label class="Validform_label" style="display: none;">其他处理请填写</label>
			  </td>
			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>