package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;


@RestController
public class HelloController {
	@RequestMapping("hello")
   public String hello(){
	   return "Hello,Spring Boot!!";
   }
	
	@RequestMapping("getuser")
	public User getUser(){
		User user=new User();
		user.setId("1");
		user.setName("zhangxuan");
		user.setPwd("123456");
		user.setAddress("zhuhai");
		user.setBirth(new Date(1990,5,5));
		return user;
	}
	@RequestMapping("getmap")
	public Map<String,User> getMap(){
		Map<String,User> maps=new HashMap<String,User>();
		User user1=new User();
		user1.setId("2");
		user1.setName("zhangxuan2");
		user1.setPwd("1234562");
		user1.setAddress("zhuhai2");
		user1.setBirth(new Date(1990,6,5));
		maps.put("u1",user1);
		return maps;
	}
	@RequestMapping("getlist")
	public List<User> getList(){
		List<User> users=new ArrayList<User>();
		User user1=new User();
		user1.setId("4");
		user1.setName("zhangxuan4");
		user1.setPwd("123456244");
		user1.setAddress("zhuhai4");
		user1.setBirth(new Date(1990,4,5));
		
		User user2=new User();
		user2.setId("5");
		user2.setName("zhangxuan444");
		user2.setPwd("123456244");
		user2.setAddress("zhuhai244");
		user2.setBirth(new Date(1990,6,25));
		users.add(user1);
		users.add(user2);
		return users;
	}
}
