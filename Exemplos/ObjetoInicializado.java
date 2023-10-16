public class ObjetoInicializado {
    // Atributos da classe Pessoa
    private String nome;
    private int idade;

    // Construtor padrão (sem argumentos)
    public ObjetoInicializado() {
        // Este é um construtor vazio (padrão) que não recebe argumentos.
        // Pode ser chamado para criar uma instância de Pessoa com valores padrão.

        nome = "Nome Padrão";
        idade = 0;
    }

    // Construtor personalizado
    public ObjetoInicializado(String nome, int idade) {
        // Este é um construtor personalizado que recebe argumentos.
        // Permite criar uma instância de Pessoa com valores específicos.

        this.nome = nome; // O "this" refere-se ao atributo da instância, diferenciando-o do parâmetro.
        this.idade = idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Criar uma instância da classe Pessoa usando o construtor padrão
        ObjetoInicializado pessoaPadrao = new ObjetoInicializado();

        // Criar uma instância da classe Pessoa usando o construtor personalizado
        ObjetoInicializado pessoaPersonalizada = new ObjetoInicializado("Alice", 30);

        // Exibir informações das pessoas
        System.out.println("Informações da Pessoa Padrão:");
        pessoaPadrao.exibirInformacoes();

        System.out.println("\nInformações da Pessoa Personalizada:");
        pessoaPersonalizada.exibirInformacoes();
    }
}
