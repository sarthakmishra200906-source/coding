package oops;

public class hierarchialinheretance {
    public static void main(String[] args) {
        Mammal dog = new Mammal();
        dog.eat();
        dog.breath();
        dog.walk();
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
    void walk(){
        System.out.println("walk");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

/*  derived class/subclass 
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}*/