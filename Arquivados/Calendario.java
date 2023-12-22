package Arquivados;

import java.util.Scanner;

public class Calendario {
    public static void main(String[] args){
        int valor = -1;
        String mes;
        while(valor < 13 && valor > 0){
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextInt();
            scanner.close();
            if(valor > 0 && valor < 13){
                switch(valor){
                case 1:
                    mes = "janeiro";
                    System.out.print(mes);
                    break;
                case 2:
                    mes = "fevereiro";
                    System.out.print(mes);
                    break;
                case 3:
                    mes = "março";
                    System.out.print(mes);
                    break;
                case 4:
                    mes = "abril";
                    System.out.print(mes);
                    break;
                case 5:
                    mes = "maio";
                    System.out.print(mes);
                    break;
                case 6:
                    mes = "junho";
                    System.out.print(mes);
                    break;
                case 7:
                    mes = "julho";
                    System.out.print(mes);
                    break;
                case 8:
                    mes = "agosto";
                    System.out.print(mes);
                    break;
                case 9:
                    mes = "setembro";
                    System.out.print(mes);
                    break;
                case 10:
                    mes = "outubro";
                    System.out.print(mes);
                    break;
                case 11:
                    mes = "novembro";
                    System.out.print(mes);
                    break;
                case 12:
                mes = "dezembro";
                System.out.print(mes);
                break;
                } 
            break;
            }
        System.out.println("Tente novamente!!");
        }
    }   
}