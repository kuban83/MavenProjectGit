package androsova_ann.homework.lesson2;

import java.util.Scanner;

/**
 * Created by Анна on 11.02.2016.
 */
public class Triangle1 {

    public static void main(String[] args) {
        int i, j, h;
        System.out.println("Укажите высоту треугольника");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();

        for (i = 0; i < h * 2; i++)
        {
            if (i<h)
            {
                for (j = 0; j < i; j++)
                    System.out.print("*");
            }
            else
            {
                for (j = (2*h-i); j >0; j--)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}






