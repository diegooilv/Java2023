public class ExemploBasico {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int numero = 10;
        String texto = "Olá, mundo!";
        boolean condicao = true;

        // Estrutura condicional (if-else)
        if (condicao) {
            System.out.println("A condição é verdadeira.");
        } else {
            System.out.println("A condição é falsa.");
        }

        // Laço for para contar de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // Arrays
        int[] numeros = {1, 2, 3, 4, 5};
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        // Acesso a elementos de arrays
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Terceira fruta: " + frutas[2]);

        // Saída de dados
        System.out.println("Número: " + numero);
        System.out.println("Texto: " + texto);
    }
}

