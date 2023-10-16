public class Ordenação {
    public static void main(String[] args) {
        // Array de números a ser ordenado
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Exibindo o array original
        System.out.println("Array original:");
        printArray(arr);

        // Chamando a função de ordenação
        bubbleSort(arr);

        // Exibindo o array ordenado
        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    // Função para imprimir um array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Função para realizar a ordenação usando o Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Loop externo para percorrer o array n vezes
        for (int i = 0; i < n - 1; i++) {
            // Loop interno para comparar os elementos e trocar se necessário
            for (int j = 0; j < n - i - 1; j++) {
                // Comparando elementos adjacentes
                if (arr[j] > arr[j + 1]) {
                    // Trocando os elementos se o atual for maior que o próximo
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}