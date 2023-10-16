
public class VisibilidadeDeEscopo {
    
    // Variável pública: Pode ser acessada de qualquer lugar.
    public int valorPublico = 42;

    // Variável com visibilidade de pacote (default): Acessível apenas dentro do mesmo pacote.
    int valorPadrao = 25;

    // Variável protegida: Acessível na mesma classe, subclasse ou dentro do mesmo pacote.
    protected int valorProtegido = 10;

    // Variável privada: Acessível somente na mesma classe.
    private int valorPrivado = 5;

    // Método público: Pode ser chamado de qualquer lugar.
    public void metodoPublico() {
        System.out.println("Este é um método público.");
    }

    // Método com visibilidade de pacote (default): Acessível apenas dentro do mesmo pacote.
    void metodoPadrao() {
        System.out.println("Este é um método com visibilidade de pacote.");
    }

    // Método protegido: Acessível na mesma classe, subclasse ou dentro do mesmo pacote.
    protected void metodoProtegido() {
        System.out.println("Este é um método protegido.");
    }

    // Método privado: Acessível somente na mesma classe.
    private void metodoPrivado() {
        System.out.println("Este é um método privado.");
    }

    public static void main(String[] args) {
        VisibilidadeDeEscopo exemplo = new VisibilidadeDeEscopo();

        // Variável pública: Pode ser acessada de fora da classe.
        System.out.println("Variável pública: " + exemplo.valorPublico);

        // Variável com visibilidade de pacote: Acessível apenas no mesmo pacote.
        System.out.println("Variável com visibilidade de pacote: " + exemplo.valorPadrao);

        // Variável protegida: Pode ser acessada devido ao método main estar na mesma classe.
        System.out.println("Variável protegida: " + exemplo.valorProtegido);

        // Variável privada: Não pode ser acessada diretamente de fora da classe.
        System.out.println("Variável privada: " + exemplo.valorPrivado);

        // Chamar métodos com diferentes níveis de visibilidade.
        exemplo.metodoPublico();      // Público - pode ser chamado de qualquer lugar.
        exemplo.metodoPadrao();        // Com visibilidade de pacote - apenas no mesmo pacote.
        exemplo.metodoProtegido();     // Protegido - na mesma classe, subclasse ou mesmo pacote.
        exemplo.metodoPrivado();       // Privado - somente na mesma classe.
    }
}
