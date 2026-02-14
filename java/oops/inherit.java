package oops;

public class inherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// derived class/subclass 
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
