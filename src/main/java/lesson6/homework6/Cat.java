package lesson6.homework6;

public class Cat extends Animal {
   public static int numb;

    public Cat(String name) {
        super(name);
        //numb++;
    }


    public int run(int distance) {
        if (distance > 200) {
            System.out.printf("Cat max distance 200 meters\n", name);
        } else System.out.printf("Cat %s run %s meters\n", name, distance);
        return distance;


    }

    public int swim(int distance) {
        if (distance > 0) {
            System.out.printf("Cat %s no swim\n", name);
        }
        return distance;
    }

//    public static int counter() {
//        return numb;
//    }
}


