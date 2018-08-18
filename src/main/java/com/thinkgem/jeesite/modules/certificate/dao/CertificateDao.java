/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.certificate.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.certificate.entity.Certificate;

/**
 * 产证信息管理DAO接口
 * @author cczhang
 * @version 2018-08-16
 */
@MyBatisDao
public interface CertificateDao extends CrudDao<Certificate> {
	
}