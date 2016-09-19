class Fibonacci {
    int calculaFibonacci(int n) {
        /*
        if (n == 0)
            return 0;
        else if (n < 2) 
            return 1;
        else
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2); // recursividade
        */
        // Operador condicional ternario
        return n == 0 ? 0 : n < 2 ? 1 : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);  
    } // fim calculaFibonacci
} // fim Fibonacci
