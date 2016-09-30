package br.com.caelum.contas.modelo;

/**
 * Interface com os m&eacute;todos que devem existir se uma classe possuir
 * regras de tributa&ccedil;&atilde;o.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public interface Tributavel {

	/**
	 * Recupera o valor do imposto que sera cobrado na
	 * implementa&ccedil;&atilde;o.
	 * 
	 * @return O valor do imposto
	 */
	public double getValorImposto();

	/**
	 * Recupera o titular
	 * 
	 * @return O nome do titular
	 */
	public String getTitular();

	/**
	 * Recupera o tipo.
	 * 
	 * @return O tipo.
	 */
	public String getTipo();

} // fim Tributavel
