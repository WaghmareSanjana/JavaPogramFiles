/*How do you convert a Roman numeral String to Integer in Java?

Write a function in java to convert a given Roman numeral to equivalent String. For example, if the given String is "X" then your program should print 10. Input will be within the range from 1 to 2000. You can also ignore case, like both "x" and "X" should return 10*/

import java.util.HashMap;

public class String15{

    public static int romanToInt(String s) {

        if (s == null || s.length() == 0)
            return -1;

        System.out.println("Roman Number: " + s);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
System.out.println("Integer: " + result);
        return result;
    }

    public static void main(String[] args) {
        romanToInt("X");
    }
}
