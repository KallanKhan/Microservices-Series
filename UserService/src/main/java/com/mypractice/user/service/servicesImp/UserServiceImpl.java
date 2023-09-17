package com.mypractice.user.service.servicesImp;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypractice.user.service.entities.User;
import com.mypractice.user.service.repositories.UserRepository;
import com.mypractice.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	  @Autowired
	    private UserRepository userRepository;

	  

	    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	    @Override
	    public User saveUser(User user) {
	        //generate  unique userid
	        String randomUserId = UUID.randomUUID().toString();
	        user.setUserId(randomUserId);
	        return userRepository.save(user);
	    }

	    @Override
	    public List<User> getAllUser() {
	        
	        return userRepository.findAll();
	    }

	    
	    @Override
	    public User getUser(String userId) {
	      
	        return userRepository.findById(userId).get();
	    }

}
