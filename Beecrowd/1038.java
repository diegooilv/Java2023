import java.io.IOException;
import java.util.Scanner;

public class Main {

    static float vender(int codico, int quantidade){
        if(codico == 1){
            return (float) quantidade * 4;
        }else if(codico == 2){
            return (float) ((float) quantidade * 4.5);
        }else if(codico == 3){
            return (float) quantidade * 5;
        }else if(codico == 4){
            return (float) quantidade * 2;
        }else if(codico == 5){
            return (float) ((float) quantidade * 1.5);
        }else{
            return 0;
        }
    }
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine();
        String[] partes = linha.split(" ");
        int num1 = Integer.parseInt(partes[0]);
        int num2 = Integer.parseInt(partes[1]);
        System.out.printf("Total: R$ %.2f%n", vender(num1, num2));
        scanner.close();
    }
 
} 