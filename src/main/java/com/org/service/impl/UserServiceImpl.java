package com.org.service.impl;

import com.org.mapper.UserMapper;
import com.org.po.UserPo;
import com.org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserPo selectLogin(UserPo user) {
		// TODO Auto-generated method stub
		return userMapper.selectLogin(user);
	}

}
