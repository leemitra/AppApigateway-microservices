package comt.testapp.appservemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppserveMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppserveMicroserviceApplication.class, args);
	}

}
