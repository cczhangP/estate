/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.certificate.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thinkgem.jeesite.modules.property.service.HousePropertyService;
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
import com.thinkgem.jeesite.modules.certificate.entity.Certificate;
import com.thinkgem.jeesite.modules.certificate.service.CertificateService;

/**
 * 产证信息管理Controller
 * @author cczhang
 * @version 2018-08-16
 */
@Controller
@RequestMapping(value = "${adminPath}/certificate/certificate")
public class CertificateController extends BaseController {

	@Autowired
	private CertificateService certificateService;
	@Autowired
	private HousePropertyService housePropertyService;
	
	@ModelAttribute
	public Certificate get(@RequestParam(required=false) String id) {
		Certificate entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = certificateService.get(id);
		}
		if (entity == null){
			entity = new Certificate();
		}
		return entity;
	}
	
	@RequiresPermissions("certificate:certificate:view")
	@RequestMapping(value = {"list", ""})
	public String list(Certificate certificate, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Certificate> page = certificateService.findPage(new Page<Certificate>(request, response), certificate); 
		model.addAttribute("page", page);
		return "modules/certificate/certificateList";
	}

	@RequiresPermissions("certificate:certificate:view")
	@RequestMapping(value = "form")
	public String form(Certificate certificate, Model model) {
		model.addAttribute("certificate", certificate);
		return "modules/certificate/certificateForm";
	}

	@RequiresPermissions("certificate:certificate:edit")
	@RequestMapping(value = "save")
	public String save(Certificate certificate, Model model, RedirectAttributes redirectAttributes) throws Exception{
		if (certificate.getFcCode()==null||housePropertyService.getByCode(certificate.getFcCode())==null){
			addMessage(redirectAttributes, "不存在该房产信息");
			return "redirect:"+Global.getAdminPath()+"/certificate/certificate/form?id="+certificate.getId();
		}
		if (!beanValidator(model, certificate)){
			return form(certificate, model);
		}
		certificateService.save(certificate);
		addMessage(redirectAttributes, "保存产证信息管理成功");
		return "redirect:"+Global.getAdminPath()+"/certificate/certificate/?repage";
	}
	
	@RequiresPermissions("certificate:certificate:edit")
	@RequestMapping(value = "delete")
	public String delete(Certificate certificate, RedirectAttributes redirectAttributes) {
		certificateService.delete(certificate);
		addMessage(redirectAttributes, "删除产证信息管理成功");
		return "redirect:"+Global.getAdminPath()+"/certificate/certificate/?repage";
	}

}