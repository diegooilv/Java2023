import java.util.Arrays;

public class ComparandoArrays {
    public static void main(String[] args) {
        // Definindo dois arrays para comparação
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Usando == para comparar arrays (NÃO recomendado)
        boolean usandoIgual = (array1 == array2); // Compara as referências, não o conteúdo

        // Usando .equals() para comparar arrays (NÃO recomendado)
        boolean usandoEquals = array1.equals(array2); // Comportamento padrão herda de Object (compara referências)

        // Usando Arrays.equals() para comparar arrays (RECOMENDADO)
        boolean usandoArraysEquals = Arrays.equals(array1, array2); // Compara o conteúdo dos arrays

        // Exibindo os resultados
        System.out.println("Usando ==: " + usandoIgual); // Deve ser false
        System.out.println("Usando .equals(): " + usandoEquals); // Deve ser false
        System.out.println("Usando Arrays.equals(): " + usandoArraysEquals); // Deve ser true
    }
}
