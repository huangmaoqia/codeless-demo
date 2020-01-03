package com.hmq.demo.service;

import java.util.List;

import com.hmq.demo.model.po.Role;
import com.hmq.demo.model.vo.RoleVO;
import com.hmq.framework.service.IGenViewService;

public interface IRoleService extends IGenViewService<RoleVO,Role,String>{
	List<Role> findByUserId(String userId);
}
