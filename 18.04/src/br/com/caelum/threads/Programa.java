package br.com.caelum.threads;

/**
 * Classe de cria&ccedil:&atilde;o e execu&ccedil:&atilde;o de threads
 * (processos).
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 */
public class Programa implements Runnable {

	private int id;

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor " + i);
		} // fim for
	} // fim run

	// Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

} // fim Programa
