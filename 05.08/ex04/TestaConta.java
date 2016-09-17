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
        // primeiro pegamos a referencia da data usando o getter e depois chamamos o setter do atributo
        /*
        c1.dataDeAbertura.dia = 15;
        c1.dataDeAbertura.mes = 9;
        c1.dataDeAbertura.ano = 2016;
        */
        c1.getDataDeAbertura().setDia(15);
        c1.getDataDeAbertura().setMes(9);
        c1.getDataDeAbertura().setAno(2016);
        
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
