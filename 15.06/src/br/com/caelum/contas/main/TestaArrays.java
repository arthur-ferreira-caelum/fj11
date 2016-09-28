package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

/**
 * Testes para ver como funcionam os arrays.
 * 
 * @author Arthur Franco Ferreira
 * @since 22/09/2016
 *
 */
public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];

		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(100 * i);
			contas[i] = conta;
		} // fim for

		double soma = 0;
		// Pode ser que o vetor não esteja cheio. Se não estiver, ocorrerá uma
		// exception.
		for (Conta conta : contas) {
			soma += conta.getSaldo();
		} // fim for

		// Aqui eu coloquei a média pelo tamanho do vetor, pois estamos
		// preenchendo ele todo, mas o certo seria criar uma variável para
		// contar quantas contas realmente foram usadas. Pode ser que o vetor
		// não esteja cheio. Se não estiver, ocorrerá uma exception.
		System.out.println("A média dos saldos é de: " + soma / contas.length);
	} // fim main
} // fim TestaArrays
