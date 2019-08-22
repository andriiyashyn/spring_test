package com.boot.test.repository;

import com.boot.test.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    List<User> findAllByName(String name);
}
