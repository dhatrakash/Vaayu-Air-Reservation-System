package com.app;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	public String generateToken(ShopUser user) {
		Map<String,Object> info = new HashMap<String, Object>();
		
		info.put("name", user.getUsername());
		System.out.println("put info as:"+info);
		return createToken(info);
	}
	
	public String getTokenUsername(String token) {
		Claims claims = decodeToken(token);
		String email = claims.get("name", String.class);
		return email;
	}
	
	public boolean validateToken(String token, ShopUser user) {
		Claims claims = decodeToken(token);
		if(!claims.get("name").equals(user.getUsername()))
			return false;
		if(claims.getExpiration().before(new Date()))
			return false;
		return true;
	}

	private String createToken(Map<String, Object> info) {
		long curTime = System.currentTimeMillis();
		long expiration = 43200000;
		String secret = "vaayuair";
		return Jwts.builder()
				.setSubject(null)
				.setClaims(info)
				.setIssuedAt(new Date(curTime))
				.setExpiration(new Date(curTime + expiration))
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}
	
	private Claims decodeToken(String token) {
		String secret = "vaayuair";
		return Jwts.parser()
			.setSigningKey(secret)
			.parseClaimsJws(token)
			.getBody();
	}	
}
