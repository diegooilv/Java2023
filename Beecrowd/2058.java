import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int N =  scanner.nextInt();
        if(N == 3){
            System.out.println("1");
        }else{
            int lados = (int) 360/((180*(N-2)/N)/2);
            System.out.printf("%d%n", lados);

        }
 
    }
 
}