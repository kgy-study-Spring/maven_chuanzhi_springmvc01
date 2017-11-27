package cn.itcast.app05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 单例
 * 控理器Action
 * 处理器Action
 * @author Administrator
 *
 */
public class HelloAction implements Controller {

	public HelloAction() {
		System.out.println("HelloActin()::" + this.hashCode());
	}
	/**
	 * 业务方法
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloAction.handleRequest()");
		/**
		 * ModelAndView表示向视图封装的数据和路径
		 */
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("helloAction");
		
		modelAndView.addObject("message", "这是我的第一个springmvc应用程序，映射器_适配器_视图解析器_都可省略");
		
		modelAndView.setViewName("/jsp/success.jsp");
		
		return modelAndView;
	}

}
