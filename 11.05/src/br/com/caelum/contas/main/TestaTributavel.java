package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

/**
 * Programa que testa a utiliza&ccedil;&atilde;o de interfaces no nosso
 * c&oacute;digo.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class TestaTributavel {

	/**
	 * M&eacute;todo inicial do teste de interfaces.
	 * 
	 * @param args
	 *            Argumentos do sistema.
	 * @since 22/09/2016
	 */
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());

		// Testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.getValorImposto());

	} // fim main

} // fim TestaTributavel
