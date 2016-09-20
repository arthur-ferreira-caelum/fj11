package br.com.caelum.contas.modelo;

/**
 * Especifica&ccedil;&atilde;o de uma conta de banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 20/09/2016
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
	 * @param valor O valor a ser adicionado.
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Realiza uma retirada da conta.
	 * 
	 * @param valor O valor a ser retirado.
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
