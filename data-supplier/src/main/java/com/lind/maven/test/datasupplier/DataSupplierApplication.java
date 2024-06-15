package com.lind.maven.test.datasupplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DataSupplierApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSupplierApplication.class, args);
    }

}
