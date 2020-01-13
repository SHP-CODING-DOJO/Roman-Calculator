package roman;

import java.util.*;

import static javax.swing.UIManager.put;

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

    private static final Map<Integer, String> intMap = new LinkedHashMap<Integer, String>() {
        {
            put(1000, "M");
            put(500, "D");
            put(100, "C");
            put(50, "L");
            put(10, "X");
            put(5, "V");
            put(1, "I");
        }
    };

    public String add(String input1, String input2) {
        int number1 = convertRomanToNumber(input1);
        int number2 = convertRomanToNumber(input2);
        return convertNumberToRoman(number1 + number2);
    }

    private String convertNumberToRoman(int number) {
        StringBuilder result = new StringBuilder();
        Set<Integer> intMapKey = intMap.keySet();
        for (Integer i : intMapKey) {
            int num = number / i;
            while (num-- != 0) {
                result.append(intMap.get(i));
                number -= i;
            }
        }
        return result.toString();
    }

    private int convertRomanToNumber(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); ++i) {
            result += romanMap.get(String.valueOf(roman.charAt(i)));
        }
        return result;
    }
}
