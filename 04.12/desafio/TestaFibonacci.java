public class TestaFibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int resultado = 0;
        for (int n = 1; resultado < 100; n++) {
            System.out.print(resultado == 0 ? resultado : ", " + resultado);
            resultado = fibonacci.calculaFibonacci(n);
        } // fim for
    } // fim main
} // fim TestaFibonacci
