package com.hmq.demo.model.vo;

import com.hmq.framework.model.GenVO;

public class BillDetailVO extends GenVO<String>{

	private String billId;

	private String goodsId;

	private long amount;

	public String getBillId() {
		return billId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public long getAmount() {
		return amount;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	private String createrName;

	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

}