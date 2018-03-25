package constants;

import java.util.HashMap;
import java.util.Map;

public class ConstantsClass {

    private final static Map dictionary = new HashMap<String, Number>();

    public static void add(String name, Number value) {
        Constant check = new ConstantClass(name, value);
        dictionary.put(check.getName(), check.getValue());
    }

    public static Number get(String name){
        if (dictionary.containsKey(name)) {
            return (Number) dictionary.get(name);
        } else {
            return Double.NaN;
        }
    }

}
