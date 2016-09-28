package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Programa que testa a interface gr&aacute;fica de contas.
 * 
 * @author Arthur Franco Ferreira
 * @since 28/09/2016
 *
 */
public class TestaLista {

	public static void main(String[] args) {
		Random random = new Random();
		//List<Conta> contas = new ArrayList<>();
		List<Conta> contas = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			Conta c = new ContaCorrente();
			c.setTitular("Android " + i);
			c.deposita(random.nextDouble());
			contas.add(c);
		} // fim for
		
		System.out.println(contas);
	} // fim main

} // fim TestaLista
