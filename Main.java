package br.edu.fatecpg.exercicio.heranca.veiculos.view;

import br.edu.fatecpg.exercicio.heranca.veiculos.model.Carro;
import br.edu.fatecpg.exercicio.heranca.veiculos.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Renault","Logan", 2015,"Prata", 5 , "Sedan");
		
		carro.ArLigado();
		carro.ArDesligado();
		carro.acelerar();
		carro.desligar();
	}

}
