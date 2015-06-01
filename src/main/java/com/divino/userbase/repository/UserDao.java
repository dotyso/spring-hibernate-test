package com.divino.userbase.repository;

import java.util.List;

import com.divino.userbase.entity.User;

public interface UserDao {

	User get(Long id);
	void save(User user);
	void delete(User user);
	List<User> findAll();
	User findByUserName(String username);

}