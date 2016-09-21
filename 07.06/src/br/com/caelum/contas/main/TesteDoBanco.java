package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

/**
 * Programa para testar as classes e opera&ccedil;&otilde;es de banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 18/09/2016
 *
 */
public class TesteDoBanco {
	
	/**
	 * In&iacute;cio do programa de teste.
	 * 
	 * @param args Vetor com os argumentos (par&acirc:metros) passado linha de comando ao executar o programa.
	 */
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1);
		conta.setAgencia("3028");
		conta.setTitular("Luke");
		conta.deposita(100);

		System.out.println("Saldo: " + conta.getSaldo());

		conta.saca(10);

		System.out.println("Saldo: " + conta.getSaldo());
	} // fim main
} // fim TesteDoBanco
