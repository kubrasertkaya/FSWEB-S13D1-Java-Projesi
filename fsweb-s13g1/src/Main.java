// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static  boolean shouldWakeUp(boolean isBarking,int clock){
        //Guarding
        if(clock<0 || clock > 23) return false;
        if(!isBarking) return  false;
        return clock <8 ||clock >=20 ;

    }

    public static void main(String[] args) {
        System.out.println("..............");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));
        System.out.println("..............");
    }
}