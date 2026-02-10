import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPetShop {
    static Scanner scanner = new Scanner(System.in);
    static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- MENU PETSHOP ---");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Pet para Cliente");
            System.out.println("3. Buscar Pets por Raça");
            System.out.println("4. Excluir Pet por Nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarPetParaCliente();
                case 3 -> buscarPetsPorRaca();
                case 4 -> excluirPetPorNome();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço do cliente: ");
        String endereco = scanner.nextLine();
        clientes.add(new Cliente(nome, endereco));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    static void cadastrarPetParaCliente() {
        System.out.print("Nome do cliente dono do pet: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Nome do pet: ");
        String nomePet = scanner.nextLine();
        System.out.print("Raça do pet: ");
        String raca = scanner.nextLine();
        System.out.print("Idade do pet: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Pet pet = new Mamifero(nomePet, raca, idade, true); // exemplo fixo com Mamífero
        cliente.adicionarPet(pet);
        System.out.println("Pet cadastrado com sucesso!");
    }

    static void buscarPetsPorRaca() {
        System.out.print("Informe a raça: ");
        String raca = scanner.nextLine();

        for (Cliente cliente : clientes) {
            for (Pet pet : cliente.getPets()) {
                if (pet.getRaca().equalsIgnoreCase(raca)) {
                    System.out.println("Pet: " + pet.getNome() + ", Dono: " + cliente.getNome());
                }
            }
        }
    }

    static void excluirPetPorNome() {
        System.out.print("Nome do cliente dono do pet: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorNome(nomeCliente);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Nome do pet a excluir: ");
        String nomePet = scanner.nextLine();
        boolean removido = cliente.removerPetPorNome(nomePet);

        if (removido) {
            System.out.println("Pet removido com sucesso.");
        } else {
            System.out.println("Pet não encontrado.");
        }
    }

    static Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
