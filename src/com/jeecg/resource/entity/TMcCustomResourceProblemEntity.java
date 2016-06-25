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
	private java.lang.String problem;
	@Excel(name="资产存在问题")
	private java.lang.String problemStr;
	/**其他问题请填写*/
	@Excel(name="其他问题请填写")
	private java.lang.String otherProblem;
	/**备注*/
	@Excel(name="备注")
	private java.lang.String remark;
	/**下一步处理流程*/
	private java.lang.String deal;
    @Excel(name="下一步处理流程")
    private java.lang.String dealStr;
	/**其他处理请填写*/
	@Excel(name="其他处理请填写")
	private java.lang.String otherDeal;
	/**月份*/
	private java.util.Date createMonth;
	/**
	 * 客户号
	 */
	private java.lang.String customCode;
	/**客户姓名*/
	private java.lang.String customName;
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
	 * 处理人姓名
	 */
	private java.lang.String dealName;
	/**
	 * 处理人id
	 */
	private java.lang.String dealBy;
	/**
	 * 情况说明
	 */
	private java.lang.String feedback;

	@Column(name = "feedback", nullable = true, length = 2000)
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Column(name = "DEAL_NAME", nullable = true, length = 50)
	public String getDealName() {
		return dealName;
	}

	public void setDealName(String dealName) {
		this.dealName = dealName;
	}

	@Column(name = "DEAL_BY", nullable = true, length = 50)
	public String getDealBy() {
		return dealBy;
	}

	public void setDealBy(String dealBy) {
		this.dealBy = dealBy;
	}

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

    @Column(name ="PROBLEM_STR",nullable=true,length=200)
    public String getProblemStr() {
        return problemStr;
    }

    public void setProblemStr(String problemStr) {
        this.problemStr = problemStr;
    }

    @Column(name ="DEAL_STR",nullable=true,length=200)
    public String getDealStr() {
        return dealStr;
    }

    public void setDealStr(String dealStr) {
        this.dealStr = dealStr;
    }
}
