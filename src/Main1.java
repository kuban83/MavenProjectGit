package androsova_ann.homework.lesson2;

import androsova_ann.homework.lesson2.Cat;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Анна on 04.02.2016.
 */
public class Main1 {

    public static void main(String[] args) {

        System.out.println("Введите вес 1-го противника: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Random rn = new Random();
        boolean z = rn.nextBoolean();

        Cat warrior1 = new Cat("Warrior1", "smoky", 6, x, z);

        System.out.println("Введите вес 2-го противника: ");
        int y = sc.nextInt();
        boolean w = rn.nextBoolean();

        Cat warrior2 = new Cat("Warrior2", "smoky", 6, y, w);

        System.out.print("1-й противник весит " + warrior1.getWeight() + "кг и это");
        if (!warrior1.isSex())
            System.out.println(" девочка.");
        else
            System.out.println(" мальчик. ");


        System.out.print("2-й противник весит " + warrior2.getWeight()+ "кг и это" );
        if (!warrior2.isSex())
            System.out.println(" девочка.");
        else
            System.out.println(" мальчик. ");


           System.out.println("Winner: " + warrior1.fight(warrior2).getName());

    }
}
