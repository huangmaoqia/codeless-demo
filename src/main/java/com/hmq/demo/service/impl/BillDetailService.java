package com.hmq.demo.service.impl;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IBillDetailDao;
import com.hmq.demo.model.po.BillDetail;
import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.BillDetailVO;
import com.hmq.demo.service.IBillDetailService;
import com.hmq.demo.service.IUserService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utis.DataRelation;

@Service
@Transactional
public class BillDetailService extends GenViewService<BillDetailVO,BillDetail, String, IBillDetailDao> implements IBillDetailService , InitializingBean{
	
	@Autowired
	IUserService userService;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		DataRelation<BillDetailVO, User> cdr = DataRelation.newInstance();
		cdr.setTargetService(userService);
		cdr.addForwardRelation(BillDetailVO::getCreaterId, User::getId);
		cdr.addBackwardRelation(BillDetailVO::setCreaterName,User::getUserName);
		this.addColumnDataRelation(cdr);

	}

}
