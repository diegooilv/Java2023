public class NumberToString {
    public static void main(String[] args) {
        // Exemplo de conversão de números para strings usando diferentes métodos.
        
        // Chama o método 01 para converter o número 1 em uma string.
        metodo_01(1);
        
        // Chama o método 02 para converter o número 2 em uma string.
        metodo_02(2);
        
        // Chama o método 03 para converter o número 3 em uma string.
        metodo_03(3);
    }

    static void metodo_01(int number) {
        // Método 01: Converte o número em uma string usando String.valueOf().
        String string = String.valueOf(number);
        System.out.println(string); // Imprime a string no console.
    }

    static void metodo_02(int number) {
        // Método 02: Converte o número em uma string usando Integer.toString().
        String string = Integer.toString(number);
        System.out.println(string); // Imprime a string no console.
    }

    static void metodo_03(int number) {
        // Método 03: Converte o número em uma string concatenando-o com uma string vazia.
        String string = "" + number;
        System.out.println(string); // Imprime a string no console.
    }
}
