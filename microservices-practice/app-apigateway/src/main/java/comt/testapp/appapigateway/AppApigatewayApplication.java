package comt.testapp.appapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;

@SpringBootApplication
@EnableDiscoveryClient
public class AppApigatewayApplication {



	public static void main(String[] args) {
		SpringApplication.run(AppApigatewayApplication.class, args);
	}

}
