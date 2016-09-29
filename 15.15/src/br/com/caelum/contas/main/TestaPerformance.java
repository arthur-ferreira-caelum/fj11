package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Programa que testa a performance entre diferentes cole&ccedil&otilde;es.
 * 
 * @author Arthur Franco Ferreira
 * @since 28/09/2016
 *
 */
public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		} // fim for

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		} // fim for
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	} // fim main

} // fim TestaPerformance
