package br.com.alunoonline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlunoOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunoOnlineApplication.class, args);
	}

}
