class Ave extends Pet {
    private boolean voa;

    public Ave(String nome, String raca, int idade, boolean voa) {
        super(nome, raca, idade, "Ave");
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

}