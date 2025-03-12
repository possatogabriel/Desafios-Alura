package br.com.alura.cursos.Exercicio_2;

import br.com.alura.cursos.Exercicio_2.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main programa = new Main();
		programa.rodaAplicacao();
	}
}
