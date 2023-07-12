package com.daniel.springbootdeviceseller.repository;

import com.daniel.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeviceRepository extends JpaRepository<Device , Long> {
//    findBy + field Name

}
