package br.com.caelum.threads.main;

import br.com.caelum.threads.Programa;

/**
 * Laborat&oacute;rio de teste de Threads
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 *
 */
public class TestaThreads {

	public static void main(String[] args) {

		Programa p1 = new Programa();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		t1.start();

		Programa p2 = new Programa();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();
	} // fim main

} // fim TestaThreads