package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
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
		// Recupera o tipo selecionado no radiobutton
		String tipo = evento.getSelecionadoNoRadio("tipo");

		// Instancia a conta de acordo com a selecao
		if (tipo.equals("Conta Corrente"))
			this.conta = new ContaCorrente();
		else if (tipo.equals("Conta Poupança"))
			this.conta = new ContaPoupanca();

		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	} // fim criaConta

	/**
	 * Realiza um dep&oacute;sito na conta.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
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
		double valorDigitado = evento.getDouble("valorOperacao");

		// Codigo comentado para mostrar que nao colocamos a taxa
		// aqui na manipulador de contas, isso fica na propria conta.

		// if (this.conta.getTipo().equals("Conta Corrente"))
		// this.conta.saca(valorDigitado - 0.10);
		// else
		// this.conta.saca(valorDigitado);

		this.conta.saca(valorDigitado);
	} // fim saca

	/**
	 * Realiza uma transfer&ecirc;ncia entre contas.
	 * 
	 * @param evento
	 *            Evento do JavaFX executado na interface e seus
	 *            par&acirc;metros.
	 */
	public void transfere(Evento evento) {
		double valorTransferencia = evento.getDouble("valorTransferencia");
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(valorTransferencia, destino);
	} // fim transfere

} // fim ManipuladorDeContas
