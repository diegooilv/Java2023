import java.io.IOException;
import java.util.Scanner;

public class Main {

    static double media(double v1, double v2, double v3){
        return (v1*0.2)+(v2*0.3)+(v3*0.5);
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double va1 = scanner.nextDouble();
        double va2 = scanner.nextDouble();
        double va3 = scanner.nextDouble();
        System.out.printf("MEDIA = %.1f%n",media(va1, va2, va3));
 
    }
 
}