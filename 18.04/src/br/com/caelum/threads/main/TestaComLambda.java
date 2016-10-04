package br.com.caelum.threads.main;

/**
 * Laborat&oacute;rio de teste de Threads
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 *
 */
public class TestaComLambda {

	public static void main(String[] args) {

		new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				System.out.println("programa	1	valor	" + i);
		}).start();

	} // fim main

} // fim TestaThreads