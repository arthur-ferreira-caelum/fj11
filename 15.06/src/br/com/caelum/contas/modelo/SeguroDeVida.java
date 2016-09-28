package br.com.caelum.contas.modelo;

/**
 * Especifica&ccedil;&atilde;o de um seguro de vida.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.contas.modelo.Tributavel#getValorImposto()
	 */
	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.contas.modelo.Tributavel#getTitular()
	 */
	@Override
	public String getTitular() {
		return this.titular;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.contas.modelo.Tributavel#getTipo()
	 */
	@Override
	public String getTipo() {
		return "Seguro de Vida";
	}

	// getters e setters

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
