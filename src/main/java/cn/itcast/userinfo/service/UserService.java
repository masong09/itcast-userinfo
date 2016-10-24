package cn.itcast.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.userinfo.mapper.UserMapper;
import cn.itcast.userinfo.pojo.User;

@Service
public class UserService {

	@Autowired
	private UserMapper usermapper;
	
	
	

	public UserMapper getUsermapper() {
		return usermapper;
	}

	public void setUsermapper(UserMapper usermapper) {
		this.usermapper = usermapper;
	}

	public User queryUserById(Long id) {
		
		User user = this.usermapper.selectByPrimaryKey(id);
		return user;
		
	}
	
	
}
