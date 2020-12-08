

import java.util.Scanner;

public class Calc22 {
    private static double a;
    private static double b;
    private static double c;
    private static char l;
    private static int o;
    Scanner in = new Scanner(System.in);

    public void plus(double a, double b) {
        c = a + b;
        System.out.println(c);
    }

    public void minus(double a, double b) {
        c = a - b;
        System.out.println(c);
    }

    public void multiply(double a, double b) {
        c = a * b;
        System.out.println(c);

    }

    public void div(double a, double b) {
        c = a / b;
        System.out.println(c);

    }

    public void createConsole() {
        System.out.println("Введите первый операнд");
        double e = in.nextDouble();
        System.out.println("Введите второй операнд");
        double k = in.nextDouble();
        System.out.println("Выберите одну из операций(+-*/)");
        l = in.next().charAt(0);
        changeOperation(l, e, k);
        System.out.println("Если хотите продолжить манипуляции над значением, выберите цифру 1. Хотите начать заново? Нажмите цифру 2. Выйти?-3.");
        int o = in.nextInt();
        while (o==1) {
            continueCalc();
        }
        if (o==2){
            createConsole();
        }
        else return;






    }
        public void continueCalc() {


                    System.out.println("Введите второй операнд");
                    double v = in.nextDouble();
                    System.out.println("Выберите операцию(+-*/)");
                    char l = in.next().charAt(0);
                    changeOperation(l,c,v);
            System.out.println("Если хотите продолжить манипуляции над значением, выберите цифру 1. Хотите начать заново? Нажмите цифру 2. Выйти?-3.");
             o = in.nextInt();
                    }




    public void changeOperation(char l,double a, double b) {
        switch (l) {
            case '+':
                plus(a, b);
                break;
            case '-':
                minus(a, b);
                break;
            case '*':
                multiply(a, b);
                break;
            case '/':
                div(a, b);
                break;
            default:
                System.out.println("Really?");
                return ;
        }



    }
    public static void main(String[] args){
        Calc22 c = new Calc22();
        c.createConsole();

    }

}







