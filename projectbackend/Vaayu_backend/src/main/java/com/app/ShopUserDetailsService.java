package com.app;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.app.dao.UserRepository;
import com.app.pojos.User;

@Transactional
@Service
public class ShopUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userDao;
	
	@Autowired
    private PasswordEncoder passwordEncoder; // to encrypt the paasword
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userDao.findByEmail(email);
		System.out.println("Found User :"+user);
		if(user == null)
			throw new UsernameNotFoundException(email + " not found.");
		return new ShopUser(user);
	}
}
