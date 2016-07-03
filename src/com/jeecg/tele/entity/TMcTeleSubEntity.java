package com.jeecg.tele.entity;

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
 * @author onlineGenerator
 * @version V1.0
 * @Title: Entity
 * @Description: 信息补录
 * @date 2016-06-30 21:28:28
 */
@Entity
@Table(name = "t_mc_tele_sub", schema = "")
@SuppressWarnings("serial")
public class TMcTeleSubEntity implements java.io.Serializable {
    /**
     * 主键
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
    /**
     * 外键
     */
    private java.lang.String teleIdFk;
    /**
     * 营销状态
     */
    @Excel(name = "营销状态")
    private java.lang.String marketingStatus;
    /**
     * 产品或服务需求
     */
    @Excel(name = "产品或服务需求")
    private java.lang.String produceService;
    /**
     * 主营业务
     */
    @Excel(name = "主营业务")
    private java.lang.String business;
    /**
     * 资产状况
     */
    @Excel(name = "资产状况")
    private java.lang.String resourceStatus;
    /**
     * 联系方式
     */
    @Excel(name = "联系方式")
    private java.lang.String contract;
    /**
     * 信用卡情况
     */
    @Excel(name = "信用卡情况")
    private java.lang.String cardStatus;
    /**
     * 负债状况
     */
    @Excel(name = "负债状况")
    private java.lang.String ownStatus;
    /**
     * 征信情况
     */
    @Excel(name = "征信情况")
    private java.lang.String creditStatus;
    /**
     * 结息情况
     */
    @Excel(name = "结息情况")
    private java.lang.String interestStatus;
    /**
     * 营销时间
     */
    @Excel(name = "营销时间", format = "yyyy-MM-dd")
    private java.util.Date sellDate;
    /**
     * 客服人员
     */
    @Excel(name = "客服人员")
    private java.lang.String customerService;
    /**
     * 备注
     */
    @Excel(name = "备注")
    private java.lang.String remark;

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  主键
     */
    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
    @Column(name = "ID", nullable = false, length = 36)
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  主键
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  创建人名称
     */
    @Column(name = "CREATE_NAME", nullable = true, length = 50)
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
    @Column(name = "CREATE_BY", nullable = true, length = 50)
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
    @Column(name = "CREATE_DATE", nullable = true, length = 20)
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
    @Column(name = "UPDATE_NAME", nullable = true, length = 50)
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
    @Column(name = "UPDATE_BY", nullable = true, length = 50)
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
    @Column(name = "UPDATE_DATE", nullable = true, length = 20)
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
    @Column(name = "SYS_ORG_CODE", nullable = true, length = 50)
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
    @Column(name = "SYS_COMPANY_CODE", nullable = true, length = 50)
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
    @Column(name = "BPM_STATUS", nullable = true, length = 32)
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
     * @return: java.lang.String  外键
     */
    @Column(name = "TELE_ID_FK", nullable = true, length = 36)
    public java.lang.String getTeleIdFk() {
        return this.teleIdFk;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  外键
     */
    public void setTeleIdFk(java.lang.String teleIdFk) {
        this.teleIdFk = teleIdFk;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  营销状态
     */
    @Column(name = "MARKETING_STATUS", nullable = true, length = 200)
    public java.lang.String getMarketingStatus() {
        return this.marketingStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  营销状态
     */
    public void setMarketingStatus(java.lang.String marketingStatus) {
        this.marketingStatus = marketingStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  产品或服务需求
     */
    @Column(name = "PRODUCE_SERVICE", nullable = true, length = 200)
    public java.lang.String getProduceService() {
        return this.produceService;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  产品或服务需求
     */
    public void setProduceService(java.lang.String produceService) {
        this.produceService = produceService;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  主营业务
     */
    @Column(name = "BUSINESS", nullable = true, length = 200)
    public java.lang.String getBusiness() {
        return this.business;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  主营业务
     */
    public void setBusiness(java.lang.String business) {
        this.business = business;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  资产状况
     */
    @Column(name = "RESOURCE_STATUS", nullable = true, length = 200)
    public java.lang.String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  资产状况
     */
    public void setResourceStatus(java.lang.String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  联系方式
     */
    @Column(name = "CONTRACT", nullable = true, length = 32)
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
     * @return: java.lang.String  信用卡情况
     */
    @Column(name = "CARD_STATUS", nullable = true, length = 200)
    public java.lang.String getCardStatus() {
        return this.cardStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  信用卡情况
     */
    public void setCardStatus(java.lang.String cardStatus) {
        this.cardStatus = cardStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  负债状况
     */
    @Column(name = "OWN_STATUS", nullable = true, length = 200)
    public java.lang.String getOwnStatus() {
        return this.ownStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  负债状况
     */
    public void setOwnStatus(java.lang.String ownStatus) {
        this.ownStatus = ownStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  征信情况
     */
    @Column(name = "CREDIT_STATUS", nullable = true, length = 200)
    public java.lang.String getCreditStatus() {
        return this.creditStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  征信情况
     */
    public void setCreditStatus(java.lang.String creditStatus) {
        this.creditStatus = creditStatus;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  结息情况
     */
    @Column(name = "INTEREST_STATUS", nullable = true, length = 200)
    public java.lang.String getInterestStatus() {
        return this.interestStatus;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  结息情况
     */
    public void setInterestStatus(java.lang.String interestStatus) {
        this.interestStatus = interestStatus;
    }

    /**
     * 方法: 取得java.util.Date
     *
     * @return: java.util.Date  营销时间
     */
    @Column(name = "SELL_DATE", nullable = true, length = 32)
    public java.util.Date getSellDate() {
        return this.sellDate;
    }

    /**
     * 方法: 设置java.util.Date
     *
     * @param: java.util.Date  营销时间
     */
    public void setSellDate(java.util.Date sellDate) {
        this.sellDate = sellDate;
    }

    /**
     * 方法: 取得java.lang.String
     *
     * @return: java.lang.String  客服人员
     */
    @Column(name = "CUSTOMER_SERVICE", nullable = true, length = 32)
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
     * @return: java.lang.String  备注
     */
    @Column(name = "REMARK", nullable = true, length = 2000)
    public java.lang.String getRemark() {
        return this.remark;
    }

    /**
     * 方法: 设置java.lang.String
     *
     * @param: java.lang.String  备注
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }
}
