package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

/**
 * Class exigida pela biblioteca de interface gr&aacute;fica para manipular os
 * seguros de vida do sistema.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class ManipuladorDeSeguroDeVida {

	private SeguroDeVida seguroDeVida;
	
	/**
	 * Cria um novo seguro de vida.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void criaSeguro(Evento evento) {
		this.seguroDeVida = new SeguroDeVida();
		this.seguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
		this.seguroDeVida.setTitular(evento.getString("titular"));
		this.seguroDeVida.setValor(evento.getDouble("valor"));
	} // fim criaSeguro
	
} // fim ManipuladorDeSeguroDeVida
