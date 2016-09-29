package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

/**
 * Programa que testa a utiliza&ccedil;&atilde;o de um mapa.
 * 
 * @author Arthur Franco Ferreira
 * @since 28/09/2016
 *
 */
public class TestaMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.deposita(10000);

		Conta c2 = new ContaPoupanca();
		c2.deposita(20000);

		Map<String, Conta> mapaDeContas = new HashMap<>();
		mapaDeContas.put("Mario", c1);
		mapaDeContas.put("Luigi", c2);

		Conta contaDoMario = (Conta) mapaDeContas.get("Mario");
		System.out.println(contaDoMario.getSaldo());

	} // fim main

} // fim TestaMapa
