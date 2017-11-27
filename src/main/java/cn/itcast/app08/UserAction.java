package cn.itcast.app08;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 控制器
 * @author Administrator
 *
 */
public class UserAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("操作用户");
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message","操作用户成功");
		
		modelAndView.setViewName("success");
		
		return modelAndView;
	}

	
}
