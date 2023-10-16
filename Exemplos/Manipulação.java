import java.util.Scanner;

public class Manipulação {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir uma string.
        String str = scanner.nextLine();

        // Chama várias funções para manipular a string.
        count(str);            // Conta o número de caracteres na string.
        contains_bah(str);     // Verifica se a string contém "bah".
        position(str);         // Encontra a posição da primeira ocorrência de "bah".
        last_position(str);    // Encontra a posição da última ocorrência de "bah".
        Upper(str);            // Converte a string para letras maiúsculas.
        Lower(str);            // Converte a string para letras minúsculas.
        from_05(str);          // Exibe a parte da string a partir do quinto caractere.
        equals_bah(str);       // Verifica se a string é igual a "bah".

        scanner.close();       // Fecha o scanner.
    }

    static void count(String str) {
        System.out.println(str.length()); // Imprime o número de caracteres na string.
    }

    static void contains_bah(String str) {
        System.out.println(str.contains("bah")); // Verifica se a string contém "bah".
    }

    static void position(String str) {
        System.out.println(str.indexOf("bah")); // Encontra a posição da primeira ocorrência de "bah".
    }

    static void last_position(String str) {
        System.out.println(str.lastIndexOf("bah")); // Encontra a posição da última ocorrência de "bah".
    }

    static void Upper(String str) {
        System.out.println(str.toUpperCase()); // Converte a string para letras maiúsculas.
    }

    static void Lower(String str) {
        System.out.println(str.toLowerCase()); // Converte a string para letras minúsculas.
    }

    static void from_05(String str) {
        System.out.println(str.substring(4)); // Exibe a parte da string a partir do quinto caractere.
    }

    static void equals_bah(String str) {
        System.out.println(str.equals("bah")); // Verifica se a string é igual a "bah".
    }
}
