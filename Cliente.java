import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String endereco;
    private List<Pet> pets;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pets = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Pet> getPets() { return pets; }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public boolean removerPetPorNome(String nomePet) {
        return pets.removeIf(p -> p.getNome().equalsIgnoreCase(nomePet));
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

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
  
}