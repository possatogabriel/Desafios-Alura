package br.com.alura.cursos.Exercicio_4;

import br.com.alura.cursos.Exercicio_4.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main programa = new Main();
		programa.rodaAplicacao();
	}
}
