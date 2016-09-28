package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

/**
 * Class exigida pela biblioteca de interface gr&aacute;fica para manipular o
 * que &eeacute; tribut&aacute;vel no sistema.
 * 
 * @author Arthur Franco Ferreira
 * @since 20/09/2016
 *
 */
public class ManipuladorDeTributaveis {

	private double total;

	/**
	 * Calcula os impostos gerados de tudo que for tribut&aacute;vel no sistema.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void calculaImpostos(Evento evento) {
		this.total = 0;
		int tamanho = evento.getTamanhoDaLista("listaTributaveis");
		for (int i = 0; i < tamanho; i++) {
			Tributavel t = evento.getTributavel("listaTributaveis", i);
			total += t.getValorImposto();
		} // fim for
	} // fim calculaImpostos

	// Getters e Setters

	public double getTotal() {
		return total;
	}

} // fim ManipuladorDeTributaveis