package Archive;

public class CastingPlay {

    public static void main(String[] args){
        casting_01();
        casting_02();
        casting_03();
    }


    static void casting_01(){
        int x = 65;
        double y = 6.988;
        float response = (float) (x / y);
        System.out.println(response);
    }

    static void casting_02(){
        short x = 76;
        long y = 888888;
        int response = (int) (y-x);
        System.out.println(response);
    }

    static void casting_03(){
        int x = 88989898;
        double y = 88.99299283;
        short response = (short) (x-y);
        System.out.println(response);
    }
}
