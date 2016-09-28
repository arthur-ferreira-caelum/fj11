package br.com.caelum.contas.modelo;

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
	private Conta[] contas;
	private int totalDeContas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	} // fim construtor

	/**
	 * Adiciona uma conta ao array de contas.
	 * 
	 * @param conta
	 *            A conta a ser adicionada
	 */
	public void adiciona(Conta conta) {
		// Aqui voce escolhe qual metodo usar para testar as duas abordagens
		// diferentes.
		adicionaComVariavelDeControle(conta);
		// adicionaProcurandoNull(conta);
	} // fim adiciona

	/**
	 * Adiciona uma conta no vetor junto com uma vari&aacute;vel de controle.
	 * 
	 * A desvantagem dessa abordagem &eacute; que o array fica com buracos se
	 * implementar uma funcionalidade de remover conta.
	 * 
	 * @param conta
	 *            A conta a ser adicionada
	 */
	private void adicionaComVariavelDeControle(Conta conta) {
		// Primeiro, vemos se o vetor esta cheio, comparando o total de contas
		// com o tamanho do array. Se estiver, aumentamos o array.
		if (this.contas.length == this.totalDeContas) {
			aumentaArray();
		} // fim array

		// Adiciona a conta na proxima posicao
		this.contas[this.totalDeContas] = conta;
		// Incrementa o numero de contas no vetor
		this.totalDeContas++;
	} // fim adicionaComVariavelDeControle

	/**
	 * Adiciona uma conta no vetor procurando por uma posi&ccedil;&atilde;o que
	 * esteja nula.
	 * 
	 * A desvantagem dessa abordagem &eacute; que toda vez que adicionar, o
	 * array &eacute; percorrido totalmente.
	 * 
	 * @param conta
	 *            A conta a ser adicionada.
	 */
	private void adicionaProcurandoNull(Conta conta) {
		// Para saber se a conta foi adicionada a uma posicao nula, criei esta
		// variavel.
		boolean adicionada = false;

		// Percorre o array buscando por uma posicao nula
		for (int i = 0; i < this.contas.length; i++) {
			// Se a posicao atual for nula...
			if (this.contas[i] == null) {
				// Adiciona a conta
				this.contas[i] = conta;
				// Altera a variavel com true, indicando que a conta foi
				// adicionada
				adicionada = true;
				// Nao precisamos fazer mais nada, podemos quebrar e sair do
				// loop
				break;
			} // fim if
		} // fim for

		// Se a conta NAO foi adicionada...
		if (!adicionada) {
			// Significa que o array está cheio.
			// Primeiro, recuperamos o tamanho do array atual.
			// Esse numero sera a proxima posicao livre no novo array
			int proximaPosicao = this.contas.length;
			aumentaArray();
			// Agora que o array foi aumentado, sabemos que a ultima posicao do
			// array esta vaga
			this.contas[proximaPosicao] = conta;
		} // fim if

	} // fim adicionaProcuandoNull

	/**
	 * Aumentando o array de tamanho
	 * 
	 */
	private void aumentaArray() {
		// Cria um novo array maior
		Conta[] novoArray = new Conta[this.contas.length + 1];

		// Percorre o array antigo inteiro, copiando cada posicao para o novo
		// array
		for (int i = 0; i < this.contas.length; i++) {
			// Copia de um array para o outro
			novoArray[i] = this.contas[i];
		} // fim for

		// Passa a referencia do novo array para o atributo de contas, jogando
		// fora o antigo array cheio
		this.contas = novoArray;
	} // fim aumentaArray

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

	/**
	 * Verifica se uma conta existe no array.
	 * 
	 * @param conta
	 *            A refer&ecirc;ncia da conta a ser buscada.
	 * @return Se cont&eacute;m ou n&atilde;o.
	 */
	public boolean contem(Conta conta) {
		boolean encontrou = true;
		for(Conta contaDoArray : this.contas) {
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

	public Conta[] getContas() {
		return contas;
	}

} // fim Banco
