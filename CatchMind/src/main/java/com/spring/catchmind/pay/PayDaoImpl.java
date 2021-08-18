package com.spring.catchmind.pay;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PayDaoImpl implements PayDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insertPay(PayDto dto) {
		int res = 0;
		
		try {
			res= sqlSession.insert(NAMESPACE+"insertpay",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return res;
	}
}
