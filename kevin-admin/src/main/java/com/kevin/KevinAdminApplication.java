package com.kevin;

import com.kevin.common.util.MD5Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KevinAdminApplication {

    public static void main(String[] args) {
        System.out.println(MD5Utils.getSaltMD5("admin"));
        SpringApplication.run(KevinAdminApplication.class, args);
    }

}
