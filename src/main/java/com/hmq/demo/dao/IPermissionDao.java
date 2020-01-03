package com.hmq.demo.dao;

import org.springframework.stereotype.Repository;

import com.hmq.demo.model.po.Permission;
import com.hmq.framework.dao.IGenDao;

@Repository
public interface IPermissionDao extends IGenDao<Permission, String> {

	
	
}