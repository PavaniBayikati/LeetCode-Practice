import java.util.*;

interface Animal {
    void eat();
}

interface pet {
    void play();
}

class Dog implements Animal, pet {

    public void play() {
        System.out.println("Dog eats food");
    }

    public void eat() {
        System.out.println("Dog eats food so much");

    }

}

public class Main {
    public static void main(String[] args) {
        Dog Puppy = new Dog();
        Puppy.eat();
        Puppy.play();
    }
}