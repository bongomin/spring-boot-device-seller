package com.daniel.springbootdeviceseller.Service;

import com.daniel.springbootdeviceseller.model.Role;
import com.daniel.springbootdeviceseller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
