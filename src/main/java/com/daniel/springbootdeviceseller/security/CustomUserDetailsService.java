package com.daniel.springbootdeviceseller.security;

import com.daniel.springbootdeviceseller.Service.UserService;
import com.daniel.springbootdeviceseller.model.User;
import com.daniel.springbootdeviceseller.utills.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Set;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = userService.findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException(username));
        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

//        userDetails
        return UserPrinciple.builder()
                .user(user)
                .id(user.getId())
                .username(username)
                .authorities(authorities)
                .build();
    }
}
