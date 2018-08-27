package com.sf.wdx.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 描述：自定义web容器监听器
 * @author 80002888
 * @date   2018年8月23日
 */
public class MyAppListener implements ServletContextListener {

	private Logger logger = LoggerFactory.getLogger(MyAppListener.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		context.setAttribute("ctp", context.getContextPath());
		logger.info("ServletContext...init...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		logger.info("ServletContext...destroy...");
	}

}
