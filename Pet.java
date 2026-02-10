
abstract class Pet {
    private String nome;
    private String raca;
    private int idade;
    private String tipo;

    public Pet(String nome, String raca, int idade, String tipo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.tipo = tipo;
    }

    public Pet(int idade, String nome, String raca, String tipo) {
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }
    public String getTipo() { return tipo; }
}
