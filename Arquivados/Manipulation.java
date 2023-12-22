package Arquivados;

import java.util.Scanner;

public class Manipulation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        count(str);
        contains_bah(str);
        position(str);
        last_position(str);
        Upper(str);
        Lower(str);
        from_05(str);
        equals_bah(str);
        scanner.close();
    }

    static void count(String str){
        System.out.println(str.length());
    }

    static void contains_bah(String str){
        System.out.println(str.contains("bah"));
    }

    static void position(String str){
        System.out.println(str.indexOf("bah"));
    }

    static void last_position(String str){
        System.out.println(str.lastIndexOf("bah"));
    }

    static void Upper(String str){
        System.out.println(str.toUpperCase());
    }

    static void Lower(String str){
        System.out.println(str.toLowerCase());
    }

    static void from_05(String str){
        System.out.println(str.substring(4));
    }

    static void equals_bah(String str){
        System.out.println(str.equals("bah"));
    }
    
}
