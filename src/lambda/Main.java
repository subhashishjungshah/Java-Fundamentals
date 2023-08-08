package lambda;
/*
        Lambda function is an anonymous function having no modifier, no return type
        Benefits of Lambda
        - Reduces the lines of code -> can only be used with functional interface
        - Sequential and Parallel execution
        - Functional programming was enabled due to lambda functions
        - Call API effectively
        - Readable, maintainable and concise code

*/

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Old approach ***");
        MyInter demo = new InterImp();
        demo.sum(1,2);

        System.out.println("Anonymous Class Implementation");

        MyInter i = new MyInter(){
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int sum = i.sum(2,3);
        System.out.println(sum);

        System.out.println("*** Using Lambda expression ***");
        MyInter i3 = (a,b) -> a + b;
        sum = i3.sum(4,5);
        System.out.println(sum);

        System.out.println("*** Length Interface ***");
        LengthInter l1 = a -> a.length();
        System.out.println(l1.calcLength("Subhashish Jung Shah"));
    }
}
