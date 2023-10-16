package Archive;

import java.util.Random;

public class MegaSena {
    public static void main(String[] args){
        int quant;
        quant = Integer.parseInt(args[0]);
        gerador(quant);
    }
    static void gerador(int quant){
        Random generate = new Random();
        for(int a = 0; a < quant; a++){
            for(int i = 0; i < 6; i++){
                int valor;
                valor = generate.nextInt(60);
                if(i <= 4){
                    System.out.printf("%d,",valor);
                } else{
                    System.out.println(valor);
                }
            }

        }
    }
}
