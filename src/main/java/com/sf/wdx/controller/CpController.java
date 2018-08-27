package com.sf.wdx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sf.wdx.domain.Person;
import com.sf.wdx.method.SortIntMethod;
import com.sf.wdx.service.PersonService;

/**
 * 描述：FreeMarker的基本练习
 * @author 80002888
 * @date   2018年8月23日
 */
@Controller
@RequestMapping(value="/cp")
public class CpController {

	@Autowired
	private PersonService personService;
	
	/**
	 * 拦截/cp/cp1.html请求
	 *	@ReturnType	ModelAndView 
	 *	@Date	2018年8月24日	上午10:56:10
	 *  @Param  @param mv
	 *  @Param  @return
	 */
	@RequestMapping(value="/cp1")
	public ModelAndView cp1(ModelAndView mv){
		mv.addObject("intValue", 15);
		mv.addObject("longValue", 10000L);
		mv.addObject("doubleValue", 18.88);
		mv.addObject("stringValue", "李四");
		mv.addObject("booleanValue", true);
		
//		mv.addObject("dateValue", new java.sql.Date(new Date().getTime()));
		mv.addObject("dateValue", new Date());
		
		mv.addObject("nullValue", null);
		
		mv.addObject("person", new Person(1L, "张三", "zhangsan@163.com", 22, new Date()));
		
		mv.addObject("htmlValue", "<font color='red'>我只想早点下班，对不起，你是程序员！</font>");
		
		mv.addObject("persons", personService.getAll());
		
		Map<String, Object> map = new HashMap<>();
		map.put("java", "爪哇");
		map.put("python", "皮森");
		map.put("haha", "哈哈");
		mv.addObject("map", map);
		
		return mv;
	}
	
	/**
	 * 拦截/cp/cp2.html请求
	 *	@ReturnType	ModelAndView 
	 *	@Date	2018年8月24日	上午10:56:10
	 *  @Param  @param mv
	 *  @Param  @return
	 */
	@RequestMapping(value="/cp2")
	public ModelAndView cp2(ModelAndView mv){
		// 添加自定义函数方法
		mv.addObject("sort_int", new SortIntMethod());
		return mv;
	}
	
	/**
	 * 拦截/cp/cp3.html请求
	 *	@ReturnType	ModelAndView 
	 *	@Date	2018年8月24日	上午10:56:10
	 *  @Param  @param mv
	 *  @Param  @return
	 */
	@RequestMapping(value="/cp3")
	public ModelAndView cp3(ModelAndView mv){
		return mv;
	}
	
	/**
	 * 拦截/cp/cp4.html请求
	 *	@ReturnType	ModelAndView 
	 *	@Date	2018年8月24日	上午10:56:10
	 *  @Param  @param mv
	 *  @Param  @return
	 */
	@RequestMapping(value="/cp4")
	public ModelAndView cp4(ModelAndView mv){
		return mv;
	}
	
}
