package Arquivados;
public class Calculate {
    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if(args[0].equals("somar")){
            sum(x,y);
        } else if(args[0].equals("subtrair")){
            sub(x,y);
        } else if(args[0].equals("multiplicar")){
            multi(x,y);
        } else if(args[0].equals("dividir")){
            div(x,y);
        } else {
            System.out.println("Nenhuma instrução definida!");
        }
    }
    static void sum(int v1, int v2){
        var result = v1+v2;
        System.out.println(result);
    };

    static void sub(int v1, int v2){
        var result = v1-v2;
        System.out.println(result);
    };

    static void multi(int v1, int v2){
        var result = v1*v2;
        System.out.println(result);
    };

    static void div(int v1, int v2){
        var result = v1/v2;
        System.out.println(result);
    }
}