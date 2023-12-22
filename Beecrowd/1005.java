import java.io.IOException;
import java.util.Scanner;

public class Main {

    static double media(double a, double b){
        return (a*3.5+b*7.5)/(3.5+7.5);
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double va1 = scanner.nextDouble();
        double va2 = scanner.nextDouble();
        System.out.printf("MEDIA = %.5f%n",media(va1, va2));
 
    }
 
}