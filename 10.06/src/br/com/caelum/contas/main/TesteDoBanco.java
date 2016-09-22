package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Programa que faz testes nas classes e c&oatilde;digos para o Banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 20/09/2016
 */
public class TesteDoBanco {
	/**
	 * M&eacute;todo de execu&ccedil;&atilde;o do programa
	 * 
	 * @param args
	 *            Argumentos passados por par&acirc;metro.
	 * @since 20/09/2016
	 */
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setNumero(1);
		conta.setAgencia("3028");
		conta.setTitular("Luke");
		conta.deposita(100);

		System.out.println("Saldo: " + conta.getSaldo());

		conta.saca(10);

		System.out.println("Saldo: " + conta.getSaldo());
	} // fim main
} // fim TesteDoBanco
