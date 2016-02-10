
import java.util.Random;

/**
 * Created by Анна on 09.02.2016.
 */
public class Cat {
    String name;
    String color;
    int age;
    int weight;

    boolean sex;

    public Cat(String name, String color, int age, int weight, boolean sex) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void voice(){
        System.out.println("Meoooow!!!!!");
    }

    public Cat makeLove (Cat anotherCat){
        Random rn = new Random ();
        if(this.isSex() != anotherCat.isSex())

        return new Cat("noname", "white", 0, 0, rn.nextBoolean());

        return null;
// реализовать метод файт, проверить что мальчики дрались с мальчиками, победил тот кот, у которого вес больше
         //String name, String color, int age, int weight, boolean sex
    }
    public Cat fight(Cat enemy){
      if(this.isSex() == enemy.isSex()){
        if (this.getWeight() < enemy.getWeight()){
            return enemy;
        }
        if (this.getWeight() > enemy.getWeight()){
            return this;
        }
        if (this.getWeight() == enemy.getWeight()){
            return new Cat("Equal warriors",null, 0, 0, false);
        }

        }
       return new Cat("❤❤❤ Make love not war ❤❤❤",null, 0, 0, false);
    }


}


