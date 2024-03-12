package com.app;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.pojos.User;

public class ShopUser implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	private User user;
	private Collection<GrantedAuthority> authorities;

	public ShopUser(User user) {
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.user = user;
		this.authorities = List.of(new SimpleGrantedAuthority(user.getUserRole().name()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
