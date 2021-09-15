/*
 *  05-08-2021 
 *  Copyright (c) 2021 AST Corporation. All Rights Reserved.
 *
 *
 *
*/

package com.ast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author rsuryavanshi
 *
 */
@RestController
@Slf4j
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	    @PostMapping("/users")
	    public User createUser(@RequestBody User user) {
	    	
	    	log.info("user:"+user.getEmailId());
	    	
	        return userRepository.save(user);
	    }
	   @GetMapping("/test")
	   public List<User> test(){
		return userRepository.findAll();
		}
}
