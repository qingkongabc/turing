package com.jeecg.resource.entity;
import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 客户资产
 * @author onlineGenerator
 * @date 2016-05-15 17:14:14
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_mc_custom_resource", schema = "")
@SuppressWarnings("serial")
public class TMcCustomResourceEntity implements java.io.Serializable {
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
	/**客户代码*/
    @Excel(name="客户代码")
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
    @Excel(name="是否有房产")
	private java.lang.String wifeOwnHouse;
	/**房产地址*/
    @Excel(name="房产地址")
	private java.lang.String wifeHouseAddress;
	/**是否被他行抵押*/
    @Excel(name="是否被他行抵押")
	private java.lang.String wifeGuaranty;
	/**是否被他行资产保全*/
    @Excel(name="是否被他行资产保全")
	private java.lang.String wifeHouseProtect;
	/**是否过户给他人*/
    @Excel(name="是否过户给他人")
	private java.lang.String wifeTransferOther;
	/**若过户给他人请填姓名*/
    @Excel(name="若过户给他人请填姓名")
	private java.lang.String wifeOtherName;
	/**房产证号*/
    @Excel(name="房产证号")
	private java.lang.String wifeHouseNo;

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
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
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  月份
	 */
	@Column(name ="CREATE_MONTH",nullable=true,length=32)
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

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构号
	 */

	@Column(name ="BRANCH_CODE",nullable=true,length=200)
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

	@Column(name ="BRANCH_NAME",nullable=true,length=200)
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

	@Column(name ="MANAGER",nullable=true,length=200)
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
	 *@return: java.lang.String  客户代码
	 */

	@Column(name ="CUSTOM_CODE",nullable=true,length=200)
	public java.lang.String getCustomCode(){
		return this.customCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户代码
	 */
	public void setCustomCode(java.lang.String customCode){
		this.customCode = customCode;
	}

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户姓名
	 */

	@Column(name ="CUSTOM_NAME",nullable=true,length=200)
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

	@Column(name ="CUSTOM_IC",nullable=true,length=200)
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

	@Column(name ="PRODUCT_TYPE",nullable=true,length=32)
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

	@Column(name ="OWN_HOUSE",nullable=true,length=200)
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

	@Column(name ="HOUSE_ADDRESS",nullable=true,length=200)
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

	@Column(name ="GUARANTY",nullable=true,length=32)
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

	@Column(name ="HOUSE_PROTECT",nullable=true,length=32)
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

	@Column(name ="TRANSFER_OTHER",nullable=true,length=32)
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

	@Column(name ="OTHER_NAME",nullable=true,length=200)
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

	@Column(name ="HOUSE_NO",nullable=true,length=200)
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

	@Column(name ="WIFE_NAME",nullable=true,length=200)
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

	@Column(name ="WIFE_IC",nullable=true,length=200)
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

	@Column(name ="WIFE_OWN_HOUSE",nullable=true,length=32)
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

	@Column(name ="WIFE_HOUSE_ADDRESS",nullable=true,length=200)
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

	@Column(name ="WIFE_GUARANTY",nullable=true,length=32)
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

	@Column(name ="WIFE_HOUSE_PROTECT",nullable=true,length=32)
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

	@Column(name ="WIFE_TRANSFER_OTHER",nullable=true,length=32)
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

	@Column(name ="WIFE_OTHER_NAME",nullable=true,length=200)
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

	@Column(name ="WIFE_HOUSE_NO",nullable=true,length=200)
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

}
