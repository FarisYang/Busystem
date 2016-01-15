package org.busystem.service.impl;
import java.util.List;

import org.busystem.dao.IUserDAO;
import org.busystem.model.User;
import org.busystem.service.IUserService;

public class UserService implements IUserService{
	private IUserDAO userDAO;
	
	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean addOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.addOrUpdateUser(user);
	}
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.checkUser(user);
	}
	public List getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.deleteUserById(id);
	}
}

