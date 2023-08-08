package methodReference;

import lambda.InterImp;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Learning method references ***");

//        Static method reference
         WorkInter i = Stuff::doStuff;
         i.doTask();
//        Non-static method reference

        Stuff st1 = new Stuff();
        WorkInter i1 = st1::printName;
        i1.doTask();

        System.out.println("*** earning constructor reference ***");

    }
}
