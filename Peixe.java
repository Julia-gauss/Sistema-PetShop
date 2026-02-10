class Peixe extends Pet {
    private String tipoAgua;

    public Peixe(String nome, String raca, int idade, String tipoAgua) {
        super(nome, raca, idade, "Peixe");
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}