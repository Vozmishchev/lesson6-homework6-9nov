package lesson6.homework6;

public class Dog extends Animal {
    public static int numb;

    public Dog(String name) {
        super(name);
       // numb++;
    }


    public int run(int distance) {
        if (distance > 500) {
            System.out.printf("Dog max distance 200 meters\n", name);
        } else System.out.printf("Dog %s run %s meters\n", name, distance);
        return distance;


    }

    public int swim(int distance) {
        if (distance > 10) {
            System.out.printf("Dog %s no swim\n", name);
        } else System.out.printf("Dog %s swim %s meters\n", name, distance);
        return distance;
    }

    public static int counter() {
        return numb;
    }
}


