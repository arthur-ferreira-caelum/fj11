package br.com.caelum.contas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

/**
 * Class que escreve/l&eacirc; as contas de um arquivo.
 * 
 * @author Arthur Franco Ferreira
 * @since 30/09/2016
 *
 */
public class RepositorioDeContas {

	/**
	 * Escreve uma lista de contas no arquivo.
	 * 
	 * @param contas
	 *            A lista de contas a ser escrita no arquivo.
	 */
	public void salva(List<Conta> contas) {
		PrintStream stream = null;
		try {
			stream = new PrintStream("contas.txt");
			for (Conta conta : contas) {
				stream.println(conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + ","
						+ conta.getTitular() + "," + conta.getSaldo());
			} // fim for
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		} finally {
			if (stream != null)
				stream.close();
		} // fim finally
	} // fim salva

	/**
	 * Carrega a lista de contas salva no arquivo.
	 * 
	 * @return A lista recuperada do arquivo.
	 */
	public List<Conta> carrega() {
		Scanner scanner = null;
		List<Conta> contas = new ArrayList<>();
		try {
			scanner = new Scanner(new File("contas.txt"));
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				String[] valores = linha.split(",");
				
				String tipo = valores[0];
				Conta conta = null;
				if (tipo.equals("Conta Corrente"))
					conta = new ContaCorrente();
				else if (tipo.equals("Conta Poupança"))
					conta = new ContaPoupanca();
				
				conta.setNumero(Integer.parseInt(valores[1]));
				conta.setAgencia(valores[2]);
				conta.setTitular(valores[3]);
				conta.deposita(Double.parseDouble(valores[4]));
				
				contas.add(conta);
			} // fim while
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		} finally {
			scanner.close();
		} // fim finally
		
		return contas;
	} // fim carregaDados

} // fim RepositorioDeContas