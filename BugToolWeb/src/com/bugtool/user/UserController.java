package com.bugtool.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bugtool.service.UserService;
import com.bugtool.util.BugToolConstants;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;

	@RequestMapping("/userLogin")
	public ModelAndView checkUserLogin(HttpServletRequest req, HttpServletResponse resp){
		ModelAndView modelView = new ModelAndView();
		String userName = req.getParameter(BugToolConstants.USERNAME);
		String pass = req.getParameter(BugToolConstants.PASSWORD);
		
		boolean success = getUserService().checkUserLogin(userName, pass);
		
		if (success){
			modelView = new ModelAndView("success", "message", "Logged in successfully");
		} else {
			modelView = new ModelAndView("failure", "message", "Log in Failed");
		}
		
		return modelView;
	}
	
	@RequestMapping("/userLoginPage")
	public ModelAndView showUserLoginPage(){
		return new ModelAndView("login", "message", "Login Again");
	}
	
	@RequestMapping("/logout")
	public ModelAndView loginPage(HttpServletRequest req, HttpServletResponse resp){
		req.getSession().invalidate();
		return new ModelAndView("logout", "message", "Logged Out Successfully");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
