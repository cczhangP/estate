/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.property.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 房产信息管理Entity
 * @author cczhang
 * @version 2018-08-16
 */
public class HouseProperty extends DataEntity<HouseProperty> {
	
	private static final long serialVersionUID = 1L;
	private String fcName;		// 房产名称
	private String fcCode;		// 房产编号
	private String fcProperty;		// 房产属性
	private String architectureArea;		// 建筑面积
	private String fcState;		// 房产状态
	private String city;		// 所在城市
	private String grade;		// 城市等级
	private String propertyName;		// 物业名称
	private String propertyAddress;		// 物业地址
	private String houseStructure;		// 房屋结构
	private String fcRemake;		// 房产备注
	
	public HouseProperty() {
		super();
	}

	public HouseProperty(String id){
		super(id);
	}

	@Length(min=1, max=50, message="房产名称长度必须介于 1 和 50 之间")
	public String getFcName() {
		return fcName;
	}

	public void setFcName(String fcName) {
		this.fcName = fcName;
	}
	
	@Length(min=1, max=50, message="房产编号长度必须介于 1 和 50 之间")
	public String getFcCode() {
		return fcCode;
	}

	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
	}
	
	@Length(min=1, max=20, message="房产属性长度必须介于 1 和 20 之间")
	public String getFcProperty() {
		return fcProperty;
	}

	public void setFcProperty(String fcProperty) {
		this.fcProperty = fcProperty;
	}
	
	public String getArchitectureArea() {
		return architectureArea;
	}

	public void setArchitectureArea(String architectureArea) {
		this.architectureArea = architectureArea;
	}
	
	@Length(min=1, max=20, message="房产状态长度必须介于 1 和 20 之间")
	public String getFcState() {
		return fcState;
	}

	public void setFcState(String fcState) {
		this.fcState = fcState;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getHouseStructure() {
		return houseStructure;
	}

	public void setHouseStructure(String houseStructure) {
		this.houseStructure = houseStructure;
	}

	public String getFcRemake() {
		return fcRemake;
	}

	public void setFcRemake(String fcRemake) {
		this.fcRemake = fcRemake;
	}
	
}