package Arquivados;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int valor;
        String mes;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextInt();
            scanner.close();
            if (valor > 0 && valor < 13) {
                switch (valor) {
                    case 1:
                        mes = "janeiro";
                        System.out.println(mes);
                        break;
                    case 2:
                        mes = "fevereiro";
                        System.out.println(mes);
                        break;
                    case 3:
                        mes = "março";
                        System.out.println(mes);
                        break;
                    case 4:
                        mes = "abril";
                        System.out.println(mes);
                        break;
                    case 5:
                        mes = "maio";
                        System.out.println(mes);
                        break;
                    case 6:
                        mes = "junho";
                        System.out.println(mes);
                        break;
                    case 7:
                        mes = "julho";
                        System.out.println(mes);
                        break;
                    case 8:
                        mes = "agosto";
                        System.out.println(mes);
                        break;
                    case 9:
                        mes = "setembro";
                        System.out.println(mes);
                        break;
                    case 10:
                        mes = "outubro";
                        System.out.println(mes);
                        break;
                    case 11:
                        mes = "novembro";
                        System.out.println(mes);
                        break;
                    case 12:
                        mes = "dezembro";
                        System.out.println(mes);
                        break;
                }
                break;
            } else {
                System.out.println("Tente novamente!!");
            }
        }
    }
}
