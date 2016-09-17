class Conta {
    // Atributos de classe
    
    private static int totalDeContas;
    
    // Atributos de instancia

    private int identificador;
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;

    // Construtores
    
    public Conta() {
        Conta.totalDeContas++;
        this.identificador = Conta.totalDeContas; 
    }
    
    public Conta(String titular) {
        this();
        this.titular = titular;
    }
    
    // Metodos

    public void saca(double valor) {
        // this.saldo = this.saldo - valor;
        this.saldo -= valor;
    } // fim saca

    public void deposita(double valor) {
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    } // fim deposita

    public double calculaRendimento() {
        return this.saldo * 12;
    } // fim calculaRendimento
    
    public String recuperaDadaosParaImpressao() {
        String dados = "Identificador: " + this.identificador;
        dados += "\nTitular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        dados += "\nRendimento Anual: " + calculaRendimento();
        return dados;
    } // fim recuperaDadosParaImpressao
    
    // getters e setters
    
    public int getIdentificador() {
        return this.identificador;
    }
    
    public String getTiular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    // Nao devemos ter o set saldo, pois ele eh feito pelos metodos saca e deposita
    
    public Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }
    
    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    
} // fim Conta
