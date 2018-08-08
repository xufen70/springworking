package com.kuukuu.spring.ch4;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;


public class BankDaoImpl implements BankDao {
	private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

	public int insert(BankBean bank) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(BankBean bank) {
		// TODO Auto-generated method stub
		
	}

	public void update(List<BankBean> banks) {
		// TODO Auto-generated method stub
		
	}

	public BankBean find(long bankId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BankBean> find(List<Long> bankIds) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
