package br.com.caelum.contas.exceptions;

/**
 * Exception para causar um erro caso o usu&aacute;rio tente realizar um saque
 * de valor maior do que o saldo atual na conta.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class SaldoInsuficienteException extends RuntimeException {

	private static final long serialVersionUID = -1920088831463440945L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para o valor de: " + valor);
	} // fim construtor

} // fim SaldoInsuficienteException
