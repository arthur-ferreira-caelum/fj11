class PessoaFisica {
    private String cpf;
    
    // getters e setters
    
    public String getCpf() {
        return this.cpf;
    }
    
    public boolean defineCpf(String cpf) {
        if (valida(cpf)) {
            this.cpf = cpf;
            return true;
        }
        
        return false;
    } // fim defineCpf
    
    private boolean valida(String cpf) {
        return true;
    } // fim valida
} // fim Conta
