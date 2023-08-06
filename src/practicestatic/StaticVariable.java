package practicestatic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StaticVariable {
    public static String name = "Subhashish";
    public static final Map<String, String> myMap;
    static {
        Map<String, String> aMap = new HashMap<>();
        aMap.put("Key1", "Value1");
        aMap.put("Key2", "Value2");
        // Potentially more complex logic here
        myMap = Collections.unmodifiableMap(aMap);
    }

    public static String getName(){
        return name;
    }
    static {
        String lastName = "shah";
        Integer age = 23;
    }

}
