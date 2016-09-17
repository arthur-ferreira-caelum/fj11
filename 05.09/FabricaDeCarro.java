class FabricaDeCarro {
    
    // Atributos da classe
    
    private static final FabricaDeCarro INSTANCIA = new FabricaDeCarro();
    
    // Construtor
    
    private FabricaDeCarro() {
    
    }
    
    public static FabricaDeCarro getInstancia() {
        return INSTANCIA;
    } // fim getInstancia
    
    public static String getMensagem() {
        return "It's a trap!";
    } // fim exibirMensagem
    
} // fim Conta
