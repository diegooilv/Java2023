public class Arrays {

    public static void main(String[] args) {
        // Declaração de um array de inteiros com tamanho 5
        int[] numeros = new int[5];

        // Inicialização do array com valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e imprimindo valores do array
        System.out.println("O valor no índice 2 é: " + numeros[2]);

        // Tamanho do array
        int tamanhoDoArray = numeros.length;
        System.out.println("O tamanho do array é: " + tamanhoDoArray);

        // Iteração sobre o array usando um loop for
        System.out.println("Valores do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Array de strings
        String[] nomes = {"Alice", "Bob", "Carol", "David", "Eve"};

        // Iteração sobre o array de strings usando um loop for-each
        System.out.println("Nomes no array:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
