package io.s3soft.cartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class S3foodConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3foodConfigServerApplication.class, args);
	}

}
