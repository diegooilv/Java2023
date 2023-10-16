package Algoritmos;

import java.util.Scanner;

public class Fibonacci {

    private static int v1 = 0;
    private static int v2= 1;

    private static int calc(int v1, int v2){
        return v1+v2;
    }

    private static void fibo(int quant){
        System.out.println("Sua sequência:");
        System.out.printf("%d%n", v1);
        
        for(int i = 0; i < quant; i++){
            int temp;
            temp = calc(v1, v2);
            System.out.printf("%d%n", v2);
            v1 = v2;
            v2 = temp;
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        scanner.close();
        fibo(quantidade);
    } 
}
