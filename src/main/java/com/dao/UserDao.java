package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;
import com.services.UserServices;

@Repository
public class UserDao implements UserServices {

	@Autowired
	MongoTemplate mongoTemplate;
	
	//jdbcTemplate
	
	
	@Override
	public UserBean addUsers(UserBean userBean) {
		// TODO Auto-generated method stub
		return mongoTemplate.save(userBean);
	}

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(UserBean.class);
	}

}
