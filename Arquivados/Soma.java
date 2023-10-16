package Archive;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int v1 = Integer.parseInt(scanner.nextLine());
        int v2 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        sum(v1, v2);
    }

    static void sum(int v1, int v2){
        int sum = v1+v2;
        System.out.printf("X = %d", sum);
    }
}
