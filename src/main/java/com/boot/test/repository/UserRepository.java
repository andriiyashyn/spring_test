package com.boot.test.repository;

import com.boot.test.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAllByName(String name);
}
