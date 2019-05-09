package com.example.jdbc.generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 实体
 * @author Ryze
 * @date 2019-05-08 13:52:08
 * @version V 2.0.0
 */
@ApiModel(value = "实体", description = "")
public class BasicWechatResponse {
    /**
     * 
     */
    @ApiModelProperty(name = "id", value = "")
    private Long id;
    /**
     * 
     */
    @ApiModelProperty(name = "transactionId", value = "")
    private String transactionId;
    /**
     * 二维码链接
     */
    @ApiModelProperty(name = "codeUrl", value = "二维码链接")
    private String codeUrl;
    /**
     * 交易类型(微信、小程序、h5)
     */
    @ApiModelProperty(name = "tradeType", value = "交易类型(微信、小程序、h5)")
    private String tradeType;
    /**
     * 预支付交易会话标识
     */
    @ApiModelProperty(name = "prepayId", value = "预支付交易会话标识")
    private String prepayId;
    /**
     * 签名
     */
    @ApiModelProperty(name = "sign", value = "签名")
    private String sign;
    /**
     * 随机字符串
     */
    @ApiModelProperty(name = "nonceStr", value = "随机字符串")
    private String nonceStr;
    /**
     * 商户号
     */
    @ApiModelProperty(name = "mchId", value = "商户号")
    private String mchId;
    /**
     * 返回状态码  
     */
    @ApiModelProperty(name = "resultCode", value = "返回状态码  ")
    private String resultCode;
    /**
     * 返回信息
     */
    @ApiModelProperty(name = "returnMsg", value = "返回信息")
    private String returnMsg;
    /**
     * 业务结果
     */
    @ApiModelProperty(name = "returnCode", value = "业务结果")
    private String returnCode;
    /**
     * 小程序ID
     */
    @ApiModelProperty(name = "appid", value = "小程序ID")
    private String appid;
    /**
     * 预下单支付状态1已过期，0初始
     */
    @ApiModelProperty(name = "status", value = "预下单支付状态1已过期，0初始")
    private Long status;
    /**
     * 支付流水号
     */
    @ApiModelProperty(name = "paySerialNumber", value = "支付流水号")
    private String paySerialNumber;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public String getCodeUrl() {
        return this.codeUrl;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getPrepayId() {
        return this.prepayId;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return this.sign;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getNonceStr() {
        return this.nonceStr;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchId() {
        return this.mchId;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppid() {
        return this.appid;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber;
    }

    public String getPaySerialNumber() {
        return this.paySerialNumber;
    }


}