package com.hmq.demo.service.impl;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IBillDetailDao;
import com.hmq.demo.model.po.BillDetail;
import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.BillDetailVO;
import com.hmq.demo.model.vo.BillVO;
import com.hmq.demo.service.IBillDetailService;
import com.hmq.demo.service.IBillService;
import com.hmq.demo.service.IUserService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utis.DataRelation;

@Service
@Transactional
public class BillDetailService extends GenViewService<BillDetailVO,BillDetail, String, IBillDetailDao> implements IBillDetailService , InitializingBean{
	
	@Autowired
	IUserService userService;
	
	@Autowired
	IBillService billService;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		DataRelation<BillDetailVO, User> cdr = new DataRelation<BillDetailVO, User>(userService);
		cdr.addForwardRelation(BillDetailVO::getCreaterId, User::getId);
		cdr.addBackwardRelation(BillDetailVO::setCreaterName,User::getUserName);
		this.addColumnDataRelation(cdr);
		
		DataRelation<BillDetailVO, BillVO> cdr2 = new DataRelation<BillDetailVO, BillVO>(billService);
		cdr2.addForwardRelation(BillDetailVO::getBillId, BillVO::getId);
		cdr2.addBackwardRelation(BillDetailVO::setBillVO,null);
		this.addColumnDataRelation(cdr2);

	}

}
