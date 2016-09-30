package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Especifica&ccedil;&atilde;o do que um banco deve possuir e fazer no sistema.
 *
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class Banco {
	private int numero;
	private String nome;
	// private Conta[] contas;
	// private int totalDeContas;
	private List<Conta> contas;
	private Map<String, Conta> mapaDeContas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
		this.mapaDeContas = new HashMap<>();
	} // fim construtor

	/**
	 * Adiciona uma conta ao array de contas.
	 * 
	 * @param conta
	 *            A conta a ser adicionada
	 */
	public void adiciona(Conta conta) {
		// Com a lista, nao precisamos de nenhum outro metodo alem do adicionar,
		// diferente de como era com array
		this.contas.add(conta);
		this.mapaDeContas.put(conta.getTitular(), conta);
	} // fim adiciona

	/**
	 * Exibe as informa&ccedil;&otilde;es das contas no array
	 */
	public void mostraContas() {
		// Se voce precisar percorrer um array inteiro, voce pode usar o
		// enchanced for que foi implementado na versao 1.5:
		for (Conta conta : this.contas) {
			// Verifica se a posicao esta nula ou nao para evitar erros
			if (conta != null) {
				// Imprime as informacoes da conta. Lembrando que
				// sobrecarregamos o metodo toString na classe conta, ou seja, o
				// println ira exibir o que esta la.
				System.out.println(conta);
			} // fim if
		} // fim for
	} // fim mostraContas

	public Conta buscaPorTitular(String nome) {
		return this.mapaDeContas.get(nome);
	} // fim buscaPorTitular

	/**
	 * Verifica se uma conta existe no array.
	 * 
	 * @param conta
	 *            A refer&ecirc;ncia da conta a ser buscada.
	 * @return Se cont&eacute;m ou n&atilde;o.
	 */
	public boolean contem(Conta conta) {
		boolean encontrou = true;
		for (Conta contaDoArray : this.contas) {
			if (conta.equals(contaDoArray)) {
				encontrou = true;
				break;
			} // fim if
		} // fim for
		return encontrou;
	} // fim contem

	// Getters

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

} // fim Banco
