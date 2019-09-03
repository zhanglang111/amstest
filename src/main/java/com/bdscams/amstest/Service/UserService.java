package com.bdscams.amstest.Service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int userlogin(String username,String password);
}
