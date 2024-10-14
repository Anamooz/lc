package october;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> romanNumeralMap = new HashMap<>();
        romanNumeralMap.put('I', 1);
        romanNumeralMap.put('V', 5);
        romanNumeralMap.put('X', 10);
        romanNumeralMap.put('L', 50);
        romanNumeralMap.put('C', 100);
        romanNumeralMap.put('D', 500);
        romanNumeralMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romanNumeralMap.get(s.charAt(i)) < romanNumeralMap.get(s.charAt(i + 1))){ //since checking one index ahead, have to stop one before and in the ELSE statement add the last number
                result -= romanNumeralMap.get(s.charAt(i)); //subtract the lower number, will add the bigger number next index at the ELSE statement
            } else {
                result += romanNumeralMap.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "III";
        System.out.println(romanToInt(input));
    }
}
