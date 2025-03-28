package com.myspringboot.restapi.repository;

import com.myspringboot.restapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
