package com.example.k8s.springbootpostgresk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootPostgresK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresK8sApplication.class, args);
	}

}
