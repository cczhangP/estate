/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.certificate.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 产证信息管理Entity
 * @author cczhang
 * @version 2018-08-16
 */
public class Certificate extends DataEntity<Certificate> {
	
	private static final long serialVersionUID = 1L;
	private String certificateName;		// 产证名称
	private String certificateCode;		// 产证编号
	private Date certificateTerm;		// 产证期限
	private Date certificateDate;		// 发证日期
	private String handleSituation;		// 办理情况
	private String managerDepartment;		// 原管理部门
	private String fcCode;		// 房产编号
	private String fcState;		// 房产状态
	private String landName;		// 土地名称
	private String architectureArea;		// 建筑面积
	private String landArea;		// 宗地面积
	private String useArea;		// 使用面积
	private String architecture;		// 是否有建筑物
	private String ownershipName;		// 所有权人
	private String purpose;		// 用途
	private String price;		// 登记价格
	private String rights;		// 其他权利
	private String description;		// 情况说明
	private String otherDepartments;		// 扫描或复印件管理部门
	private String address;		// 地址
	private String notes;		// 备注
	private String handover;		// 权证交接单
	private String papers;		// 证件原件扫描件
	private String handoverDownload;		// 权证交接单下载
	private String papersDownload;		// 证件原件扫描件下载
	
	public Certificate() {
		super();
	}

	public Certificate(String id){
		super(id);
	}

	@Length(min=1, max=50, message="产证名称长度必须介于 1 和 50 之间")
	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	@Length(min=1, max=20, message="产证编号长度必须介于 1 和 20 之间")
	public String getCertificateCode() {
		return certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="产证期限不能为空")
	public Date getCertificateTerm() {
		return certificateTerm;
	}

	public void setCertificateTerm(Date certificateTerm) {
		this.certificateTerm = certificateTerm;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="发证日期不能为空")
	public Date getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}
	
	@Length(min=1, max=20, message="办理情况长度必须介于 1 和 20 之间")
	public String getHandleSituation() {
		return handleSituation;
	}

	public void setHandleSituation(String handleSituation) {
		this.handleSituation = handleSituation;
	}
	
	@Length(min=1, max=20, message="原管理部门长度必须介于 1 和 20 之间")
	public String getManagerDepartment() {
		return managerDepartment;
	}

	public void setManagerDepartment(String managerDepartment) {
		this.managerDepartment = managerDepartment;
	}
	
	@Length(min=1, max=50, message="房产编号长度必须介于 1 和 50 之间")
	public String getFcCode() {
		return fcCode;
	}

	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
	}
	
	@Length(min=1, max=20, message="房产状态长度必须介于 1 和 20 之间")
	public String getFcState() {
		return fcState;
	}

	public void setFcState(String fcState) {
		this.fcState = fcState;
	}
	
	@Length(min=1, max=50, message="土地名称长度必须介于 1 和 50 之间")
	public String getLandName() {
		return landName;
	}

	public void setLandName(String landName) {
		this.landName = landName;
	}
	
	public String getArchitectureArea() {
		return architectureArea;
	}

	public void setArchitectureArea(String architectureArea) {
		this.architectureArea = architectureArea;
	}
	
	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}
	
	public String getUseArea() {
		return useArea;
	}

	public void setUseArea(String useArea) {
		this.useArea = useArea;
	}
	
	@Length(min=1, max=10, message="是否有建筑物长度必须介于 1 和 10 之间")
	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	
	@Length(min=1, max=20, message="所有权人长度必须介于 1 和 20 之间")
	public String getOwnershipName() {
		return ownershipName;
	}

	public void setOwnershipName(String ownershipName) {
		this.ownershipName = ownershipName;
	}
	
	@Length(min=1, max=10, message="用途长度必须介于 1 和 10 之间")
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}
	
	@Length(min=1, max=50, message="情况说明长度必须介于 1 和 50 之间")
	public String getDescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	
	@Length(min=1, max=50, message="扫描或复印件管理部门长度必须介于 1 和 50 之间")
	public String getOtherDepartments() {
		return otherDepartments;
	}

	public void setOtherDepartments(String otherDepartments) {
		this.otherDepartments = otherDepartments;
	}
	
	@Length(min=1, max=50, message="地址长度必须介于 1 和 50 之间")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Length(min=1, max=255, message="备注长度必须介于 1 和 255 之间")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Length(min=1, max=100, message="权证交接单长度必须介于 1 和 100 之间")
	public String getHandover() {
		return handover;
	}

	public void setHandover(String handover) {
		this.handover = handover;
	}
	
	@Length(min=1, max=100, message="证件原件扫描件长度必须介于 1 和 100 之间")
	public String getPapers() {
		return papers;
	}

	public void setPapers(String papers) {
		this.papers = papers;
	}
	
	@Length(min=1, max=100, message="权证交接单下载长度必须介于 1 和 100 之间")
	public String getHandoverDownload() {
		return handoverDownload;
	}

	public void setHandoverDownload(String handoverDownload) {
		this.handoverDownload = handoverDownload;
	}
	
	@Length(min=1, max=100, message="证件原件扫描件下载长度必须介于 1 和 100 之间")
	public String getPapersDownload() {
		return papersDownload;
	}

	public void setPapersDownload(String papersDownload) {
		this.papersDownload = papersDownload;
	}
	
}