package Utils;


import Operators.OperatorCounter;

import java.util.Scanner;

public class Menu {

    static OperatorCounter counter ;

    public boolean mainMenu(){
        System.out.println(" Приветствую в моем калькуляторе\n Если хочешь что-то почитать напиши true");
        Scanner scanner = new Scanner(System.in);
        boolean aBoolean = scanner.nextBoolean();
        Boolean res = aBoolean ? true : false;
        return res;
    }
    public boolean printMenu(){
        System.out.println(" 1. Сложение\n 2. Вычитание \n 3. Умножение \n 4. Деление");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        switch (response) {
            case 1:
                counter.sum();
                return true;
            case 2:
                counter.dif();
                return true;
            case 3:
                counter.multi();
                return true;
            case 4:
                counter.div();
                return true;
            default:
                System.out.println("Вы ввели не то что надо");
                printMenu();
                return false;
        }
    }
}
