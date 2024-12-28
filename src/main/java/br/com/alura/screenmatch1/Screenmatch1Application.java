package br.com.alura.screenmatch1;

import br.com.alura.screenmatch1.model.DadosEpisodio;
import br.com.alura.screenmatch1.model.DadosSerie;
import br.com.alura.screenmatch1.model.DadosTemporada;
import br.com.alura.screenmatch1.principal.Principal;
import br.com.alura.screenmatch1.service.ConsumoApi;
import br.com.alura.screenmatch1.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Screenmatch1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatch1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
