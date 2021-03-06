package cn.itcast.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.userinfo.pojo.User;
import cn.itcast.userinfo.service.UserService;


@RequestMapping("user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	  @RequestMapping(value = "query/{id}", method = RequestMethod.GET)
	@ResponseBody
	public User queryUserById(@PathVariable("id") Long id){
		
		User user = this.userService.queryUserById(id);
		
		System.out.println("2");
		return user;
		
		
	}
}
