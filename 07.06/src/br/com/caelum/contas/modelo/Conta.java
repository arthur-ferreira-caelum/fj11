package br.com.caelum.contas.modelo;

/**
 * Modelo de uma conta para o banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 18/09/2016
 *
 */
public class Conta {

	// Atributos de instancia
	
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	// Metodos
	
	/**
	 * Adiciona um valor ao saldo da conta.
	 * 
	 * @param valor Valor a ser adicionado ao saldo da conta.
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Remove um valor do saldo da conta.
	 * 
	 * @param valor Valor a ser debitado do saldo da conta.
	 */
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
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
