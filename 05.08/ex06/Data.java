class Data {

    // Atributos de instancia

    private int dia;
    private int mes;
    private int ano;

    // Metodos

    public boolean defineData(int dia, int mes, int ano) {
        // Verifica se passou um dia valido
        if (dia < 1 || dia > 31)
            return false;
        
        // Verifica se passou um mes valido
        if (mes < 1 || mes > 12)
            return false;
            
        // Verifica se passou um dia para fevereiro
        if (mes == 2 && dia > 29)
            return false;
        
        // Verifica se passou um dia valido para fevereiro em ano bissexto
        if ((mes == 2 && (ano % 6 != 0)) && dia > 28)
            return false;
            
        // Verifica se passou um dia valido para os meses que terminam no dia 30
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
            return false; 
            
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        return true;
    } // fim defineData
    
    public String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    } // fim formatada
    
    // getters e setters
    
    public int getDia() {
        return this.dia;
    }
    
    /*
    public void setDia(int dia) {
        this.dia = dia;
    }
    */
    
    public int getMes() {
        return this.mes;
    }
    
    /*
    public void setMes(int mes) {
        this.mes = mes;
    }
    */
    
    public int getAno() {
        return this.ano;
    }
    
    /*
    public void setAno(int ano) {
        this.ano = ano;
    }
    */
} // fim Data
