package br.com.caelum.contas.main;

/**
 * Programa de testes de inteiros
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 *
 */
public class TestaInteger {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		// if (i1 == i2)
		if (i1.equals(i2))
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");
		
	} // fim main
	
} // TestaInteger
