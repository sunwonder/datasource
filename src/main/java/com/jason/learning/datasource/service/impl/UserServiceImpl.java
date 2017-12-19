package com.jason.learning.datasource.service.impl;

import com.jason.learning.datasource.service.IUserService;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl extends BaseServiceImpl<com.jason.learning.datasource.entity.User> implements IUserService {
}