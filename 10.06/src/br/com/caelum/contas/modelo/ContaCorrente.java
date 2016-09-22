package br.com.caelum.contas.modelo;

/**
 * Especifica&ccedil;&atilde;o de uma conta corrente do banco.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class ContaCorrente extends Conta {

	@Override
	public void saca(double valor) {
		// this.saldo -= (valor + 0.10);
		super.saca(valor + 0.10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.contas.modelo.Conta#getTipo()
	 */
	public String getTipo() {
		return "Conta Corrente";
	} // fim getTipo

} // fim ContaCorrente
