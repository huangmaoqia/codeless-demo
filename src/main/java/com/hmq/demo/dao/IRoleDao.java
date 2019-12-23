package com.hmq.demo.dao;

import org.springframework.stereotype.Repository;

import com.hmq.demo.model.po.Role;
import com.hmq.framework.dao.IGenDao;

@Repository
public interface IRoleDao extends IGenDao<Role, String> {

}