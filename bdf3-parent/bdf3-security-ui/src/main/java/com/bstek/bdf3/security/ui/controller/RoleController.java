package com.bstek.bdf3.security.ui.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.bdf3.security.domain.Role;
import com.bstek.bdf3.security.ui.service.RoleService;
import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;


/**
 * @author Kevin Yang (mailto:kevin.yang@bstek.com)
 * @since 2016年3月6日
 */
@Controller
@Transactional(readOnly = true)
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@DataProvider
	public void load(Page<Role>page, Criteria criteria) {
		roleService.load(page, criteria);
	}
	
	@DataResolver
	@Transactional
	public void save(List<Role> roles) {
		roleService.save(roles);
	}
	

}