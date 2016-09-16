class Fibonacci {
    int calculaFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n < 2) 
            return 1;
        else
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2); // recursividade
    } // fim calculaFibonacci
} // fim Fibonacci
