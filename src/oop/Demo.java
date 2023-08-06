package oop;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {
        Parent child = new Chile();
        child.launchRocket();
        child.sum();
        String name = "SUbhashish";
        Predicate<String> lesserthan = str -> str.length() > 5;
        Function<Integer,Integer> square = i -> i * i;
        System.out.println(lesserthan.test(name));
        System.out.println(square.apply(2));
    }
}
