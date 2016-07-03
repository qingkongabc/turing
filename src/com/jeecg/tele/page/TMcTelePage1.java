
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
public class TMcTelePage1 implements java.io.Serializable {

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
     * 联系方式
     */
    @Excel(name = "联系方式")
    private String contract;
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

}
