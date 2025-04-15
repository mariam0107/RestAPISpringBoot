package com.myspringboot.restapi.service;

import com.myspringboot.restapi.model.CloudVendor;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();


    public List<CloudVendor> getByVendorName(String vendorName);
}
