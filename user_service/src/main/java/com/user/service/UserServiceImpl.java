package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService{
    //fake user list
    List<User> list = List.of(
            new User(1311L,"Uday Shastrakar","2353334344"),
            new User(1114L,"Shalini Shastrakar","2353334355"),
            new User(1115L,"Snehaa Shastrakar","2353334366")

    );

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
  
}
