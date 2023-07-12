package com.daniel.springbootdeviceseller.repository;

import com.daniel.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device , Long> {
//    findBy + field Name

}
