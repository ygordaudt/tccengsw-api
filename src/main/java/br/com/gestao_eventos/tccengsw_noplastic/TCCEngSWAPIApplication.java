package br.com.gestao_eventos.tccengsw_noplastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories
public class TCCEngSWAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(TCCEngSWAPIApplication.class, args);
	}

}
