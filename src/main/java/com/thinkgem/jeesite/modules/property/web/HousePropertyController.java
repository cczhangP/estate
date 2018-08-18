/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.property.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.property.entity.HouseProperty;
import com.thinkgem.jeesite.modules.property.service.HousePropertyService;

/**
 * 房产信息管理Controller
 * @author cczhang
 * @version 2018-08-16
 */
@Controller
@RequestMapping(value = "${adminPath}/property/houseProperty")
public class HousePropertyController extends BaseController {

	@Autowired
	private HousePropertyService housePropertyService;
	
	@ModelAttribute
	public HouseProperty get(@RequestParam(required=false) String id) {
		HouseProperty entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = housePropertyService.get(id);
		}
		if (entity == null){
			entity = new HouseProperty();
		}
		return entity;
	}
	
	@RequiresPermissions("property:houseProperty:view")
	@RequestMapping(value = {"list", ""})
	public String list(HouseProperty houseProperty, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<HouseProperty> page = housePropertyService.findPage(new Page<HouseProperty>(request, response), houseProperty); 
		model.addAttribute("page", page);
		return "modules/property/housePropertyList";
	}

	@RequiresPermissions("property:houseProperty:view")
	@RequestMapping(value = "form")
	public String form(HouseProperty houseProperty, Model model) {
		model.addAttribute("houseProperty", houseProperty);
		return "modules/property/housePropertyForm";
	}

	@RequiresPermissions("property:houseProperty:edit")
	@RequestMapping(value = "save")
	public String save(HouseProperty houseProperty, Model model, RedirectAttributes redirectAttributes) throws Exception {
		if (!beanValidator(model, houseProperty)){
			return form(houseProperty, model);
		}
		housePropertyService.save(houseProperty);
		addMessage(redirectAttributes, "保存房产信息管理成功");
		return "redirect:"+Global.getAdminPath()+"/property/houseProperty/?repage";
	}
	
	@RequiresPermissions("property:houseProperty:edit")
	@RequestMapping(value = "delete")
	public String delete(HouseProperty houseProperty, RedirectAttributes redirectAttributes) {
		housePropertyService.delete(houseProperty);
		addMessage(redirectAttributes, "删除房产信息管理成功");
		return "redirect:"+Global.getAdminPath()+"/property/houseProperty/?repage";
	}

}