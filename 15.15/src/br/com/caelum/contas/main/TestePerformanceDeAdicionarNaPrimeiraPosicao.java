package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;

/**
 * Programa que testa a performance de listas.
 * 
 * @author Arthur Franco Ferreira
 * @since 28/09/2016
 *
 */
public class TestePerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		//Collection<Integer> teste = new ArrayList<>();
		List<Integer> teste = new LinkedList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(0, i);
		} // fim for

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	} // fim main
	
} // fim TestePerformanceDeAdicionarNaPrimeiraPosicao
