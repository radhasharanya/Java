package controller;

import java.util.Map;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceView;

public class loginController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String uname=req.getParameter("name");
		String pwd=req.getParameter("password");
		Map m= new HashMap();
		m.put("msg", "Hellooo..."+uname+"your password is"+pwd);
		ModelAndView mav=new ModelAndView("sucess",m);
		
		return mav;
	}

}
