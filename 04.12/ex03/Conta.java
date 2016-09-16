class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    void saca(double valor) {
        // this.saldo = this.saldo - valor;
        this.saldo -= valor;
    } // fim saca

    void deposita(double valor) {
        // this.saldo = this.saldo + valor;
        this.saldo += valor;
    } // fim deposita

    double calculaRendimento() {
        return this.saldo * 12;
    } // fim calculaRendimento
    
    String recuperaDadaosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nData de Abertura: " + this.dataDeAbertura;
        dados += "\nRendimento Anual: " + calculaRendimento();
        return dados;
    } // fim recuperaDadosParaImpressao
} // fim Conta
