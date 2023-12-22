import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int dif(int A, int B, int C, int D){
        return (A * B - C * D);
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int va1 = scanner.nextInt();
        int va2 = scanner.nextInt();
        int va3 = scanner.nextInt();
        int va4 = scanner.nextInt();
        System.out.printf("DIFERENÇA = %d%n",dif(va1, va2, va3, va4));
    }
}