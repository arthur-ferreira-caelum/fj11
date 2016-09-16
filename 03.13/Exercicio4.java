class Exercicio4 {
    public static void main(String[] args) {
        int fatorial = 1;
		System.out.println("O fatorial de 0 eh: 1");
        for (int n = 1; n <= 10; n++) {
            fatorial *= n;
            System.out.println("O fatorial de " + n + " eh (" + (n-1) + "!) * " + n + " = " + fatorial);
        } // fim for
    } // fim main
} // fim class
