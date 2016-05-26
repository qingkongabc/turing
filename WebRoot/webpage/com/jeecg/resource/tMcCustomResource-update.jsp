<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>客户资产</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  $(document).ready(function(){
	$('#tt').tabs({
	   onSelect:function(title){
	       $('#tt .panel-body').css('width','auto');
		}
	});
	$(".tabs-wrap").css('width','100%');
  });
 </script>
 </head>
 <body style="overflow-x: hidden;">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="tMcCustomResourceController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${tMcCustomResourcePage.id }">
	  				<input id="branchCode" name="branchCode" type="hidden" value="${tMcCustomResourcePage.branchCode }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right">
				<label class="Validform_label">月份:</label>
			</td>
			<td class="value" colspan="5">
				<input id="createMonth" name="createMonth" type="text" style="width: 150px"
					   class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM'})"  value='<fmt:formatDate value='${tMcCustomResourcePage.createMonth}' type="date" pattern="yyyy-MM"/>'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">月份</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">归属行部:</label>
			</td>
			<td class="value">
				<input id="branchName" name="branchName" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.branchName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">归属行部</label>
			</td>
			<td align="right">
				<label class="Validform_label">客户经理:</label>
			</td>
			<td class="value">
		     	 <input id="manager" name="manager" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.manager}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">客户经理</label>
			</td>
			<td align="right">
				<label class="Validform_label">客户代码:</label>
			</td>
			<td class="value">
		     	 <input id="customCode" name="customCode" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.customCode}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">客户代码</label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">客户姓名:</label>
			</td>
			<td class="value">
		     	 <input id="customName" name="customName" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.customName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">客户姓名</label>
			</td>
			<td align="right">
				<label class="Validform_label">身份证号码:</label>
			</td>
			<td class="value">
		     	 <input id="customIc" name="customIc" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.customIc}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">身份证号码</label>
			</td>
			<td align="right">
				<label class="Validform_label">产品类型:</label>
			</td>
			<td class="value">
				<t:dictSelect field="productType" type="list"
							  typeGroupCode="prod_type" defaultVal="${tMcCustomResourcePage.productType}" hasLabel="false"  title="产品类型"></t:dictSelect>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">产品类型</label>
			</td>
		</tr>
		<tr>
			<td align="right" rowspan="4">
				<label class="Validform_label">客户资产:</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否有房产:</label>
			</td>
			<td class="value">
					<t:dictSelect field="ownHouse" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.ownHouse}" hasLabel="false"  title="是否有房产"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否有房产</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否被他行抵押:</label>
			</td>
			<td class="value">
				<t:dictSelect field="guaranty" type="list"
							  typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.guaranty}" hasLabel="false"  title="是否被他行抵押"></t:dictSelect>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否被他行抵押</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">房产地址:</label>
			</td>
			<td class="value" colspan="3">
				<input id="houseAddress" name="houseAddress" type="text" style="width: 450px" class="inputxt" value='${tMcCustomResourcePage.houseAddress}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">房产地址</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">是否被他行资产保全:</label>
			</td>
			<td class="value">
					<t:dictSelect field="houseProtect" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.houseProtect}" hasLabel="false"  title="是否被他行资产保全"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否被他行资产保全</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否过户给他人:</label>
			</td>
			<td class="value">
					<t:dictSelect field="transferOther" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.transferOther}" hasLabel="false"  title="是否过户给他人"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否过户给他人</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">若过户给他人请填姓名:</label>
			</td>
			<td class="value">
		     	 <input id="otherName" name="otherName" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.otherName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">若过户给他人请填姓名</label>
			</td>
			<td align="right">
				<label class="Validform_label">房产证号:</label>
			</td>
			<td class="value">
		     	 <input id="houseNo" name="houseNo" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.houseNo}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">房产证号</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right" rowspan="5">
				<label class="Validform_label">配偶资产:</label>
			</td>
			<td align="right">
				<label class="Validform_label">配偶:</label>
			</td>
			<td class="value">
		     	 <input id="wifeName" name="wifeName" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.wifeName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">配偶</label>
			</td>
			<td align="right">
				<label class="Validform_label">配偶身份证号:</label>
			</td>
			<td class="value">
		     	 <input id="wifeIc" name="wifeIc" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.wifeIc}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">配偶身份证号</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">是否有房产:</label>
			</td>
			<td class="value">
					<t:dictSelect field="wifeOwnHouse" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.wifeOwnHouse}" hasLabel="false"  title="是否有房产"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否有房产</label>
			</td>
			<td align="right">
				<label class="Validform_label">房产证号:</label>
			</td>
			<td class="value">
				<input id="wifeHouseNo" name="wifeHouseNo" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.wifeHouseNo}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">房产证号</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">房产地址:</label>
			</td>
			<td class="value" colspan="3">
				<input id="wifeHouseAddress" name="wifeHouseAddress" type="text" style="width: 450px" class="inputxt" value='${tMcCustomResourcePage.wifeHouseAddress}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">房产地址</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">是否被他行抵押:</label>
			</td>
			<td class="value">
					<t:dictSelect field="wifeGuaranty" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.wifeGuaranty}" hasLabel="false"  title="是否被他行抵押"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否被他行抵押</label>
			</td>
			<td align="right">
				<label class="Validform_label">是否被他行资产保全:</label>
			</td>
			<td class="value">
					<t:dictSelect field="wifeHouseProtect" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.wifeHouseProtect}" hasLabel="false"  title="是否被他行资产保全"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否被他行资产保全</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
		<tr>
			<td align="right">
				<label class="Validform_label">是否过户给他人:</label>
			</td>
			<td class="value">
					<t:dictSelect field="wifeTransferOther" type="list"
						typeGroupCode="sf_yn" defaultVal="${tMcCustomResourcePage.wifeTransferOther}" hasLabel="false"  title="是否过户给他人"></t:dictSelect>     
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">是否过户给他人</label>
			</td>
			<td align="right">
				<label class="Validform_label">若过户给他人请填姓名:</label>
			</td>
			<td class="value">
		     	 <input id="wifeOtherName" name="wifeOtherName" type="text" style="width: 150px" class="inputxt" value='${tMcCustomResourcePage.wifeOtherName}'>
				<span class="Validform_checktip"></span>
				<label class="Validform_label" style="display: none;">若过户给他人请填姓名</label>
			</td>
			<td align="right">
				<label class="Validform_label"></label>
			</td>
		</tr>
	</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:800px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="tMcCustomResourceController.do?tMcCustomResourceProblemList&id=${tMcCustomResourcePage.id}&createMonth=${tMcCustomResourcePage.createMonth}&customCode=${tMcCustomResourcePage.customCode}&customName=${tMcCustomResourcePage.customName}" icon="icon-search" title="问题记录" id="tMcCustomResourceProblem"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 附表明细 模版 -->
		<table style="display:none">
		<tbody id="add_tMcCustomResourceProblem_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
							<t:dictSelect field="tMcCustomResourceProblemList[#index#].problem" type="checkbox"
										typeGroupCode="prob_type" defaultVal="" hasLabel="false"  title="资产存在问题"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">资产存在问题</label>
				  </td>
				  <td align="left">
					       	<input name="tMcCustomResourceProblemList[#index#].otherProblem" maxlength="2000" 
						  		type="text" class="inputxt"  style="width:120px;"  >
					  <label class="Validform_label" style="display: none;">其他问题请填写</label>
				  </td>
				  <td align="left">
					       	<input name="tMcCustomResourceProblemList[#index#].remark" maxlength="2000" 
						  		type="text" class="inputxt"  style="width:120px;"  >
					  <label class="Validform_label" style="display: none;">备注</label>
				  </td>
				  <td align="left">
							<t:dictSelect field="tMcCustomResourceProblemList[#index#].deal" type="checkbox"
										typeGroupCode="deal_type" defaultVal="" hasLabel="false"  title="下一步处理流程"></t:dictSelect>     
					  <label class="Validform_label" style="display: none;">下一步处理流程</label>
				  </td>
				  <td align="left">
					       	<input name="tMcCustomResourceProblemList[#index#].otherDeal" maxlength="2000" 
						  		type="text" class="inputxt"  style="width:120px;"  >
					  <label class="Validform_label" style="display: none;">其他处理请填写</label>
				  </td>
			</tr>
		 </tbody>
		</table>
 </body>
 <script src = "webpage/com/jeecg/resource/tMcCustomResource.js"></script>	
