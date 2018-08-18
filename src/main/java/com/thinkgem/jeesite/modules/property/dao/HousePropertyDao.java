/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.property.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.property.entity.HouseProperty;

/**
 * 房产信息管理DAO接口
 * @author cczhang
 * @version 2018-08-16
 */
@MyBatisDao
public interface HousePropertyDao extends CrudDao<HouseProperty> {

    HouseProperty getByCode(String fcCode);

}