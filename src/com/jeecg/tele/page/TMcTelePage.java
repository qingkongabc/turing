
package com.jeecg.tele.page;

import com.jeecg.tele.entity.TMcTeleEntity;
import com.jeecg.tele.entity.TMcTeleSubEntity;

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
 * @author onlineGenerator
 * @version V1.0
 * @Title: Entity
 * @Description: 客群信息
 * @date 2016-06-30 21:28:28
 */
public class TMcTelePage implements java.io.Serializable {
    /**
     * id
     */
    private java.lang.String id;
    /**
     * 创建人名称
     */
    private java.lang.String createName;
    /**
     * 创建人登录名称
     */
    private java.lang.String createBy;
    /**
     * 创建日期
     */
    private java.util.Date createDate;
    /**
     * 更新人名称
     */
    private java.lang.String updateName;
    /**
     * 更新人登录名称
     */
    private java.lang.String updateBy;
    /**
     * 更新日期
     */
    private java.util.Date updateDate;
    /**
     * 所属部门
     */
    private java.lang.String sysOrgCode;
    /**
     * 所属公司
     */
    private java.lang.String sysCompanyCode;
    /**
     * 流程状态
     */
    private java.lang.String bpmStatus;
    /**机构号*/
    @Excel(name="机构号")
    private java.lang.String branchCode;
    /**归属行部*/
    @Excel(name="归属行部")
    private java.lang.String branchName;
    /**客户经理*/
    @Excel(name="客户经理")
    private java.lang.String telManager;
    /**
     * 数据来源
     */
    @Excel(name = "数据来源")
    private java.lang.String dataResource;
    /**
     * 证件号
     */
    @Excel(name = "证件号")
    private java.lang.String credential;
    /**
     * 企业名称
     */
    @Excel(name = "企业名称")
    private java.lang.String companyName;
    /**
     * 法人
     */
    @Excel(name = "法人")
    private java.lang.String manager;
    /**
     * 注册资本
     */
    @Excel(name = "注册资本")
    private java.lang.String regCapital;
    /**
     * 成立时间
     */
    @Excel(name = "成立时间", format = "yyyy-MM-dd")
    private java.util.Date buildDate;
    /**
     * 地址
     */
    @Excel(name = "地址范围")
    private java.lang.String address;
    /**
     * 经营范围
     */
    @Excel(name = "经营范围")
    private java.lang.String business;
    /**
     * 联系方式
     */
    @Excel(name = "联系方式")
    private java.lang.String contract;
    /**
     * 客服人员
     */
    @Excel(name = "客服人员")
    private java.lang.String customerService;
    /**
     * 营销时间
     */
    @Excel(name = "营销时间", format = "yyyy-MM-dd")
    private java.util.Date disDate;

    @Excel(name = "营销状态")
    private java.lang.String marketingStatus;
    @Excel(name = "营销状态1")
    private java.lang.String status1;
    @Excel(name = "营销状态2")
    private java.lang.String status2;
    @Excel(name = "营销状态3")
    private java.lang.String status3;
    @Excel(name = "产品")
    private java.lang.String product;
    @Excel(name = "备注")
    private java.lang.String remark;
    @Excel(name = "落地状态")
    private java.lang.String signStatus;
    @Excel(name = "反馈状态")
    private java.lang.String feedbackStatus;
    @Excel(name = "反馈信息")
    private java.lang.String feedback;

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getTelManager() {
        return telManager;
    }

