import java.io.IOException;
import java.util.Scanner;

public class Main {

    static double pi = 3.14159;
    static double area(double raio){
        // area = π . raio2

        double area = pi * Math.pow(raio, 2);
        return area;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double raioo = scanner.nextDouble();
        System.out.printf("A=%.4f%n", area(raioo));
    }
}