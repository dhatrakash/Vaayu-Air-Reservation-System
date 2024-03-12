package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("select u from User u where email=:em and password=:pwd")
	User getUser(@Param("em") String email, @Param("pwd") String password);
	//method to find user by email
	User findByEmail(String email);
	//Method for user login
	User findByEmailAndPassword(String email, String password);
}


//package com.sunbeam.sb.daos;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.sunbeam.sb.entities.Role;
//import com.sunbeam.sb.entities.User;
//
//public interface UserDao extends JpaRepository<User, Integer> {
//	User findByContactEmail(String email);
//	@Query("select r from User u JOIN u.authorities r WHERE u.id=:p_userId")
//	List<Role> findUserRoles(@Param("p_userId") int userId);
//	@Modifying
//	@Query("update User u set u.contact.email=:email, u.contact.mobile=:mobile, u.contact.address=:address where u.id=:id")
//	void updateContact(@Param("id") int id, @Param("email") String email, @Param("mobile") String mobile, @Param("address") String address);
//}
//
//
