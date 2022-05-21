import java.util.ArrayList;
import java.util.stream.IntStream;


/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
 */
public class MultiplesOf3Or5 {
    public static int solution(int number) {

        //alternative
        IntStream.range(0, number).filter(n -> (n % 3 == 0) || (n % 5 == 0)).sum();

        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> five = new ArrayList<Integer>();

        //if number is negativ return 0
        if (number < 0 ){
            return 0;
        }

        //for each number where modulus 3 or 5 give 0 save them to the arrayList
        for(int i = 0; i < number; i++) {
          if((i) %3 == 0){
            three.add(i);

          }else if((i) % 5 == 0){
              five.add(i);
          }
        }

        //use stream to collect the sum of the Arraylist
        Integer sum3 = three.stream().mapToInt(Integer::intValue).sum();
        Integer sum5 = five.stream().mapToInt(Integer::intValue).sum();

        return (sum3 + sum5);
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(78));
        System.out.println(solution(15));
        System.out.println(solution(1155));
        System.out.println(solution(-10));

    }
}
