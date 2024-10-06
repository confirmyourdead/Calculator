package Operators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperatorCounter {
    private static List<Integer> resultCount = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void sum() {
        System.out.println("Введите сколько чисел хотите сложить");
        int nextInt = input.nextInt();
        for (int i = 0; i < nextInt; i++) {
            Scanner in = new Scanner(System.in);
            int confitonOfNumbers = in.nextInt();
            resultCount.add(confitonOfNumbers);
        }
        int sum = 0;
        for (int i = 0; i < resultCount.size(); i++) {
            sum += resultCount.get(i);
        }
        System.out.println(sum);
        resultCount.clear();
    }
    public static void dif() {
        System.out.println("Введите число от которого хотите отнять");
        int difVar = input.nextInt();
        System.out.println("Введите сколько чисел хотите отнять от числа");
        int nextInt = input.nextInt();
        for (int i = 0; i < nextInt; i++) {
            Scanner in = new Scanner(System.in);
            int confitonOfNumbers = in.nextInt();
            resultCount.add(confitonOfNumbers);
        }
        int dif = difVar;
        for (int i = 0; i < resultCount.size(); i++) {
            dif -= resultCount.get(i);
        }
        System.out.println(dif);
        resultCount.clear();
    }
    public static void multi() {

        System.out.println("Введите сколько чисел хотите умножать");
        int nextInt = input.nextInt();
        for (int i = 0; i < nextInt; i++) {
            Scanner in = new Scanner(System.in);
            int confitonOfNumbers = in.nextInt();
            resultCount.add(confitonOfNumbers);
        }
        int multi = 1;
        for (int i = 0; i < resultCount.size(); i++) {
            multi *= resultCount.get(i);
        }
        System.out.println(multi);
        resultCount.clear();
    }
    public static void div() {
        System.out.println("Введите число на которое хотите делить");
        int div = input.nextInt();
        System.out.println("Введите сколько чисел хотите делить");
        int nextInt = input.nextInt();
        for (int i = 0; i < nextInt; i++) {
            Scanner in = new Scanner(System.in);
            int confitonOfNumbers = in.nextInt();
            resultCount.add(confitonOfNumbers);
        }
        for (int i = 0; i < resultCount.size(); i++) {
            div /= resultCount.get(i);
        }
        System.out.println(div);
        resultCount.clear();
    }

}
