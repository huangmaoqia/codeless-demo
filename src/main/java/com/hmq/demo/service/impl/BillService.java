package com.hmq.demo.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IBillDao;
import com.hmq.demo.model.po.Bill;
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
public class BillService extends GenViewService<BillVO, Bill, String, IBillDao>
		implements IBillService, InitializingBean {
	@Autowired
	IUserService userService;

	@Autowired
	IBillDetailService billDetailService;

	@Override
	public void afterPropertiesSet() throws Exception {
		DataRelation<BillVO, User> cdr = new DataRelation<BillVO, User>(userService);
		cdr.addForwardRelation(BillVO::getCreaterId, User::getId);
		cdr.addBackwardRelation(BillVO::setCreaterName,User::getUserName);
		this.addColumnDataRelation(cdr);

		DataRelation<BillVO, BillDetailVO> sdr = new DataRelation<BillVO, BillDetailVO>(billDetailService);
		sdr.addForwardRelation(BillVO::getId, BillDetailVO::getBillId);
		sdr.addBackwardRelation(BillVO::setBillDetailVOList,null);
		this.addSonDataRelation(sdr);
		
//		this.addColumnDataRelation(sdr);
	}
	
}
