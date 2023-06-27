package com.company;

public class Main {

    public static void main(String[] args) {
        Frog d=new Frog(true,true,0);
        d.sayHello(0);
        System.out.println(2);



    }
}


abstract class Animal {
    private boolean mammals;
    private boolean carnivorous;
    private int MOOD_HAPPY;
    private int MOOD_SCARE;
    private int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = mood;
    }
    public void sayHello(){};
    public abstract void sayHello(int mood);
    public boolean isMammals(){
        return this.mammals;
    }
    public void setMammals(boolean mammals){
        this.mammals=mammals;
    }
    public boolean isCarnivorous(){
        return this.carnivorous;
    }
    public void setCarnivorous(boolean carnivorous){
        this.carnivorous=carnivorous;
    }
}

class Dog extends Animal implements Land{
     private int numberOfLegs;

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(true, true, mood);
        this.numberOfLegs=4;
    }

    public void sayHello() {
        System.out.println("wagging the tail");
    }

    public void sayHello(int mood) {
        if(mood==0)
            System.out.println("Bark loudly");
        else
            System.out.println("whooping");
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

}
class Cat extends Animal implements Land{
    private int numberOfLegs;

    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(true,true, mood);
        this.numberOfLegs=4;
    }

    public void sayHello() {
        System.out.println("meow");
    }

    public void sayHello(int mood) {
        if(mood==0)//0 feel com
            System.out.println("purr purr");
        else
            System.out.println("hiss");
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }
}
class Frog extends Animal implements Water ,Land{
    private int numberOfLegs;

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(false, false, mood);
        this.numberOfLegs=2;
    }

    public void sayHello(int mood) {
        if(mood==0)
            System.out.println("quack quack");
        else
            System.out.println("plop into the water");
    }
    public boolean hasGills(){
        return true;
    }
    public boolean hasLaysEggs(){
        return true;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
interface Water{
    public boolean hasGills();
    public boolean hasLaysEggs();

}
interface Land {
    public int getNumberOfLegs();

}