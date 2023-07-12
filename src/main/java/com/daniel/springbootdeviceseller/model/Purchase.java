package com.daniel.springbootdeviceseller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "user_id", nullable = false)
    private long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private  User user;

    @Column(name = "device_id", nullable = false)
    private long DeviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "id", updatable = false, insertable = false)
    private  Device device;

    @Column(name = "price", nullable = false, length = 100)
    private  double price;

    @Column(name = "color", nullable = false, length = 100)
    private  String color;

    @Column(name = "purchase_time", nullable = false)
    private  LocalDateTime purchaseTime;

}
