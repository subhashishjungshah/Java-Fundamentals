package oop;

public class Animals {

    public Animals(){
        System.out.println("Hello from Animals");
    }
    public int legs = 2;
    private String color = "Red";

    public void move(){
        System.out.println("I am moving with " + legs +" legs");
    }
}