    public void setTelManager(String telManager) {
        this.telManager = telManager;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 客服人员id
     */
    private java.lang.String customerServiceId;
    /**
     * 客户姓名
     */
    private java.lang.String customName;
    /**
     * 身份证号
     */
    private java.lang.String idCard;
    /**
     * 客户号
     */
    private java.lang.String customId;
    /**
     * 产品名称1
     */
    private java.lang.String resource;
    /**
     * 产品名称2
     */
    private java.lang.String loanBalance;
    /**
     * 金额1
     */
    private java.lang.String depositBalance;
    /**
     * 金额2
     */
    private java.lang.String creditCard;
    /**
     * 存款日均
     */
    private java.lang.String mobileBank;
    /**
     * 金融资产日均
     */
    private java.lang.String card;
    /**
     * 保险销售
     */
    private java.lang.String insurance;
    /**
     * 活期存款余额
     */
    private java.lang.String ddBalance;
    /**
     * 客服人员
     */
    private java.lang.String fundsRate;
    /**
     * 机构
     */
    private java.lang.String orgName;
    /**
     * 客户经理
     */
    private java.lang.String customManager;

    public String getMarketingStatus() {
        return marketingStatus;
    }

    public void setMarketingStatus(String marketingStatus) {
        this.marketingStatus = marketingStatus;
    }

    public Date getDisDate() {
        return disDate;
    }

    public void setDisDate(Date disDate) {
        this.disDate = disDate;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  id
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  创建人名称
     */
    public java.lang.String getCreateName() {
        return this.createName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  创建人名称
     */
    public void setCreateName(java.lang.String createName) {
        this.createName = createName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  创建人登录名称
     */
    public java.lang.String getCreateBy() {
        return this.createBy;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  创建人登录名称
     */
    public void setCreateBy(java.lang.String createBy) {
        this.createBy = createBy;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  创建日期
     */
    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  创建日期
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  更新人名称
     */
    public java.lang.String getUpdateName() {
        return this.updateName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  更新人名称
     */
    public void setUpdateName(java.lang.String updateName) {
        this.updateName = updateName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  更新人登录名称
     */
    public java.lang.String getUpdateBy() {
        return this.updateBy;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  更新人登录名称
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  更新日期
     */
    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  更新日期
     */
    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  所属部门
     */
    public java.lang.String getSysOrgCode() {
        return this.sysOrgCode;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  所属部门
     */
    public void setSysOrgCode(java.lang.String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  所属公司
     */
    public java.lang.String getSysCompanyCode() {
        return this.sysCompanyCode;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  所属公司
     */
    public void setSysCompanyCode(java.lang.String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  流程状态
     */
    public java.lang.String getBpmStatus() {
        return this.bpmStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  流程状态
     */
    public void setBpmStatus(java.lang.String bpmStatus) {
        this.bpmStatus = bpmStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  数据来源
     */
    public java.lang.String getDataResource() {
        return this.dataResource;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  数据来源
     */
    public void setDataResource(java.lang.String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  证件号
     */
    public java.lang.String getCredential() {
        return this.credential;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  证件号
     */
    public void setCredential(java.lang.String credential) {
        this.credential = credential;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  法人
     */
    public java.lang.String getManager() {
        return this.manager;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  法人
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  企业名称
     */
    public java.lang.String getCompanyName() {
        return this.companyName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  企业名称
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  成立时间
     */
    public java.util.Date getBuildDate() {
        return this.buildDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  成立时间
     */
    public void setBuildDate(java.util.Date buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  经营范围
     */
    public java.lang.String getBusiness() {
        return this.business;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  经营范围
     */
    public void setBusiness(java.lang.String business) {
        this.business = business;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  联系方式
     */
    public java.lang.String getContract() {
        return this.contract;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  联系方式
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  地址
     */
    public java.lang.String getAddress() {
        return this.address;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  地址
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员
     */
    public java.lang.String getCustomerService() {
        return this.customerService;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员
     */
    public void setCustomerService(java.lang.String customerService) {
        this.customerService = customerService;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员id
     */
    public java.lang.String getCustomerServiceId() {
        return this.customerServiceId;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员id
     */
    public void setCustomerServiceId(java.lang.String customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户姓名
     */
    public java.lang.String getCustomName() {
        return this.customName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户姓名
     */
    public void setCustomName(java.lang.String customName) {
        this.customName = customName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  身份证号
     */
    public java.lang.String getIdCard() {
        return this.idCard;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  身份证号
     */
    public void setIdCard(java.lang.String idCard) {
        this.idCard = idCard;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户号
     */
    public java.lang.String getCustomId() {
        return this.customId;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户号
     */
    public void setCustomId(java.lang.String customId) {
        this.customId = customId;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  产品名称1
     */
    public java.lang.String getResource() {
        return this.resource;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  产品名称1
     */
    public void setResource(java.lang.String resource) {
        this.resource = resource;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  产品名称2
     */
    public java.lang.String getLoanBalance() {
        return this.loanBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  产品名称2
     */
    public void setLoanBalance(java.lang.String loanBalance) {
        this.loanBalance = loanBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金额1
     */
    public java.lang.String getDepositBalance() {
        return this.depositBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金额1
     */
    public void setDepositBalance(java.lang.String depositBalance) {
        this.depositBalance = depositBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金额2
     */
    public java.lang.String getCreditCard() {
        return this.creditCard;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金额2
     */
    public void setCreditCard(java.lang.String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  存款日均
     */
    public java.lang.String getMobileBank() {
        return this.mobileBank;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  存款日均
     */
    public void setMobileBank(java.lang.String mobileBank) {
        this.mobileBank = mobileBank;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金融资产日均
     */
    public java.lang.String getCard() {
        return this.card;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金融资产日均
     */
    public void setCard(java.lang.String card) {
        this.card = card;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  保险销售
     */
    public java.lang.String getInsurance() {
        return this.insurance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  保险销售
     */
    public void setInsurance(java.lang.String insurance) {
        this.insurance = insurance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  活期存款余额
     */
    public java.lang.String getDdBalance() {
        return this.ddBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  活期存款余额
     */
    public void setDdBalance(java.lang.String ddBalance) {
        this.ddBalance = ddBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员
     */
    public java.lang.String getFundsRate() {
        return this.fundsRate;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员
     */
    public void setFundsRate(java.lang.String fundsRate) {
        this.fundsRate = fundsRate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  机构
     */
    public java.lang.String getOrgName() {
        return this.orgName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  机构
     */
    public void setOrgName(java.lang.String orgName) {
        this.orgName = orgName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户经理
     */
    public java.lang.String getCustomManager() {
        return this.customManager;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户经理
     */
    public void setCustomManager(java.lang.String customManager) {
        this.customManager = customManager;
    }

    /**
     * 保存-信息补录
     */
    @ExcelCollection(name = "信息补录")
    private List<TMcTeleSubEntity> tMcTeleSubList = new ArrayList<TMcTeleSubEntity>();

    public List<TMcTeleSubEntity> getTMcTeleSubList() {
        return tMcTeleSubList;
    }

    public void setTMcTeleSubList(List<TMcTeleSubEntity> tMcTeleSubList) {
        this.tMcTeleSubList = tMcTeleSubList;
    }
}
