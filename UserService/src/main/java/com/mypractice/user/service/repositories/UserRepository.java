package com.mypractice.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypractice.user.service.entities.User;

public interface UserRepository extends JpaRepository<User,String> {

}
