package Intercambio;

import java.util.Scanner;

/*
euro: 1;
real 0.1969;
euro 1.0510;
libra 1.2144;
iene 0.0067;
franco 1.1083;
canadense 0.7321;
australiano 0.6294;
*/

// Esse programa não permite a conversão para o dólar! Escolha outra moeda! o dólar funciona apenas como moeda de troca!
// Uma versão 2.0 desse programa será feita!

public class User{

    private static void printzin(String Tipo1, String Tipo2, float Valor1, float Valor2){
        System.out.println("Obrigado por utilizar esse programa!");
        System.out.printf("Você tinha: %f %s%n", Valor1, Tipo1);
        System.out.printf("Agora você tem: %f %s%n", Valor2, Tipo2);
    }

    private static float EmDolar(String Tipo, float Valor){
        ParaDolar dolar = new ParaDolar();
        float resposta;
        switch(Tipo){
            case "real":
                resposta = (float) dolar.RealPraDolar(Valor);
                 return resposta;
            case "euro":
                resposta = (float) dolar.EuroPraDolar(Valor);
                 return resposta;
            case "libra":
                resposta = (float) dolar.LibraPraDolar(Valor);
                 return resposta;
            case "iene":
                resposta = (float) dolar.IenePraDolar(Valor);
                 return resposta;
            case "franco":
                resposta = (float) dolar.FrancoPraDolar(Valor);
                 return resposta;
            case "canadense":
                resposta = (float) dolar.CanadensePraDolar(Valor);
                 return resposta;
            case "australiano":
                resposta = (float) dolar.EuroPraDolar(Valor);
                return resposta;
            default:
                return 0;
        }
    }

        private static float DoDolar(String Tipo, float Valor){
            DoDolar dolar = new DoDolar();
            float resposta;
            switch(Tipo){
                case "real":
                resposta = (float) dolar.DolarParaReal(Valor);
                 return resposta;
            case "euro":
                resposta = (float) dolar.DolarParaEuro(Valor);
                 return resposta;
            case "libra":
                resposta = (float) dolar.DolarParaLibra(Valor);
                 return resposta;
            case "iene":
                resposta = (float) dolar.DolarParaIene(Valor);
                 return resposta;
            case "franco":
                resposta = (float) dolar.DolarParaFranco(Valor);
                 return resposta;
            case "canadense":
                resposta = (float) dolar.DolarParaCanadense(Valor);
                 return resposta;
            case "australiano":
                resposta = (float) dolar.DolarParaAustraliano(Valor);
                return resposta;
            default:
                return 0;
            }
        }

        private static Object[] Opções01(){
            Scanner scanner = new Scanner(System.in);
            String tipo = scanner.next();
            float quant = (float) scanner.nextFloat();
            return new Object[]{tipo, quant};
        }
        private static Object[] Opções02(){
            Scanner scanner = new Scanner(System.in);
            String tipo = scanner.next();
            scanner.close();
            return new Object[]{tipo, tipo};
        } 
    
    public static void main(String[] args){
        Object[] response = Opções01();
        String tipo = (String) response[0];
        float money = (float) response[1];
        float quantidade_em_dolar = (float) EmDolar(tipo, money);
        Object[] response2 = Opções02();
        String nova_moeda = (String) response2[0];
        //String nova_moeda = "euro";
        float quantidade_na_nova_moeda = (float) DoDolar(nova_moeda, quantidade_em_dolar);
        printzin(tipo, nova_moeda, money, quantidade_na_nova_moeda);
    }
}