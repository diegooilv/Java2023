import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        double soma = 0;
        scanner.nextLine();

        for(int i = 0; i < value; i++){
            String input = scanner.nextLine();
            String[] valor = input.split(" ");
            int v1 = Integer.parseInt(valor[0]);
            int v2 = Integer.parseInt(valor[1]);
            switch (v1) {
                case 1001:
                    soma += v2*1.50;
                    break;

                case 1002:
                    soma += v2*2.50;
                    break;

                case 1003:
                    soma += v2*3.50;
                    break;
                case 1004:
                    soma += v2*4.50;
                    break;

                case 1005:
                    soma += v2*5.50;
                    break;
            
                default:
                    break;
            }
            

        }
        System.out.printf("%.2f%n", soma);
    }
}