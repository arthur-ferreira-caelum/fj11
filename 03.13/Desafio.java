class Desafio {
    public static void main(String[] args) {
        int valor = 0;
        int soma = 1;
		System.out.print(valor + ", " + soma);
        while (soma <= 100) {
            valor += soma;
            soma += valor;
			System.out.print(", " + valor + ", " + soma);
        } // fim while
    } // fim main
} // fim class
