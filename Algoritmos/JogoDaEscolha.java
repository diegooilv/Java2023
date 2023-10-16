package Algoritmos;

import java.util.Random;
import java.util.Scanner;

public class JogoDaEscolha {

    private static int gerarNumero(int number){
        Random random = new Random();
        int numero = random.nextInt(number);
        return numero;
    }

    private static boolean tentativas(int quantidade, int valorCerto){
        Scanner scanner = new Scanner(System.in);
        int tentativa;
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Faça sua escolha de número %d: ", i+1);
            tentativa = scanner.nextInt();
            if(tentativa == valorCerto){
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor máximo:");
        int max = scanner.nextInt();
        System.out.println("Em até quantas tentativas deseja jogar?");
        int tentativas = scanner.nextInt();
        int ValorCerto = gerarNumero(max);
        if(tentativas(tentativas, ValorCerto)){
            System.out.printf("Parabéns!! Você acertou o número: %d", ValorCerto);
            
        } else{
            System.out.printf("Infelizmente você perdeu!! O número era: %d", ValorCerto);
        }
        scanner.close();
    }
}
