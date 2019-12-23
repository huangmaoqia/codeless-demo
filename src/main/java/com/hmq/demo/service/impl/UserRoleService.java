package com.hmq.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IUserRoleDao;
import com.hmq.demo.model.po.UserRole;
import com.hmq.demo.model.vo.UserRoleVO;
import com.hmq.demo.service.IUserRoleService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;

@Service
@Transactional
public class UserRoleService extends GenViewService<UserRoleVO, UserRole, String, IUserRoleDao> implements IUserRoleService {

	@Override
	public List<UserRole> findByUserId(String userId) {
		AndConditions<UserRole> conditions=new AndConditions<UserRole>();
		conditions.addCdEq(UserRole::getUserId,userId);
		return this.findBySpec(conditions);
	}
}
