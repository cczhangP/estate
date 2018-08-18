/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.contract.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 合同信息管理Entity
 * @author cczhang
 * @version 2018-08-16
 */
public class Contract extends DataEntity<Contract> {
	
	private static final long serialVersionUID = 1L;
	private String fcCode;		// 房产编号
	private String invoicesCode;		// 单据号
	private String contractType;		// 合同类型
	private String contractCode;		// 合同编号
	private String firstParty;		// 甲方
	private String firstPartyContacts;		// 甲方联系人
	private String firstPartyContactsPhone;		// 甲方联系人电话
	private String firstPartyContactsAdress;		// 甲方联系人地址
	private String secondParty;		// 乙方
	private String secondPartyContacts;		// 乙方联系人
	private String secondPartyContactsPhone;		// 乙方联系人电话
	private String secondPartyContactsAdress;		// 乙方联系人地址
	private String contractMoney;		// 合同金额
	private String registrant;		// 登记人
	private Date registrationDate;		// 登记日期
	private String attachment;		// 附件
	private String remake;		// 备注
	
	public Contract() {
		super();
	}

	public Contract(String id){
		super(id);
	}

	@Length(min=1, max=50, message="房产编号长度必须介于 1 和 50 之间")
	public String getFcCode() {
		return fcCode;
	}

	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
	}
	
	@Length(min=1, max=100, message="单据号长度必须介于 1 和 100 之间")
	public String getInvoicesCode() {
		return invoicesCode;
	}

	public void setInvoicesCode(String invoicesCode) {
		this.invoicesCode = invoicesCode;
	}
	
	@Length(min=1, max=12, message="合同类型长度必须介于 1 和 12 之间")
	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	
	@Length(min=1, max=100, message="合同编号长度必须介于 1 和 100 之间")
	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	
	@Length(min=1, max=100, message="甲方长度必须介于 1 和 100 之间")
	public String getFirstParty() {
		return firstParty;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}
	
	@Length(min=1, max=100, message="甲方联系人长度必须介于 1 和 100 之间")
	public String getFirstPartyContacts() {
		return firstPartyContacts;
	}

	public void setFirstPartyContacts(String firstPartyContacts) {
		this.firstPartyContacts = firstPartyContacts;
	}
	
	@Length(min=1, max=100, message="甲方联系人电话长度必须介于 1 和 100 之间")
	public String getFirstPartyContactsPhone() {
		return firstPartyContactsPhone;
	}

	public void setFirstPartyContactsPhone(String firstPartyContactsPhone) {
		this.firstPartyContactsPhone = firstPartyContactsPhone;
	}
	
	@Length(min=1, max=100, message="甲方联系人地址长度必须介于 1 和 100 之间")
	public String getFirstPartyContactsAdress() {
		return firstPartyContactsAdress;
	}

	public void setFirstPartyContactsAdress(String firstPartyContactsAdress) {
		this.firstPartyContactsAdress = firstPartyContactsAdress;
	}
	
	@Length(min=1, max=100, message="乙方长度必须介于 1 和 100 之间")
	public String getSecondParty() {
		return secondParty;
	}

	public void setSecondParty(String secondParty) {
		this.secondParty = secondParty;
	}
	
	@Length(min=1, max=100, message="乙方联系人长度必须介于 1 和 100 之间")
	public String getSecondPartyContacts() {
		return secondPartyContacts;
	}

	public void setSecondPartyContacts(String secondPartyContacts) {
		this.secondPartyContacts = secondPartyContacts;
	}
	
	@Length(min=1, max=100, message="乙方联系人电话长度必须介于 1 和 100 之间")
	public String getSecondPartyContactsPhone() {
		return secondPartyContactsPhone;
	}

	public void setSecondPartyContactsPhone(String secondPartyContactsPhone) {
		this.secondPartyContactsPhone = secondPartyContactsPhone;
	}
	
	@Length(min=1, max=100, message="乙方联系人地址长度必须介于 1 和 100 之间")
	public String getSecondPartyContactsAdress() {
		return secondPartyContactsAdress;
	}

	public void setSecondPartyContactsAdress(String secondPartyContactsAdress) {
		this.secondPartyContactsAdress = secondPartyContactsAdress;
	}
	
	public String getContractMoney() {
		return contractMoney;
	}

	public void setContractMoney(String contractMoney) {
		this.contractMoney = contractMoney;
	}
	
	@Length(min=1, max=100, message="登记人长度必须介于 1 和 100 之间")
	public String getRegistrant() {
		return registrant;
	}

	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="登记日期不能为空")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	@Length(min=1, max=100, message="附件长度必须介于 1 和 100 之间")
	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	@Length(min=1, max=100, message="备注长度必须介于 1 和 100 之间")
	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}
	
}