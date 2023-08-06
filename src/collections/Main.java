package collections;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello subhashish from collection");
//        Creating Array list
        List<String> newArray = new ArrayList<String>();
        newArray.add("Subhashish");
        newArray.add("mindXcape");
        System.out.println(newArray.get(0));

//        Linked List with un-type shape
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.add("Anwesh");
        newLinkedList.add("Gurung");
        newLinkedList.add(23);

        System.out.println("****Set****");
        HashSet<Double> nums = new HashSet<>();
        nums.add(22.3);
        nums.add(55.2);
        System.out.println(nums);

        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(nums);
        System.out.println(treeSet);

        System.out.println("***Iterating through our collections***");
        System.out.println("Using For each Loop");
        for (String item:newArray) {
            System.out.println(item);
        }
        System.out.println("***Traversing using Iterator***");
        Iterator<String> iterator = newArray.iterator();
        while(iterator.hasNext()){
            String itr = iterator.next();
            System.out.println(itr);
        }

        System.out.println("***Backward Traversal of iterator***");
        ListIterator<String> stringListIterator = newArray.listIterator(newArray.size());
        while(stringListIterator.hasPrevious()){
            String itr = stringListIterator.previous();
            System.out.println(itr);
        }

        System.out.println("***For-each method***");
        newArray.forEach(e->{
            System.out.println(e);
        });

        System.out.println("*** Mapping ***");
        HashMap<String,Integer> names = new HashMap<>();
//        Adding elements
        names.put("Subhashish",123123);
        names.put("Ivey",12312);
        names.put("Anwesh",3424);
        names.put("Dipesh",4321);

        names.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });
        System.out.println(names.get("Subhashish"));


    }
}
