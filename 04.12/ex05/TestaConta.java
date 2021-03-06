class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Luke";
        c1.numero = 123;
        c1.agencia = "3028";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "15/09/2016";
        c1.deposita(100.0);

        System.out.println("Saldo atual: " + c1.saldo);
        System.out.println("Rendimento anual: " + c1.calculaRendimento());
        System.out.println(c1.recuperaDadaosParaImpressao());
        
        Conta c2 = new Conta();
        c2.titular = "Luke";
        c2.numero = 123;
        c2.agencia = "3028";
        c2.saldo = 50.0;
        c2.dataDeAbertura = "15/09/2016";
        c2.deposita(100.0);
        
        if (c1 == c2)
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
    } // fim main
} // fim TestaConta
