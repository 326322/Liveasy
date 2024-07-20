package com.restapi.bootstrapapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.restapi.bootstrapapi.entities.Courier;

public interface CourierDao extends JpaRepository<Courier,Long> {

}
