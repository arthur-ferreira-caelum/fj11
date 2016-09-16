class Exercicio2 {
    public static void main(String[] args) {
        // Código normalmente utilizado
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        } // fim for
        System.out.println(soma);
        
        // Usando a formula da progressao aritmetica: Sn = n * (a1 + an) / 2
        System.out.println("");
        System.out.println("== Usando a formula da soma da P.A. ==");
        System.out.println("");
        int n = 1000;
		int a1 = 1;
		int an = 1000;
		int sn = n * (a1 + an) / 2;
		System.out.println(sn);
    } // fim main
} // fim class
