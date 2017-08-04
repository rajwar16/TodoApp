package com.bridgeit.TodoApp.dao;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import com.bridgeit.TodoApp.model.User;
import com.bridgeit.TodoApp.model.UserRegistration;

public interface UserDao 
{
	Object addUserRegister(User userRegistration) throws NoSuchAlgorithmException, InvalidKeySpecException;

	User loginUser(String emailId, String password) throws NoSuchAlgorithmException, InvalidKeySpecException;

	User getUserById(String id);

	List<User> getUserList();

	Object updateUser(User userRegistration) throws NoSuchAlgorithmException, InvalidKeySpecException;

	boolean deleteUser(long userId);
	
}