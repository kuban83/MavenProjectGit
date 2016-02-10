import java.util.Random;
import java.util.Scanner;

/**
 * Created by Анна on 04.02.2016.
 */
public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", "black", 3, 5, true);
        Cat murka = new Cat ("Murka", "white", 2, 4, false);
        Cat tom = new Cat ("Tom", "red", 4, 5, true);

        System.out.println("Барсик весит " + barsik.getWeight()+ "кг");

        System.out.println ("Введите вес противника: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Random rn = new Random ();
        boolean z = rn.nextBoolean();

        Cat warrior = new Cat("Warrior", "smoky",6, x , z);

       // Cat myLittleCat = barsik.makeLove(murka);
      //  System.out.println(myLittleCat.isSex());
      //  myLittleCat.getName();

        System.out.print("Противник Барсика весит " + warrior.getWeight()+ "кг и это" );
        if (!warrior.isSex())
            System.out.println(" девочка. Драки не будет ");
        else
            System.out.println(" мальчик. Драка неминуема ");

        barsik.voice();

        System.out.println("Winner: " + barsik.fight(warrior).getName());

    }
}
