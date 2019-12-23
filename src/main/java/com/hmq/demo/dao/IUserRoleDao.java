package com.hmq.demo.dao;

import org.springframework.stereotype.Repository;

import com.hmq.demo.model.po.UserRole;
import com.hmq.framework.dao.IGenDao;

@Repository
public interface IUserRoleDao extends IGenDao<UserRole, String> {

	
}