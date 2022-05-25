package lesson2;

public class HomeWork2 {

    public static void main(String[] args){
        checkBorderValue(9,12);
        posNumberCheck(-1);
        boCheckNum(1);
        cycleString(9);

    }
    public static void checkBorderValue(int a, int b){
        int x = a;
        int y = b;
        if ((a+b) >= 10 && (a+b) <= 20){
            System.out.println("True");
        }
        else{System.out.println("False");}
    }
    public static void posNumberCheck(int a){
        int x = a;
        if (a >= 0){
            System.out.println("Number is Positive!");
        }
        else{System.out.println("Number is Negative!");}
    }
    public static void boCheckNum(int a){
        if( a< 0){
            System.out.println("True");
        } else{System.out.println("False");}
    }
    public static void cycleString(int a){
        int x = a;
        for (a = 0; a < 10; a++){
            System.out.println("Boom!");
        }
    }



}
