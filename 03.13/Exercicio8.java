class Exercicio8 {
    public static void main(String[] args) {
        // Este loop controla o número de linhas.
		for (int i = 1; i <= 4; i++) {
			// Imprime o primeiro número da linha.
			System.out.print(i + " ");
			
			// Este loop controla o número de colunas.
			for (int j = 2; j <= i; j++)
				// Imprime o número da coluna multiplicado pelo primeiro número da linha.
				System.out.print(i * j + " ");
			
			// Quebra linha
			System.out.println("");
        } // fim for
    } // fim main
} // fim class
