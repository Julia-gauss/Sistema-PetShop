abstract class Funcionario {
    private String nome;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
}

