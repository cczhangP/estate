/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.certificate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.certificate.entity.Certificate;
import com.thinkgem.jeesite.modules.certificate.dao.CertificateDao;

/**
 * 产证信息管理Service
 * @author cczhang
 * @version 2018-08-16
 */
@Service
@Transactional(readOnly = true)
public class CertificateService extends CrudService<CertificateDao, Certificate> {

	public Certificate get(String id) {
		return super.get(id);
	}
	
	public List<Certificate> findList(Certificate certificate) {
		return super.findList(certificate);
	}
	
	public Page<Certificate> findPage(Page<Certificate> page, Certificate certificate) {
		return super.findPage(page, certificate);
	}
	
	@Transactional(readOnly = false)
	public void save(Certificate certificate) {
		super.save(certificate);
	}
	
	@Transactional(readOnly = false)
	public void delete(Certificate certificate) {
		super.delete(certificate);
	}
	
}