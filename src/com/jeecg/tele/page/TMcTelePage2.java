
package com.jeecg.tele.page;

import com.jeecg.tele.entity.TMcTeleSubEntity;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author onlineGenerator
 * @version V1.0
 * @Title: Entity
 * @Description: 客群信息
 * @date 2016-06-30 21:28:28
 */
public class TMcTelePage2 implements java.io.Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 创建人名称
     */
    private String createName;
    /**
     * 创建人登录名称
     */
    private String createBy;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新人名称
     */
    private String updateName;
    /**
     * 更新人登录名称
     */
    private String updateBy;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 所属部门
     */
    private String sysOrgCode;
    /**
     * 所属公司
     */
    private String sysCompanyCode;
    /**
     * 流程状态
     */
    private String bpmStatus;
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
    private String dataResource;
    /**
     * 证件号
     */
    @Excel(name = "证件号")
    private String credential;
    /**
     * 企业名称
     */
    @Excel(name = "企业名称")
    private String companyName;
    /**
     * 法人
     */
    @Excel(name = "法人")
    private String manager;
    /**
     * 注册资本
     */
    @Excel(name = "注册资本")
    private java.lang.String regCapital;
    /**
     * 成立时间
     */
    @Excel(name = "成立时间", format = "yyyy-MM-dd")
    private Date buildDate;
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
    private String customerService;
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
    @Excel(name = "反馈信息")
    private java.lang.String feedback;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * 客服人员id
     */
    private String customerServiceId;
    /**
     * 客户姓名
     */
    @Excel(name = "客户姓名")
    private String customName;
    /**
     * 身份证号
     */
    @Excel(name = "身份证号")
    private String idCard;
    /**
     * 客户号
     */
    @Excel(name = "客户号")
    private String customId;
    /**
     * 产品名称1
     */
    @Excel(name = "产品名称1")
    private String resource;
    /**
     * 产品名称2
     */
    @Excel(name = "产品名称2")
    private String loanBalance;
    /**
     * 金额1
     */
    @Excel(name = "金额1")
    private String depositBalance;
    /**
     * 金额2
     */
    @Excel(name = "金额2")
    private String creditCard;
    /**
     * 存款日均
     */
    @Excel(name = "存款日均")
    private String mobileBank;
    /**
     * 金融资产日均
     */
    @Excel(name = "金融资产日均")
    private String card;
    /**
     * 保险销售
     */
    @Excel(name = "保险销售")
    private String insurance;
    /**
     * 活期存款余额
     */
    @Excel(name = "活期存款余额")
    private String ddBalance;
    /**
     * 客服人员
     */
    @Excel(name = "客服人员")
    private String fundsRate;
    /**
     * 机构
     */
    @Excel(name = "机构")
    private String orgName;
    /**
     * 客户经理
     */
    @Excel(name = "客户经理")
    private String customManager;

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

    public String getMarketingStatus() {
        return marketingStatus;
    }

    public void setMarketingStatus(String marketingStatus) {
        this.marketingStatus = marketingStatus;
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
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  id
     */
    public String getId() {
        return this.id;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  创建人名称
     */
    public String getCreateName() {
        return this.createName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  创建人名称
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  创建人登录名称
     */
    public String getCreateBy() {
        return this.createBy;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  创建人登录名称
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  创建日期
     */
    public Date getCreateDate() {
        return this.createDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  更新人名称
     */
    public String getUpdateName() {
        return this.updateName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  更新人名称
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  更新人登录名称
     */
    public String getUpdateBy() {
        return this.updateBy;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  更新人登录名称
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  更新日期
     */
    public Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  所属部门
     */
    public String getSysOrgCode() {
        return this.sysOrgCode;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  所属部门
     */
    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  所属公司
     */
    public String getSysCompanyCode() {
        return this.sysCompanyCode;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  所属公司
     */
    public void setSysCompanyCode(String sysCompanyCode) {
        this.sysCompanyCode = sysCompanyCode;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  流程状态
     */
    public String getBpmStatus() {
        return this.bpmStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  流程状态
     */
    public void setBpmStatus(String bpmStatus) {
        this.bpmStatus = bpmStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  数据来源
     */
    public String getDataResource() {
        return this.dataResource;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  数据来源
     */
    public void setDataResource(String dataResource) {
        this.dataResource = dataResource;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  证件号
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  证件号
     */
    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  法人
     */
    public String getManager() {
        return this.manager;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  法人
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  企业名称
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  企业名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  成立时间
     */
    public Date getBuildDate() {
        return this.buildDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  成立时间
     */
    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  经营范围
     */
    public String getBusiness() {
        return this.business;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  经营范围
     */
    public void setBusiness(String business) {
        this.business = business;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  联系方式
     */
    public String getContract() {
        return this.contract;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  联系方式
     */
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员
     */
    public String getCustomerService() {
        return this.customerService;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员
     */
    public void setCustomerService(String customerService) {
        this.customerService = customerService;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员id
     */
    public String getCustomerServiceId() {
        return this.customerServiceId;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员id
     */
    public void setCustomerServiceId(String customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户姓名
     */
    public String getCustomName() {
        return this.customName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户姓名
     */
    public void setCustomName(String customName) {
        this.customName = customName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  身份证号
     */
    public String getIdCard() {
        return this.idCard;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户号
     */
    public String getCustomId() {
        return this.customId;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户号
     */
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  产品名称1
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  产品名称1
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  产品名称2
     */
    public String getLoanBalance() {
        return this.loanBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  产品名称2
     */
    public void setLoanBalance(String loanBalance) {
        this.loanBalance = loanBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金额1
     */
    public String getDepositBalance() {
        return this.depositBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金额1
     */
    public void setDepositBalance(String depositBalance) {
        this.depositBalance = depositBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金额2
     */
    public String getCreditCard() {
        return this.creditCard;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金额2
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  存款日均
     */
    public String getMobileBank() {
        return this.mobileBank;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  存款日均
     */
    public void setMobileBank(String mobileBank) {
        this.mobileBank = mobileBank;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  金融资产日均
     */
    public String getCard() {
        return this.card;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金融资产日均
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  保险销售
     */
    public String getInsurance() {
        return this.insurance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  保险销售
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  活期存款余额
     */
    public String getDdBalance() {
        return this.ddBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  活期存款余额
     */
    public void setDdBalance(String ddBalance) {
        this.ddBalance = ddBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员
     */
    public String getFundsRate() {
        return this.fundsRate;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客服人员
     */
    public void setFundsRate(String fundsRate) {
        this.fundsRate = fundsRate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  机构
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  机构
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客户经理
     */
    public String getCustomManager() {
        return this.customManager;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  客户经理
     */
    public void setCustomManager(String customManager) {
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
