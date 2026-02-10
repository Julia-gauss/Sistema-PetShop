class Mamifero extends Pet {
    private boolean pelagem;

    public Mamifero(String nome, String raca, int idade, boolean pelagem) {
        super(nome, raca, idade, "Mamifero");
        this.pelagem = pelagem;
    }

    public boolean isPelagem() {
        return pelagem;
    }

    public void setPelagem(boolean pelagem) {
        this.pelagem = pelagem;
    }

}