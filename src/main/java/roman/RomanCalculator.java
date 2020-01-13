package roman;

import java.util.HashMap;
import java.util.Map;

public class RomanCalculator {

    private static final Map<String, Integer> romanMap = new HashMap<String, Integer>() {
        {
            put("M", 1000);
            put("D", 500);
            put("C", 100);
            put("L", 50);
            put("X", 10);
            put("V", 5);
            put("I", 1);
        }
    };

    public String add(String input1, String input2) {
        if (romanMap.get(input1) >= romanMap.get(input2))
            return input1 + input2;
        return input2 + input1;
    }
}
