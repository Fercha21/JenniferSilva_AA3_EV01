package com.evidenciaspring.evidenciaspring;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evidenciaspring.evidenciaspring.controllers.InformacionAprendiz;

@RestController
@SpringBootApplication
public class EvidenciaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvidenciaspringApplication.class, args);
	}

	@GetMapping("/Aprendiz")

	public InformacionAprendiz messageView() {

		return new InformacionAprendiz(LocalDateTime.now(), "Jennifer Katherine", "Silva Cely", "2721426");
	}

}
