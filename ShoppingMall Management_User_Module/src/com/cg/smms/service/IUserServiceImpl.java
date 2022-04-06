package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {
	private IUserRepository UserDAO;

//	Constructor
	public IUserServiceImpl() {
		UserDAO = new IUserRepositoryImpl();
	}

//	addNewUser
	@Override
	public User addNewUser(User user) {
		UserDAO.beginTransaction();
		UserDAO.addNewUser(user);
		UserDAO.beginTransaction();
		return user;
	}

//	updateUser
	@Override
	public User updateUser(User user) { 
		UserDAO.beginTransaction();
		UserDAO.updateUser(user);
		UserDAO.beginTransaction();
		return user;
	}

//	login
	@Override
	public User login(User user) {
//		Main method calling this function
//		We will give next user option
		return user;
	}

//	logOut
	@Override
	public boolean logOut1() {
//		Goto back window
//		Loop ends and Ask Options of Module
		return false;
	}

@Override
public User addUser(User user) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean logOut() {
	// TODO Auto-generated method stub
	return false;
}

}


