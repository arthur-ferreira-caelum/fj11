class Exercicio7 {
    public static void main(String[] args) {
        // Dado um valor inicial:
		int x = 13;
		// O programa continua enquanto o valor for maior do que 1
        while (x > 1) {
			// Verifica se é par, se não, é ímpar e aplica a fórmula.
            if (x % 2 == 0)
                x /= 2;
			else
                x = 3 * x + 1;
			
			// Imprime o valor.
            System.out.print(x);
			
			// Se o valor for maior do que 1, imprime a seta.
			if (x > 1) 
			    System.out.print(" -> ");	
        } // fim while
    } // fim main
} // fim class
