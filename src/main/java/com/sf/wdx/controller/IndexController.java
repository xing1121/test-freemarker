package com.sf.wdx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：跳转主页
 * @author 80002888
 * @date   2018年8月23日
 */
@Controller
public class IndexController {
	
	/**
	 * 拦截/index.html请求，转发到内部真正的index.html
	 *	@ReturnType	String 
	 *	@Date	2018年8月24日	上午10:21:47
	 *  @Param  @param model
	 *  @Param  @return
	 */
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
	
}
