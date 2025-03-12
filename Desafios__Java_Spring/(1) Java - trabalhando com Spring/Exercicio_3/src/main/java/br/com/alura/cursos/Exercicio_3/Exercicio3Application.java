package br.com.alura.cursos.Exercicio_3;

import br.com.alura.cursos.Exercicio_3.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main programa = new Main();
		programa.rodaAplicacao();
	}
}
