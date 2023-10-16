import java.util.ArrayList; // Importa a classe ArrayList da biblioteca Java

public class Lista {

    public static void main(String[] args) {
        // Cria uma lista de strings usando ArrayList
        ArrayList<String> minhaLista = new ArrayList<>();

        // Adiciona elementos à lista
        minhaLista.add("Maçã");
        minhaLista.add("Banana");
        minhaLista.add("Laranja");

        // Acessando elementos da lista
        String primeiraFruta = minhaLista.get(0); // A lista é baseada em zero
        System.out.println("Primeira fruta: " + primeiraFruta);

        // Tamanho da lista
        int tamanho = minhaLista.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Iteração sobre a lista
        System.out.println("Elementos da lista:");
        for (String fruta : minhaLista) {
            System.out.println(fruta);
        }

        // Remoção de um elemento da lista
        minhaLista.remove("Banana");
        System.out.println("Após remover a Banana:");
        for (String fruta : minhaLista) {
            System.out.println(fruta);
        }
    }
}
