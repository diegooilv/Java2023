public class TiposDeVariaveis {
    public static void main(String[] args) {
        // Variáveis numéricas
        int numeroInteiro = 42; // Variável inteira
        double numeroDecimal = 3.14159; // Variável de ponto flutuante (double)
        float numeroDecimalMenosPreciso = 2.71828f; // Variável de ponto flutuante (float)
        long numeroLongo = 1234567890L; // Variável longa

        // Variáveis de texto
        String texto = "Olá, mundo!"; // Variável de texto (String)
        char caractere = 'A'; // Variável de caractere (char)

        // Variáveis booleanas
        boolean verdadeiro = true;
        boolean falso = false;

        // Exibindo os valores das variáveis
        System.out.println("Variáveis numéricas:");
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Número decimal (menos preciso): " + numeroDecimalMenosPreciso);
        System.out.println("Número longo: " + numeroLongo);

        System.out.println("\nVariáveis de texto:");
        System.out.println("Texto: " + texto);
        System.out.println("Caractere: " + caractere);

        System.out.println("\nVariáveis booleanas:");
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
    }
}

