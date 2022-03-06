package academy.digitallab.store.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsCustomerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBackendApplication.class, args);
	}

}
