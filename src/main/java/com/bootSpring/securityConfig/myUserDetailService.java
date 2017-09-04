package com.bootSpring.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bootSpring.user.mapper.UserMaper;

@Service("MyUserDetailsImpl")
public class myUserDetailService implements UserDetailsService {

	@Autowired  
    private UserMaper mapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		myUserDetails myUserDetails = mapper.getReader(username);
		return myUserDetails;
	}

}
