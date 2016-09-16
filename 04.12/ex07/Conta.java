class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    //String dataDeAbertura;
    Data dataDeAbertura;

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
        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMês: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        dados += "\nRendimento Anual: " + calculaRendimento();
        return dados;
    } // fim recuperaDadosParaImpressao
} // fim Conta
