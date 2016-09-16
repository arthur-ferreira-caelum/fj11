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
} // fim Conta
