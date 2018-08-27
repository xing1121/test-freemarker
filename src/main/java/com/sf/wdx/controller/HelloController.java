package com.sf.wdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：HelloWorld
 * @author 80002888
 * @date   2018年8月23日
 */
@Controller
public class HelloController {

	/**
	 * 拦截/hello.html请求
	 *	@ReturnType	String 
	 *	@Date	2018年8月24日	上午10:21:47
	 *  @Param  @param model
	 *  @Param  @return
	 */
	@RequestMapping(value="/hello")
	public String hello(Model model){
		model.addAttribute("username", "张三");
		return "success";
	}
	
}
