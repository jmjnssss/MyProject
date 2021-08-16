package com.spring.catchmind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.catchmind.pay.PayDto;

@Controller
public class PayController {


	@RequestMapping("payorder.do")
	public String payorder(Model model) {
		return "pay/payorder";
	}
	
	@RequestMapping("insertpay.do")
	public String insertpay(PayDto dto, Model model) {

		model.addAttribute("pay_id", dto.getPay_id());//결제 아이디
		model.addAttribute("pay_price", dto.getPay_price());//결제 금액

		return "pay/pay";
	}
}
