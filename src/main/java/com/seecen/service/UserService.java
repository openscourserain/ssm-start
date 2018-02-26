package com.seecen.service;

import com.seecen.entity.Page;
import com.seecen.entity.User;

public interface UserService {
    public Page findUserByPage(Page page, User user);
}
