class Exercicio6 {
    public static void main(String[] args) {
        System.out.print("0");
        System.out.print(", " + 1);
        int valorAnterior = 0;
        int valorAtual = 1;
        int soma = valorAtual + valorAnterior;
        while (soma < 100) {
            System.out.print(", " + soma);
            valorAnterior = valorAtual;
            valorAtual = soma;
            soma = valorAtual + valorAnterior;
        } // fim while
    } // fim main
} // fim class
