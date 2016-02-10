package androsova_ann.homework;

import java.util.Scanner;

/**
 * Created by Анна on 04.02.2016.
 */
public class Lesson1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите целое пятизначное число больше 0 и нажмите Enter: ");
        int a = sc.nextInt(); //защита от некорректного ввода пока не предусмотрена
        int b = a / 10000;
        int c = a / 1000% 10;
        int d = a / 100 % 10;
        int e = a / 10  % 10;
        int f = a       % 10;

        System.out.println("First symbol is " + b + ";");
        System.out.println("Second symbol is " + c + ";");
        System.out.println("Third symbol is " + d + ";");
        System.out.println("Fourth symbol is " + e + ";");
        System.out.println("Last symbol is " + f + ".");
        System.out.println("\nThe goal is achieved!!!");

    }
}
