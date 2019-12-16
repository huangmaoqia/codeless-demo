package com.hmq.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmq.demo.dao.IUserDao;
import com.hmq.demo.model.po.User;
import com.hmq.demo.model.vo.UserVO;
import com.hmq.demo.service.IUserService;
import com.hmq.framework.service.impl.GenViewService;
import com.hmq.framework.utils.query.AndConditions;
import com.hmq.framework.utils.query.OrConditions;

@Service
@Transactional
public class UserService extends GenViewService<UserVO, User, String, IUserDao> implements IUserService {

	public List<User> tt(){
//		Condition<User> cd=new Condition<User> (User::getCreaterId,Condition.EComparisonOperator.EQ,"1");
//		Specification<User> spe=cd.and(new Condition<User> (User::getModifierId,Condition.EComparisonOperator.EQ,"2"))
//		.and(new Condition<User> (User::getUserName,Condition.EComparisonOperator.EQ,"andy").or(new Condition<User> (User::getUserName,Condition.EComparisonOperator.EQ,"cindy")));
//		return this.findBySpec(spe);
		
//		return this.findBySpec(((root, query, builder) -> {
//			Path<?> expression = root.get("createrId");
//			return builder.equal(expression, "1");
//		}));
		
//		EQCondition<User> cd=new EQCondition<User> (User::getCreaterId,"1");
//		ICondition<User> spe=cd.andEq(User::getModifierId,"2")
//				.andEQ(User::getUserName, "andy")
//				.andEQ(User::getUserName, "andy");
//		spe.
//		return this.findBySpec(spe);
		
		AndConditions<User> cds=new AndConditions<User>();
		cds.addCdEq(User::getCreaterId,"1")
			.addCdIn(User::getUserName, new String[]{"andy","mini"})
			.addCds(new OrConditions<User>());
		
		return this.findBySpec(cds);
		
	}
}
