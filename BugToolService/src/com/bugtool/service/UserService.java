package com.bugtool.service;

import com.bugtool.model.UserInfo;

public interface UserService {
	
	public void createUser(UserInfo user);
	public void editUser(UserInfo user);
	public void deleteUser(UserInfo user);
	public boolean checkUserLogin(String email, String password);
	public UserInfo findUserById(Integer id);

}
