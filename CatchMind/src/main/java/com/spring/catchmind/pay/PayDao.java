package com.spring.catchmind.pay;

public interface PayDao {

	static String NAMESPACE = "payMapper.";

	public int insertPay(PayDto dto);
}
