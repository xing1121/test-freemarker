package com.sf.wdx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sf.wdx.domain.Person;
import com.sf.wdx.service.PersonService;

/**
 * 描述：HelloWorld
 * @author 80002888
 * @date   2018年8月23日
 */
@Controller
@RequestMapping(value="/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	/**
	 * 拦截/person/persons.html请求
	 *	@ReturnType	ModelAndView 
	 *	@Date	2018年8月24日	上午10:56:10
	 *  @Param  @param mv
	 *  @Param  @return
	 */
	@RequestMapping(value="/persons")
	public ModelAndView persons(ModelAndView mv){
		List<Person> persons = personService.getAll();
		mv.addObject("persons", persons);
		mv.setViewName("person");
		return mv;
	}
	
}
