package com.sf.wdx.method;

import java.math.BigDecimal;
import java.util.List;

import freemarker.template.SimpleSequence;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

/**
 * 描述：FreeMarker自定义函数：自定义的排序方法
 * @author 80002888
 * @date   2018年8月24日
 */
public class SortIntMethod implements TemplateMethodModelEx{

	/**
	 * args是页面传来的参数，可能有多个，比如：sort_int(myList, false)，都是FreeMarker自定义的数据模型类，如SimpleSequence。
	 */
	@SuppressWarnings("all")
	@Override
	public Object exec(List args) throws TemplateModelException {
		if (args == null || args.size() == 0) {
			return null;
		}
		Object o = args.get(0);
		if (o == null) {
			return null;
		}
		SimpleSequence s = (SimpleSequence)o;
		List<BigDecimal> list = s.toList();
		list.sort((x1, x2)->{
			return x1.compareTo(x2);
		});
		return list;
	}

}
