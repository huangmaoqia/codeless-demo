package com.hmq.demo.service;

import java.util.Collection;
import java.util.List;

import com.hmq.demo.model.po.Permission;
import com.hmq.demo.model.vo.PermissionVO;
import com.hmq.framework.service.IGenViewService;

public interface IPermissionService extends IGenViewService<PermissionVO,Permission,String>{
	List<Permission> frindByRoleIds(Collection<String> roleIds);
}
