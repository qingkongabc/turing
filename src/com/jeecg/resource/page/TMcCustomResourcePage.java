
package com.jeecg.resource.page;
import com.jeecg.resource.entity.TMcCustomResourceEntity;
import com.jeecg.resource.entity.TMcCustomResourceProblemEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;

/**   
 * @Title: Entity
 * @Description: 客户资产
 * @author onlineGenerator
 * @date 2016-05-15 17:14:14
 * @version V1.0   
 *
 */
public class TMcCustomResourcePage implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**月份*/
	@Excel(name="月份",format = "yyyy-MM")
	private java.util.Date createMonth;
	/**机构号*/
    @Excel(name="机构号")
	private java.lang.String branchCode;
	/**归属行部*/
    @Excel(name="归属行部")
	private java.lang.String branchName;
	/**客户经理*/
    @Excel(name="客户经理")
	private java.lang.String manager;
	/**
	 * 客户号
	 */
	@Excel(name = "客户号")
	private java.lang.String customCode;
	/**客户姓名*/
    @Excel(name="客户姓名")
	private java.lang.String customName;
	/**身份证号码*/
    @Excel(name="身份证号码")
	private java.lang.String customIc;
	/**产品类型*/
    @Excel(name="产品类型")
	private java.lang.String productType;
	/**是否有房产*/
    @Excel(name="是否有房产")
	private java.lang.String ownHouse;
	/**房产地址*/
    @Excel(name="房产地址")
	private java.lang.String houseAddress;
	/**是否被他行抵押*/
    @Excel(name="是否被他行抵押")
	private java.lang.String guaranty;
	/**是否被他行资产保全*/
    @Excel(name="是否被他行资产保全")
	private java.lang.String houseProtect;
	/**是否过户给他人*/
    @Excel(name="是否过户给他人")
	private java.lang.String transferOther;
	/**若过户给他人请填姓名*/
    @Excel(name="若过户给他人请填姓名")
	private java.lang.String otherName;
	/**房产证号*/
    @Excel(name="房产证号")
	private java.lang.String houseNo;
	/**配偶*/
    @Excel(name="配偶")
	private java.lang.String wifeName;
	/**配偶身份证号*/
    @Excel(name="配偶身份证号")
	private java.lang.String wifeIc;
	/**是否有房产*/
    @Excel(name="是否有房产(配偶)")
	private java.lang.String wifeOwnHouse;
	/**房产地址*/
    @Excel(name="房产地址(配偶)")
	private java.lang.String wifeHouseAddress;
	/**是否被他行抵押*/
    @Excel(name="是否被他行抵押(配偶)")
	private java.lang.String wifeGuaranty;
	/**是否被他行资产保全*/
    @Excel(name="是否被他行资产保全(配偶)")
	private java.lang.String wifeHouseProtect;
	/**是否过户给他人*/
    @Excel(name="是否过户给他人(配偶)")
	private java.lang.String wifeTransferOther;
	/**若过户给他人请填姓名*/
    @Excel(name="若过户给他人请填姓名(配偶)")
	private java.lang.String wifeOtherName;
	/**房产证号*/
    @Excel(name="房产证号(配偶)")
	private java.lang.String wifeHouseNo;

	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	private java.lang.String bpmStatus;

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构号
	 */
	public java.lang.String getBranchCode(){
		return this.branchCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构号
	 */
	public void setBranchCode(java.lang.String branchCode){
		this.branchCode = branchCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归属行部
	 */
	public java.lang.String getBranchName(){
		return this.branchName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归属行部
	 */
	public void setBranchName(java.lang.String branchName){
		this.branchName = branchName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户经理
	 */
	public java.lang.String getManager(){
		return this.manager;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户经理
	 */
	public void setManager(java.lang.String manager){
		this.manager = manager;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户号
	 */
	public java.lang.String getCustomCode(){
		return this.customCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户号
	 */
	public void setCustomCode(java.lang.String customCode){
		this.customCode = customCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户姓名
	 */
	public java.lang.String getCustomName(){
		return this.customName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户姓名
	 */
	public void setCustomName(java.lang.String customName){
		this.customName = customName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  身份证号码
	 */
	public java.lang.String getCustomIc(){
		return this.customIc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  身份证号码
	 */
	public void setCustomIc(java.lang.String customIc){
		this.customIc = customIc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品类型
	 */
	public java.lang.String getProductType(){
		return this.productType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品类型
	 */
	public void setProductType(java.lang.String productType){
		this.productType = productType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否有房产
	 */
	public java.lang.String getOwnHouse(){
		return this.ownHouse;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否有房产
	 */
	public void setOwnHouse(java.lang.String ownHouse){
		this.ownHouse = ownHouse;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  房产地址
	 */
	public java.lang.String getHouseAddress(){
		return this.houseAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  房产地址
	 */
	public void setHouseAddress(java.lang.String houseAddress){
		this.houseAddress = houseAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否被他行抵押
	 */
	public java.lang.String getGuaranty(){
		return this.guaranty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否被他行抵押
	 */
	public void setGuaranty(java.lang.String guaranty){
		this.guaranty = guaranty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否被他行资产保全
	 */
	public java.lang.String getHouseProtect(){
		return this.houseProtect;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否被他行资产保全
	 */
	public void setHouseProtect(java.lang.String houseProtect){
		this.houseProtect = houseProtect;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否过户给他人
	 */
	public java.lang.String getTransferOther(){
		return this.transferOther;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否过户给他人
	 */
	public void setTransferOther(java.lang.String transferOther){
		this.transferOther = transferOther;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  若过户给他人请填姓名
	 */
	public java.lang.String getOtherName(){
		return this.otherName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  若过户给他人请填姓名
	 */
	public void setOtherName(java.lang.String otherName){
		this.otherName = otherName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  房产证号
	 */
	public java.lang.String getHouseNo(){
		return this.houseNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  房产证号
	 */
	public void setHouseNo(java.lang.String houseNo){
		this.houseNo = houseNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  配偶
	 */
	public java.lang.String getWifeName(){
		return this.wifeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  配偶
	 */
	public void setWifeName(java.lang.String wifeName){
		this.wifeName = wifeName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  配偶身份证号
	 */
	public java.lang.String getWifeIc(){
		return this.wifeIc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  配偶身份证号
	 */
	public void setWifeIc(java.lang.String wifeIc){
		this.wifeIc = wifeIc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否有房产
	 */
	public java.lang.String getWifeOwnHouse(){
		return this.wifeOwnHouse;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否有房产
	 */
	public void setWifeOwnHouse(java.lang.String wifeOwnHouse){
		this.wifeOwnHouse = wifeOwnHouse;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  房产地址
	 */
	public java.lang.String getWifeHouseAddress(){
		return this.wifeHouseAddress;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  房产地址
	 */
	public void setWifeHouseAddress(java.lang.String wifeHouseAddress){
		this.wifeHouseAddress = wifeHouseAddress;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否被他行抵押
	 */
	public java.lang.String getWifeGuaranty(){
		return this.wifeGuaranty;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否被他行抵押
	 */
	public void setWifeGuaranty(java.lang.String wifeGuaranty){
		this.wifeGuaranty = wifeGuaranty;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否被他行资产保全
	 */
	public java.lang.String getWifeHouseProtect(){
		return this.wifeHouseProtect;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否被他行资产保全
	 */
	public void setWifeHouseProtect(java.lang.String wifeHouseProtect){
		this.wifeHouseProtect = wifeHouseProtect;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否过户给他人
	 */
	public java.lang.String getWifeTransferOther(){
		return this.wifeTransferOther;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否过户给他人
	 */
	public void setWifeTransferOther(java.lang.String wifeTransferOther){
		this.wifeTransferOther = wifeTransferOther;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  若过户给他人请填姓名
	 */
	public java.lang.String getWifeOtherName(){
		return this.wifeOtherName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  若过户给他人请填姓名
	 */
	public void setWifeOtherName(java.lang.String wifeOtherName){
		this.wifeOtherName = wifeOtherName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  房产证号
	 */
	public java.lang.String getWifeHouseNo(){
		return this.wifeHouseNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  房产证号
	 */
	public void setWifeHouseNo(java.lang.String wifeHouseNo){
		this.wifeHouseNo = wifeHouseNo;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  月份
	 */
	public java.util.Date getCreateMonth(){
		return this.createMonth;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  月份
	 */
	public void setCreateMonth(java.util.Date createMonth){
		this.createMonth = createMonth;
	}

	/**保存-问题记录*/
    @ExcelCollection(name="问题记录")
	private List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList = new ArrayList<TMcCustomResourceProblemEntity>();
		public List<TMcCustomResourceProblemEntity> getTMcCustomResourceProblemList() {
		return tMcCustomResourceProblemList;
		}
		public void setTMcCustomResourceProblemList(List<TMcCustomResourceProblemEntity> tMcCustomResourceProblemList) {
		this.tMcCustomResourceProblemList = tMcCustomResourceProblemList;
		}
}
