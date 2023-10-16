// Casting = Conversão de Tipos

public class ConversaoDeTipos {
    public static void main(String[] args) {
        // Exemplo 1: Cast de int para double (sem perda de dados)
        int numeroInteiro = 42;
        double numeroPontoFlutuante = (double) numeroInteiro;
        System.out.println("Exemplo 1: int para double: " + numeroPontoFlutuante);

        // Exemplo 2: Cast de double para int (possível perda de dados)
        double numeroPontoFlutuante2 = 3.14;
        int numeroInteiro2 = (int) numeroPontoFlutuante2;
        System.out.println("Exemplo 2: double para int: " + numeroInteiro2);

        // Exemplo 3: Cast de char para int (conversão de caractere para valor ASCII)
        char caractere = 'A';
        int valorAscii = (int) caractere;
        System.out.println("Exemplo 3: char para int (ASCII): " + valorAscii);

        // Exemplo 4: Cast de int para char (conversão de valor ASCII para caractere)
        int valorAscii2 = 66; // Valor ASCII para 'B'
        char caractere2 = (char) valorAscii2;
        System.out.println("Exemplo 4: int para char (caractere): " + caractere2);

        // Exemplo 5: Cast de double para long (possível perda de dados)
        double numeroPontoFlutuante3 = 1234567.89;
        long numeroLongo = (long) numeroPontoFlutuante3;
        System.out.println("Exemplo 5: double para long: " + numeroLongo);

        // Exemplo 6: Cast de long para int (possível perda de dados)
        long numeroLongo2 = 9876543210L;
        int numeroInteiro3 = (int) numeroLongo2;
        System.out.println("Exemplo 6: long para int: " + numeroInteiro3);
    }
}
