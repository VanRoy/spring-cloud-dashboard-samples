package com.github.vanroy.cloud.samples.beanstalk;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCloudDashboard
public class BeanstalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanstalkApplication.class, args);
	}

}
