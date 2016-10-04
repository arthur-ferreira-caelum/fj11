package br.com.caelum.threads.main;

/**
 * Laborat&oacute;rio de teste de Threads
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 *
 */
public class TestaComClasseAnonima {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Programa 1 valor " + i);
				} // fim for				
			} // fim run
		}; // fim Runnable
		
		Thread t = new Thread(r);
		t.start();
		
	} // fim main

} // fim TestaThreads