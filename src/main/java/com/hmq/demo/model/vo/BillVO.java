package com.hmq.demo.model.vo;

import java.math.BigDecimal;
import java.util.List;

import com.hmq.framework.model.GenVO;

public class BillVO extends GenVO<String> {

	private BigDecimal money;

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public List<BillDetailVO> getBillDetailVOList() {
		return billDetailVOList;
	}

	public void setBillDetailVOList(List<BillDetailVO> billDetailVOList) {
		this.billDetailVOList = billDetailVOList;
	}

	private String createrName;
	
	private List<BillDetailVO> billDetailVOList;
	

}