package lesson6.homework6;

import java.util.Arrays;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Barsik");
        Cat.numb = Cat.numb + 1;
        Cat cat2 = new Cat("Murzik");
        Cat.numb = Cat.numb + 1;
        Dog dog1 = new Dog("Bobik");
        Dog.numb = Dog.numb + 1;
        Dog dog2 = new Dog("Dryzhok");
        Dog.numb = Dog.numb + 1;


        System.out.println("Cats number is " + Cat.numb);
        System.out.println("Dogs number is " + Dog.numb);


        cat1.run(200);
        cat2.run(170);
        cat1.swim(10);
        cat2.swim(5);
        dog1.run(300);
        dog2.run(350);
        dog1.swim(5);
        dog2.swim(10);


    }
}
