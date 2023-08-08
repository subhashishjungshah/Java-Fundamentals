package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
          String str = "Subhashish";
//          Old ways of dealing with this string
        if(str!=null){
            System.out.println(str);
        }
        else{
            System.out.println("No value");
        }

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("No value "));
    }

}
