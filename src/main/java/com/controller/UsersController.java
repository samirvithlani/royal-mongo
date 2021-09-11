package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.services.UserServices;

@RestController
@CrossOrigin
//@crossOrigin
//@crossOrigin filter ->
public class UsersController {

	@Autowired
	UserServices userServices;

	@RequestMapping(value = "/adduser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserBean adduser(@RequestBody UserBean userBean) {

		return userServices.addUsers(userBean);

	}

	@RequestMapping(value = "/getallusers")
	public List<UserBean> getAllUsers() {

		return userServices.getAllUsers();
	}

}
