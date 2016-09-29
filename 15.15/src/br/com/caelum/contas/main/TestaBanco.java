package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

/**
 * Programa que faz testes nas classes e c&oatilde;digos para o Banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 */
public class TestaBanco {

	/**
	 * M&eacute;todo de execu&ccedil;&atilde;o do programa
	 * 
	 * @param args
	 *            Argumentos passados por par&acirc;metro.
	 * @since 22/09/2016
	 */
	public static void main(String[] args) {
		Banco banco = new Banco("Iron Bank of Bravos", 10);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Khaleesi");
		c1.setAgencia("1234");
		c1.setNumero(1);
		c1.deposita(10000);
		banco.adiciona(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Jon Snow");
		c2.setAgencia("5678");
		c2.setNumero(2);
		c2.deposita(20000);
		banco.adiciona(c2);

		for(int i = 1; i < 30; i++) {
			ContaPoupanca c = new ContaPoupanca();
			c.setTitular("Imaculado " + i);
			c.setAgencia("200" + i);
			c.setNumero(i + 2);
			c.deposita(100 * i);
			banco.adiciona(c);
		} // fim for
		
		banco.mostraContas();
		
	} // fim main
	
} // fim TestaBanco
