package com.hmq.demo.dao;

import org.springframework.stereotype.Repository;

import com.hmq.demo.model.po.RolePermission;
import com.hmq.framework.dao.IGenDao;

@Repository
public interface IRolePermissionDao extends IGenDao<RolePermission, String> {

}