package com.bootSpring.user.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bootSpring.securityConfig.myUserDetails;
import com.bootSpring.user.bean.User;

@Mapper
public interface UserMaper {
	 @Select("select * from user where id = #{id}")  
	 User Select(String id);
	 
	 @Select("select * from user where username = #{username}")  
	 myUserDetails getReader(String username);
}
