package androsova_ann.homework.lesson2;
import java.util.Scanner;

/**
 * Created by Анна on 09.02.2016.
 */
   class Triangle {
    public static void main(String[] args) {
        int i, j, h;
        System.out.println("Укажите высоту треугольника");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();

       for (i = 0; i < h; i++)
            {
                 for (j = 0; j <= i; j++)
                 System.out.print("*");
                 System.out.println();
            }
        for (i = h-1; i >0; i--)
        {
            for (j = 0; j <i; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}





