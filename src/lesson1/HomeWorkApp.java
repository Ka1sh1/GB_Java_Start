package Lesson1;

public class HomeWorkApp {

    public static void main(String[] args){
        printThreeWords();
        checkSumSign(-7,1);
        printColor(100);
        compareNumbers(9,9);
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(int a, int b){
        int x = a;
        int y = b;
        if(a + b < 1){
            System.out.println("Number is Negative");
        }
        else if(a + b > 1){
            System.out.println("Number is Positive"); // у меня проблемы с кодировкой, кирилица отпечатывается вопросами
        }
    }
    public static void printColor(int a){
        int value = a;

        if(value <= 0){
            System.out.println("Code Red");

        }
        else if(value <= 1){
            System.out.println("Code Yellow");
        }
        else if(value <= 101){
            System.out.println("Code Green");
        }


    }

    public static void compareNumbers(int a, int b){
        int x = a;
        int y = b;

        if (a >= b) {
            System.out.println("a>=b");
        }
        else if (a < b){
            System.out.println("a<b");

        }

    }
}
