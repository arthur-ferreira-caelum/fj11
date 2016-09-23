package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

/**
 * Especifica&ccedil;&atilde;o de uma conta de banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 20/09/2016
 *
 */
public abstract class Conta {

	// Atributos de instancia

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	// Metodos

	/**
	 * Adiciona um valor ao saldo da conta.
	 * 
	 * @param valor
	 *            O valor a ser adicionado.
	 * @since 20/09/2016
	 */
	public void deposita(double valor) {
		// Valida se o valor passado eh negativo
		// Caso seja, lança um erro. Nada abaixo da da exception eh executado
		// por conta do erro.
		if (valor < 0)
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");

		// Essa linha so sera executada se o valor for positivo
		this.saldo += valor;
	} // fim deposita

	/**
	 * Realiza uma retirada da conta.
	 * 
	 * @param valor
	 *            O valor a ser retirado.
	 * @since 20/09/2016
	 */
	public void saca(double valor) {
		// Valida se o valor passado eh negativo
		// Caso seja, lança um erro. Nada abaixo da da exception eh executado
		// por conta do erro.
		if (valor < 0)
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");

		// Valida se o valor passado eh menor do que o saldo
		if (valor > this.saldo)
			throw new SaldoInsuficienteException(valor);
		
		// Essa linha so sera executada se o valor for positivo
		this.saldo -= valor;
	} // fim saca

	/**
	 * Realiza uma transfer&ecirc;ncia de valor entre contas.
	 * 
	 * @param valor
	 *            O valor a ser transferido.
	 * @param destino
	 *            A conta de destino a ser creditada.
	 */
	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	} // fim transfere

	/**
	 * Define o tipo da conta.
	 * 
	 * @return O texto informativo do tipo da conta
	 */
	public abstract String getTipo();

	// Getters e Setters

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

} // fim Conta
