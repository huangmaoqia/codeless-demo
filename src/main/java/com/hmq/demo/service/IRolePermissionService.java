package com.hmq.demo.service;

import java.util.Collection;
import java.util.List;

import com.hmq.demo.model.po.RolePermission;
import com.hmq.demo.model.vo.RolePermissionVO;
import com.hmq.framework.service.IGenViewService;

public interface IRolePermissionService extends IGenViewService<RolePermissionVO,RolePermission,String>{
	List<RolePermission> frindByRoleIds(Collection<String> roleIds);
}
