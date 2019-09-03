package com.bdscams.amstest.Service.ServiceImpl;

import com.bdscams.amstest.Service.UserService;
import com.bdscams.amstest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int userlogin(String username, String password) {
       return userMapper.userlogin(username,password);
    }
}
