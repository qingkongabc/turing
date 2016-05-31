package com.jeecg.workorder.entity;

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
 * @Description: 现场派单
 * @author onlineGenerator
 * @date 2016-05-15 23:26:07
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_mc_work_order", schema = "")
@SuppressWarnings("serial")
public class TMcWorkOrderEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**派单生成时间*/
	@Excel(name="派单生成时间",format = "yyyy-MM-dd")
	private java.util.Date createDate;
	/**资产记录月份*/
	@Excel(name="资产记录月份",format = "yyyy-MM")
	private java.util.Date createMonth;
	/**机构名称*/
	@Excel(name="机构名称")
	private java.lang.String branchName;
	/**归属经理*/
	@Excel(name="归属经理")
	private java.lang.String manager;
	/**客户号*/
	@Excel(name="客户号")
	private java.lang.String customCode;
	/**客户姓名*/
	@Excel(name="客户姓名")
	private java.lang.String customName;
	/**身份证号码*/
	@Excel(name="身份证号码")
	private java.lang.String customIc;
	/**是否有房产*/
	@Excel(name="是否有房产")
	private java.lang.String ownHouse;
	/**派单类型*/
	private java.lang.String workOrderType;
	@Excel(name="派单类型")
	private java.lang.String workOrderTypeStr;
	/**机构号*/
	private java.lang.String branchCode;
	/**客户资产id*/
	private java.lang.String customResourceId;
	
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
	 *@return: java.util.Date  派单生成时间
	 */
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  派单生成时间
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  资产记录月份
	 */
	@Column(name ="CREATE_MONTH",nullable=true,length=20)
	public java.util.Date getCreateMonth(){
		return this.createMonth;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  资产记录月份
	 */
	public void setCreateMonth(java.util.Date createMonth){
		this.createMonth = createMonth;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  机构名称
	 */
	@Column(name ="BRANCH_NAME",nullable=true,length=200)
	public java.lang.String getBranchName(){
		return this.branchName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  机构名称
	 */
	public void setBranchName(java.lang.String branchName){
		this.branchName = branchName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归属经理
	 */
	@Column(name ="MANAGER",nullable=true,length=200)
	public java.lang.String getManager(){
		return this.manager;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归属经理
	 */
	public void setManager(java.lang.String manager){
		this.manager = manager;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户号
	 */
	@Column(name ="CUSTOM_CODE",nullable=true,length=200)
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
	 *@return: java.lang.String  派单类型
	 */
	@Column(name ="WORK_ORDER_TYPE",nullable=true,length=32)
	public java.lang.String getWorkOrderType(){
		return this.workOrderType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  派单类型
	 */
	public void setWorkOrderType(java.lang.String workOrderType){
		this.workOrderType = workOrderType;
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
	 *@return: java.lang.String  客户资产id
	 */
	@Column(name ="CUSTOM_RESOURCE_ID",nullable=true,length=36)
	public java.lang.String getCustomResourceId(){
		return this.customResourceId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户资产id
	 */
	public void setCustomResourceId(java.lang.String customResourceId){
		this.customResourceId = customResourceId;
	}

	@Column(name ="WORK_ORDER_TYPE_STR",nullable=true,length=200)
	public String getWorkOrderTypeStr() {
		return workOrderTypeStr;
	}

	public void setWorkOrderTypeStr(String workOrderTypeStr) {
		this.workOrderTypeStr = workOrderTypeStr;
	}
}
