package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Funcionario;
import br.edu.fatecpg.loja.model.Gerente;
import br.edu.fatecpg.loja.model.Vendedor;

public class Main1 {

	public static void main(String[] args) {
		//teste funcionario
		//Funcionario func = new Funcionario();
		//teste vendendor 
		//Vendedor vend = new Vendedor();
		
		//teste faxineiro
		Faxineiro faxi = new Faxineiro(); 
		faxi.solicitarmaterial();
		//teste gerente
		Gerente ger = new Gerente ();
		ger.baterPonto();
		ger.realizarvenda();
		ger.fecharCaixa();
	}

}
