class Exercicio3 {
    public static void main(String[] args) { 
        // Solução que os alunos geralmente fazem
        for (int i = 1; i < 100; i++) // O for e o if so tem uma linha. Nao preciso das chaves
            if (i % 3 == 0) 
                System.out.println(i); 
            
        // Solução mais simples
        int valor = 3;
        while (valor <= 100) {
            System.out.println(valor);
            valor += 3;
        } // fim while

        System.out.println("");
        System.out.println("==================================================");
        System.out.println("");
    } // fim main
} // fim class
