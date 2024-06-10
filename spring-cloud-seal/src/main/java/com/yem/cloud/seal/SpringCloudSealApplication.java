package com.yem.cloud.seal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudSealApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSealApplication.class, args);
	}

}
