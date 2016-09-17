class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        //c1.titular = "Luke";
        c1.setTitular("Luke");
        
        //c1.numero = 123;
        c1.setNumero(123);
        
        //c1.agencia = "3028";
        c1.setAgencia("3028");
        
        //c1.saldo = 50.0;
        
        // c1.dataDeAbertura = new Data();
        c1.setDataDeAbertura(new Data());
        // Agora a unica forma de criarmos uma data eh atraves do metodo defineData
        boolean dataValida = c1.getDataDeAbertura().defineData(29, 2, 2016);
        if (!dataValida)
            System.out.println("Data inválida!!!");
        
        c1.deposita(100.0);

        // System.out.println("Saldo atual: " + c1.saldo);
        System.out.println("Saldo atual: " + c1.getSaldo());
        
        System.out.println("Rendimento anual: " + c1.calculaRendimento());
        System.out.println(c1.recuperaDadaosParaImpressao());
        
        Conta c2 = c1;
        
        if (c1 == c2)
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
    } // fim main
} // fim TestaConta
