package com.web.webDev.repository;


import com.web.webDev.domain.User;

import java.util.List;
import java.util.Optional;

public interface userRepository {
    User save(User user);
    Optional<User>  findById(String userId);
    Optional<User>  findByName(String userName);
    List<User> findAll();
}
