package com.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.UserBean;

@Service
public interface UserServices {

	//public abstract
	//{"name":"samir"}
	UserBean addUsers(UserBean userBean);
	List<UserBean> getAllUsers();
}
