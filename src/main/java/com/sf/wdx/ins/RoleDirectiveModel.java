package com.sf.wdx.ins;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import freemarker.core.Environment;
import freemarker.ext.beans.ArrayModel;
import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.ext.beans.StringModel;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleSequence;
import freemarker.template.TemplateBooleanModel;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.TemplateScalarModel;
import freemarker.template.TemplateTransformModel;

/**
 * 描述：自定义指定，配置在springmvc.xml中，指令名：role，在页面使用@role引入
 * @author 80002888
 * @date   2018年8月24日
 */
@Component
public class RoleDirectiveModel implements TemplateDirectiveModel{

	/**
	 * env:环境变量
	 * params:指令参数（方法入参，存储key=value）
	 * loopVars:循环变量（返回值）
	 * body:指令内容
	 * 除了params外，其他的都可以为null
	 */
	@SuppressWarnings("all")
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
			throws TemplateException, IOException {
		
		TemplateScalarModel username = (TemplateScalarModel) params.get("username");
		TemplateScalarModel role = (TemplateScalarModel) params.get("role");
		
		if (username.getAsString().equals("zhangsan") && role.getAsString().equals("admin")) {
			loopVars[0] = TemplateBooleanModel.TRUE;
			List<String> list = Arrays.asList("add", "update", "delete");
			loopVars[1] = new SimpleSequence(list);
		} else {
			loopVars[0] = TemplateBooleanModel.FALSE;
			loopVars[1] =  null;
		}
		
		body.render(env.getOut());
	}


}
