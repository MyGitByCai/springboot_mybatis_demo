package com.bootSpring.securityConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bootSpring.user.bean.User;
import com.bootSpring.user.mapper.UserMaper;

@Controller
public class loginController {
	@Autowired  
    private UserMaper mapper;
	
	
	@RequestMapping("/getUsers")
	public ModelAndView getUsers() {
		ModelAndView mod = new ModelAndView();
		User user = mapper.Select("1");
		mod.addObject("user",user);
		mod.setViewName("index");
		System.out.println("===========");
        System.out.println(
                "wefwefwefwefwef"
        );
		System.out.println(
				"dedewdewdededef"
		);
        return mod;
    }
	
	/**
	 * 默认登陆页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		return view;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/logout")
	public String doLogout(HttpServletRequest request, HttpServletResponse response){
		return "logout";
	}
	
	@ResponseBody
	@RequestMapping(value = "/logoutsuccess")
	public String logoutSuccess(){
		return "logout success";
	}
}
