<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<script type="text/javascript">
    $(document).ready(function () {
        if (location.href.indexOf("load=detail") != -1) {
            $(":input").attr("disabled", "true");
        }
    });
</script>
<div style="width: auto;height: 700px;overflow-y:auto;overflow-x:auto;">
    <table cellpadding="0" cellspacing="1" class="formtable" id="tMcTeleSub_table">
        <tbody id="add_tMcTeleSub_table">
        <c:if test="${fn:length(tMcTeleSubList)  <= 0 }">
            <c:forEach items="0,1" var="index">
                <tr style="background-color: white">
                    <td width="10%">第${index+1}次补录</td>
                    <td>
                        <table>
                            <tr>
                                <input name="tMcTeleSubList[${index}].id" type="hidden" value="${poVal.id}"/>
                                <input name="tMcTeleSubList[${index}].createName" type="hidden"
                                       value="${poVal.createName}"/>
                                <input name="tMcTeleSubList[${index}].createBy" type="hidden"
                                       value="${poVal.createBy}"/>
                                <input name="tMcTeleSubList[${index}].createDate" type="hidden"
                                       value="${poVal.createDate}"/>
                                <input name="tMcTeleSubList[${index}].updateName" type="hidden"
                                       value="${poVal.updateName}"/>
                                <input name="tMcTeleSubList[${index}].updateBy" type="hidden"
                                       value="${poVal.updateBy}"/>
                                <input name="tMcTeleSubList[${index}].updateDate" type="hidden"
                                       value="${poVal.updateDate}"/>
                                <input name="tMcTeleSubList[${index}].sysOrgCode" type="hidden"
                                       value="${poVal.sysOrgCode}"/>
                                <input name="tMcTeleSubList[${index}].sysCompanyCode" type="hidden"
                                       value="${poVal.sysCompanyCode}"/>
                                <input name="tMcTeleSubList[${index}].bpmStatus" type="hidden"
                                       value="${poVal.bpmStatus}"/>
                                <input name="tMcTeleSubList[${index}].teleIdFk" type="hidden"
                                       value="${poVal.teleIdFk}"/>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        营销状态:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${index}].marketingStatus" type="list"
                                                  typeGroupCode="mk_status"
                                                  defaultVal="${tMcTeleSubPage.marketingStatus}" hasLabel="false"
                                                  title="营销状态"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">营销状态</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        产品或服务需求:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${index}].produceService" type="list"
                                                  typeGroupCode="pd_service"
                                                  defaultVal="${tMcTeleSubPage.produceService}" hasLabel="false"
                                                  title="产品或服务需求"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">产品或服务需求</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        征信情况:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${index}].creditStatus" type="list"
                                                  typeGroupCode="cd_status" defaultVal="${tMcTeleSubPage.creditStatus}"
                                                  hasLabel="false" title="征信情况"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">征信情况</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        联系方式:
                                    </label>
                                </td>
                                <td class="value">
                                    <input name="tMcTeleSubList[${index}].contract" maxlength="32"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">联系方式</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        主营业务:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${index}].business" maxlength="200" style="width: 90%"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">主营业务</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        资产状况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${index}].resourceStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">资产状况</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        信用卡情况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${index}].cardStatus" maxlength="200" style="width: 90%"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">信用卡情况</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        负债状况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${index}].ownStatus" maxlength="200" style="width: 90%"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">负债状况</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        结息情况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${index}].interestStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt">
                                    <label class="Validform_label" style="display: none;">结息情况</label>
                                </td>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        备注:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
								<textarea name="tMcTeleSubList[${index}].remark" rows="800" cols="100" maxlength="2000"
                                          style="width: 90%"
                                          type="text" class="inputxt"/>
                                    <label class="Validform_label" style="display: none;">备注</label>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${fn:length(tMcTeleSubList)  > 0 }">
            <c:forEach items="${tMcTeleSubList}" var="poVal" varStatus="stuts">
                <tr style="background-color: white">
                    <td width="10%">第${stuts.count}次补录</td>
                    <td>
                        <table>
                            <tr>
                                <input name="tMcTeleSubList[${stuts.index}].id" type="hidden" value="${poVal.id}"/>
                                <input name="tMcTeleSubList[${stuts.index}].createName" type="hidden"
                                       value="${poVal.createName}"/>
                                <input name="tMcTeleSubList[${stuts.index}].createBy" type="hidden"
                                       value="${poVal.createBy}"/>
                                <input name="tMcTeleSubList[${stuts.index}].createDate" type="hidden"
                                       value="${poVal.createDate}"/>
                                <input name="tMcTeleSubList[${stuts.index}].updateName" type="hidden"
                                       value="${poVal.updateName}"/>
                                <input name="tMcTeleSubList[${stuts.index}].updateBy" type="hidden"
                                       value="${poVal.updateBy}"/>
                                <input name="tMcTeleSubList[${stuts.index}].updateDate" type="hidden"
                                       value="${poVal.updateDate}"/>
                                <input name="tMcTeleSubList[${stuts.index}].sysOrgCode" type="hidden"
                                       value="${poVal.sysOrgCode}"/>
                                <input name="tMcTeleSubList[${stuts.index}].sysCompanyCode" type="hidden"
                                       value="${poVal.sysCompanyCode}"/>
                                <input name="tMcTeleSubList[${stuts.index}].bpmStatus" type="hidden"
                                       value="${poVal.bpmStatus}"/>
                                <input name="tMcTeleSubList[${stuts.index}].teleIdFk" type="hidden"
                                       value="${poVal.teleIdFk}"/>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        营销状态:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${stuts.index}].marketingStatus" type="list"
                                                  typeGroupCode="mk_status" defaultVal="${poVal.marketingStatus}"
                                                  hasLabel="false" title="营销状态"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">营销状态</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        产品或服务需求:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${stuts.index}].produceService" type="list"
                                                  typeGroupCode="pd_service" defaultVal="${poVal.produceService}"
                                                  hasLabel="false" title="产品或服务需求"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">产品或服务需求</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        征信情况:
                                    </label>
                                </td>
                                <td class="value">
                                    <t:dictSelect field="tMcTeleSubList[${stuts.index}].creditStatus" type="list"
                                                  typeGroupCode="cd_status" defaultVal="${poVal.creditStatus}"
                                                  hasLabel="false" title="征信情况"></t:dictSelect>
                                    <label class="Validform_label" style="display: none;">征信情况</label>
                                </td>
                                <td align="right">
                                    <label class="Validform_label">
                                        联系方式:
                                    </label>
                                </td>
                                <td class="value">
                                    <input name="tMcTeleSubList[${stuts.index}].contract" maxlength="32"
                                           type="text" class="inputxt" value="${poVal.contract }">
                                    <label class="Validform_label" style="display: none;">联系方式</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        营销时间:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input maxlength="32" type="text" class="Wdate" disabled
                                           value="<fmt:formatDate value='${poVal.updateDate}' type="date" pattern="yyyy-MM-dd"/>">
                                    <label class="Validform_label" style="display: none;">营销时间</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        主营业务:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${stuts.index}].business" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt" value="${poVal.business }">
                                    <label class="Validform_label" style="display: none;">主营业务</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        资产状况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${stuts.index}].resourceStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt" value="${poVal.resourceStatus }">
                                    <label class="Validform_label" style="display: none;">资产状况</label>
                                </td>
                            </tr>
                            <tr>

                                <td align="right">
                                    <label class="Validform_label">
                                        信用卡情况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${stuts.index}].cardStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt" value="${poVal.cardStatus }">
                                    <label class="Validform_label" style="display: none;">信用卡情况</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        负债状况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${stuts.index}].ownStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt" value="${poVal.ownStatus }">
                                    <label class="Validform_label" style="display: none;">负债状况</label>
                                </td>

                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        结息情况:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
                                    <input name="tMcTeleSubList[${stuts.index}].interestStatus" maxlength="200"
                                           style="width: 90%"
                                           type="text" class="inputxt" value="${poVal.interestStatus }">
                                    <label class="Validform_label" style="display: none;">结息情况</label>
                                </td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <label class="Validform_label">
                                        备注:
                                    </label>
                                </td>
                                <td class="value" colspan="7">
						<textarea name="tMcTeleSubList[${stuts.index}].remark" maxlength="2000" style="width: 90%"
                                  type="text" class="inputxt" value="${poVal.remark }"/>
                                    <label class="Validform_label" style="display: none;">备注</label>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>