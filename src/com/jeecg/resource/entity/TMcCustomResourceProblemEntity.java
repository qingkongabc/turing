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
 * @Description: 问题记录
 * @author onlineGenerator
 * @date 2016-05-15 17:14:14
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_mc_custom_resource_problem", schema = "")
@SuppressWarnings("serial")
public class TMcCustomResourceProblemEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**客户资产id*/
	private java.lang.String customResourceId;
	/**资产存在问题*/
	@Excel(name="资产存在问题")
	private java.lang.String problem;
	/**其他问题请填写*/
	@Excel(name="其他问题请填写")
	private java.lang.String otherProblem;
	/**备注*/
	@Excel(name="备注")
	private java.lang.String remark;
	/**下一步处理流程*/
	@Excel(name="下一步处理流程")
	private java.lang.String deal;
	/**其他处理请填写*/
	@Excel(name="其他处理请填写")
	private java.lang.String otherDeal;
	/**月份*/
	private java.util.Date createMonth;
	/**客户代码*/
	private java.lang.String customCode;
	/**客户姓名*/
	private java.lang.String customName;
	
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
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户资产id
	 */
	@Column(name ="CUSTOM_RESOURCE_ID",nullable=true,length=32)
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  资产存在问题
	 */
	@Column(name ="PROBLEM",nullable=true,length=32)
	public java.lang.String getProblem(){
		return this.problem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  资产存在问题
	 */
	public void setProblem(java.lang.String problem){
		this.problem = problem;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他问题请填写
	 */
	@Column(name ="OTHER_PROBLEM",nullable=true,length=2000)
	public java.lang.String getOtherProblem(){
		return this.otherProblem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他问题请填写
	 */
	public void setOtherProblem(java.lang.String otherProblem){
		this.otherProblem = otherProblem;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="REMARK",nullable=true,length=2000)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  下一步处理流程
	 */
	@Column(name ="DEAL",nullable=true,length=32)
	public java.lang.String getDeal(){
		return this.deal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  下一步处理流程
	 */
	public void setDeal(java.lang.String deal){
		this.deal = deal;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  其他处理请填写
	 */
	@Column(name ="OTHER_DEAL",nullable=true,length=2000)
	public java.lang.String getOtherDeal(){
		return this.otherDeal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  其他处理请填写
	 */
	public void setOtherDeal(java.lang.String otherDeal){
		this.otherDeal = otherDeal;
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
}
