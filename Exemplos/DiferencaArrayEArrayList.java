import java.util.ArrayList; // Importa a classe ArrayList da biblioteca Java

public class DiferencaArrayEArrayList {

    public static void main(String[] args) {
        // Arrays em Java
        int[] array = new int[5]; // Cria um array de int com tamanho fixo 5

        array[0] = 10; // Atribui o valor 10 à primeira posição do array
        array[1] = 20; // Atribui o valor 20 à segunda posição do array
        array[2] = 30; // Atribui o valor 30 à terceira posição do array

        // ArrayList em Java
        ArrayList<Integer> arrayList = new ArrayList<>(); // Cria um ArrayList de inteiros

        arrayList.add(10); // Adiciona o valor 10 ao ArrayList
        arrayList.add(20); // Adiciona o valor 20 ao ArrayList
        arrayList.add(30); // Adiciona o valor 30 ao ArrayList

        // Diferenças principais:
        // 1. Tamanho: Arrays têm tamanho fixo, enquanto ArrayLists têm tamanho dinâmico.
        // 2. Redimensionamento: Em um array, se você precisar de mais espaço, é necessário criar um novo array maior e copiar os elementos. Em um ArrayList, ele cresce automaticamente.
        // 3. Tipos primitivos: Arrays podem conter tipos primitivos, como int, enquanto ArrayLists lidam apenas com objetos.

        // Acessando elementos
        int primeiroElementoDoArray = array[0];
        int primeiroElementoDoArrayList = arrayList.get(0);

        // Imprimindo os valores
        System.out.println("Primeiro elemento do Array: " + primeiroElementoDoArray);
        System.out.println("Primeiro elemento do ArrayList: " + primeiroElementoDoArrayList);
    }
}
