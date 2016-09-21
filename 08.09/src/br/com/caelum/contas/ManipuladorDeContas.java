package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

/**
 * Class exigida pela biblioteca de interface gr&aacute;fica para manipular as
 * contas do sistema.
 * 
 * @author Arthur Franco Ferreira
 * @since 20/09/2016
 *
 */
public class ManipuladorDeContas {

	private Conta conta;

	/**
	 * Cria uma nova conta.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batman");
	} // fim criaConta

	/**
	 * Realiza um dep&oacute;sito na conta.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	} // fim deposita
	
	/**
	 * Realiza um saque na conta.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	} // fim saca

} // fim ManipuladorDeContas
