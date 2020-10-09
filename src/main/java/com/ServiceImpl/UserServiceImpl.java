package com.ServiceImpl;

import com.Bean.Users;
import com.Service.UserService;
import com.UserMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;
    @Override
    public int regist(Users user) {
        System.out.println(user.getUsername());
        userMapper.insert(user);
        return 1;
    }
}
