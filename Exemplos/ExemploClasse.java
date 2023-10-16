// Definindo uma classe chamada "Pessoa"
class Pessoa {
    // A classe Pessoa tem atributos que a descrevem
    String nome;
    int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome; // Inicializa o atributo "nome" com o valor passado como argumento
        this.idade = idade; // Inicializa o atributo "idade" com o valor passado como argumento
    }

    // Método para exibir informações da Pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class ExemploClasse {
    public static void main(String[] args) {
        // Criando instâncias (objetos) da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Bob", 25);

        // Chama o método da classe Pessoa para exibir informações sobre as pessoas
        System.out.println("Pessoa 1:");
        pessoa1.exibirInformacoes();

        System.out.println("\nPessoa 2:");
        pessoa2.exibirInformacoes();
    }
}