
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
     * 金融资产
     */
    @Excel(name = "金融资产")
    private String resource;
    /**
     * 贷款余额
     */
    @Excel(name = "贷款余额")
    private String loanBalance;
    /**
     * 存储余额
     */
    @Excel(name = "存储余额")
    private String depositBalance;
    /**
     * 信用卡
     */
    @Excel(name = "信用卡")
    private String creditCard;
    /**
     * 手机银行
     */
    @Excel(name = "手机银行")
    private String mobileBank;
    /**
     * 财神卡
     */
    @Excel(name = "财神卡")
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
     * 资金留存率
     */
    @Excel(name = "资金留存率")
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
     * @return: java.lang.String  金融资产
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  金融资产
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  贷款余额
     */
    public String getLoanBalance() {
        return this.loanBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  贷款余额
     */
    public void setLoanBalance(String loanBalance) {
        this.loanBalance = loanBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  存储余额
     */
    public String getDepositBalance() {
        return this.depositBalance;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  存储余额
     */
    public void setDepositBalance(String depositBalance) {
        this.depositBalance = depositBalance;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  信用卡
     */
    public String getCreditCard() {
        return this.creditCard;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  信用卡
     */
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  手机银行
     */
    public String getMobileBank() {
        return this.mobileBank;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  手机银行
     */
    public void setMobileBank(String mobileBank) {
        this.mobileBank = mobileBank;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  财神卡
     */
    public String getCard() {
        return this.card;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  财神卡
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
     * @return: java.lang.String  资金留存率
     */
    public String getFundsRate() {
        return this.fundsRate;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  资金留存率
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
