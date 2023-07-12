package com.daniel.springbootdeviceseller.utills;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

@Service
public class SecurityUtils {
    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority ( String role ) {
        String formatedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;
        return new SimpleGrantedAuthority(formatedRole);
    }
}
