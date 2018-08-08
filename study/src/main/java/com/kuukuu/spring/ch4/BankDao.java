package com.kuukuu.spring.ch4;

import java.util.List;

public interface BankDao {
	public int insert(BankBean bank);
	public void update(BankBean bank);
	public void update(List<BankBean> banks);
	public BankBean find(long bankId);
	public List<BankBean> find(List<Long> bankIds);
}
