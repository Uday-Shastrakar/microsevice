package com.user.service;

public class UserServiceImpl implements UserService{
    //fake user list
    List<User> list = List.of(
            new User(1113L,"Uday Shastrakar","2353334344"),
            new User(1114L,"Shalini Shastrakar","2353334355"),
            new User(1115L,"Shreya Shastrakar","2353334366")

    );
    @Override
    public User getUser(Long id) {
        return null;
    }
}
