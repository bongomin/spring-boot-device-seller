package com.daniel.springbootdeviceseller.Service;

import com.daniel.springbootdeviceseller.model.Role;
import com.daniel.springbootdeviceseller.model.User;
import com.daniel.springbootdeviceseller.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //    Check on the setters returning errors
    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreatedDate(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional // Transactional is only required when executing an update/delete query.
    public void changeRole(Role newRole, String username) {
        userRepository.updateUserRole(username, newRole);
    }

}
