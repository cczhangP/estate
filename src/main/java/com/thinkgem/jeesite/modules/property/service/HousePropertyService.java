/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.property.entity.HouseProperty;
import com.thinkgem.jeesite.modules.property.dao.HousePropertyDao;

/**
 * 房产信息管理Service
 * @author cczhang
 * @version 2018-08-16
 */
@Service
@Transactional(readOnly = true)
public class HousePropertyService extends CrudService<HousePropertyDao, HouseProperty> {

	@Autowired
	HousePropertyDao housePropertyDao;

	public HouseProperty get(String id) {
		return super.get(id);
	}

	public HouseProperty get(HouseProperty houseProperty) {
		return super.get(houseProperty);
	}

	public HouseProperty getByCode(String fcCode) {
		return housePropertyDao.getByCode(fcCode);
	}

	public List<HouseProperty> findList(HouseProperty houseProperty) {
		return super.findList(houseProperty);
	}
	
	public Page<HouseProperty> findPage(Page<HouseProperty> page, HouseProperty houseProperty) {
		return super.findPage(page, houseProperty);
	}
	
	@Transactional(readOnly = false)
	public void save(HouseProperty houseProperty) {
		super.save(houseProperty);
	}
	
	@Transactional(readOnly = false)
	public void delete(HouseProperty houseProperty) {
		super.delete(houseProperty);
	}
	
}