package oop;

public class Dog extends Animals{
    private int legs = 4;

    public Dog(){
        super();
        System.out.println("Inside child constructor");
    }
    public void speak(){
        System.out.println(super.legs);
        System.out.println(legs);
    }
//    Demonstration of Method Overiding
    public void move(){
        System.out.println("I have been overrided.");
    }

}
