import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        String nome = scanner.nextLine();
        float valor1 = scanner.nextFloat();
        float valor2 = scanner.nextFloat();
        System.out.printf("TOTAL = R$ %.2f%n", (valor1+(valor2*0.15)));
        scanner.close();
    }
 
}