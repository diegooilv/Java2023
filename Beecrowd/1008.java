import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double c_salario(double sal, int tempo){
        return (double) sal*tempo;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double salario = scanner.nextDouble();
        int tempo = scanner.nextInt();
        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", c_salario(salario, tempo));
    }
 
}