package com.bugtool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bugtool.dao.UserInfoDAO;
import com.bugtool.model.UserInfo;
import com.bugtool.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoDAO userInfoDAO;
	
	public UserServiceImpl() {
		
	}
	
	

	public UserServiceImpl(UserInfoDAO userInfoDAO) {
		super();
		this.userInfoDAO = userInfoDAO;
	}



	@Override
	public void createUser(UserInfo user) {
		getUserInfoDAO().create(user);

	}

	@Override
	public void editUser(UserInfo user) {
		getUserInfoDAO().edit(user);

	}

	@Override
	public void deleteUser(UserInfo user) {
		getUserInfoDAO().delete(user);

	}

	@Override
	public boolean checkUserLogin(String email, String password) {
		return getUserInfoDAO().checkUserLogin(email, password);
	}

	@Override
	public UserInfo findUserById(Integer id) {

		return getUserInfoDAO().find(id);
	}

	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}

	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

}
