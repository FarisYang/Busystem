package org.busystem.dao;
import java.util.List;

import org.busystem.model.User;


public interface IUserDAO {
		public boolean addOrUpdateUser(User user);
		public User checkUser(User user);
		public List getAllUsers();
		public User getUserById(int id);
		public boolean deleteUserById(int id);
}

