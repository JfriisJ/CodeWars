import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.IntStream;

/*
Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:
 */
public class Conversion {

    public static String solution(int n) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        
        StringBuilder roman = new StringBuilder();

        //run through the values
        for (int i = 0; i < values.length; i++) {
            //while n is greater or equal to value index
            while (n >= values[i]) {
                //take n and subtract the value of index from n
                n -= values[i];
                //append the roamn literal matching the index of values
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();

    }

    public static void main(String[] args) {

        System.out.println(solution(1000));
        System.out.println(solution(475));

    }
}

/*
Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000
Remember that there can't be more than 3 identical symbols in a row.
 */