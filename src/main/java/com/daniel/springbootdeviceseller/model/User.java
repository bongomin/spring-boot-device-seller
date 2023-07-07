package com.daniel.springbootdeviceseller.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private final String username;

    @Column(name = "password", nullable = false, length = 100)
    private final String password;

    @Column(name = "name", nullable = false, length = 100)
    private final String name;

    @Column(name = "create_time", nullable = false)
    private final LocalDateTime createdDate;

    //    role
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private final Role role;

}
