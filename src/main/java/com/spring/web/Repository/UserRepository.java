package com.spring.web.Repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.Entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
