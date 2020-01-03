package com.hmq.demo.service;

import java.util.List;

import com.hmq.demo.model.po.UserRole;
import com.hmq.demo.model.vo.UserRoleVO;
import com.hmq.framework.service.IGenViewService;

public interface IUserRoleService extends IGenViewService<UserRoleVO,UserRole,String>{
	List<UserRole> findByUserId(String userId);
}
