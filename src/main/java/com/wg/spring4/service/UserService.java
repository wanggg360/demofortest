package com.wg.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.spring4.dao.*;

@Service
public class UserService {
	
	private UserMapper userDao;
	
	private LoginLogMapper loginLogDao;
	
	@Autowired
	
	public void setUserMapper( UserMapper usermapper)
	{
		this.userDao = usermapper;
	}
	
	@Autowired
	public void setLoginLogMapper(LoginLogMapper loginlogmapper)
	{
		this.loginLogDao = loginlogmapper;
	}
	
	public boolean hasMatchUser(String username ,String password)
	{
		int count = userDao.getMatchCount(username, password);
		
		return count > 0?true:false;
	}

}
