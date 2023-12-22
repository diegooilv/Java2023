import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor = valor1 + valor2;
        System.out.printf("SOMA = %d%n", valor);
 
    }
 
}