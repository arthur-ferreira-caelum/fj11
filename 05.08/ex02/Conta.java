class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;

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
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
        dados += "\nRendimento Anual: " + calculaRendimento();
        return dados;
    } // fim recuperaDadosParaImpressao
    
    // getters e setters
    
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
