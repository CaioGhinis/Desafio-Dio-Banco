public enum Tipo {
    TED("TED"),
    DOC("DOC"),
    PIX("PIX"),
    BOLETO("Boleto Bancário");

    private final String descricao;

    Tipo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
