package oops;

public class multiinherit {
    public static void main(String[] args) {
      Dog sweety = new Dog();
      sweety.eat();
      sweety.breath();
      sweety.legs=4;
      System.out.println(sweety.legs);
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
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
String breed;
}

/*  derived class/subclass 
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}*/
