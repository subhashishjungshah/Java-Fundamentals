package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Create a List and Print all the even numbers
        List<Integer> evenNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(evenNumbers);

//        evennumbers.foreach(e-> system.out.println(e));
        Stream<Integer> newList = evenNumbers.stream();
        Collection<Integer> collect = newList.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        Stream<Object> emptyStream = Stream.empty();
        String names[] = {"Subhashish","Subhash","Dipes"};
        Stream<String> s1 = Stream.of(names);

        Stream<Object> s3 = Stream.builder().build();

    }
}
