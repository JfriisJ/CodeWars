import java.util.ArrayList;
import java.util.List;


public class dontGiveMeFiveCase {
    public static int dontGiveMeFive (int start, int end) {

        int index = 0;
        for(int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                index = index + 1;
            }
        }
            return index;
    }


    public static void main(String[] args) {

        System.out.println(dontGiveMeFive(1,9));
        System.out.println(dontGiveMeFive(-50,55));
    }
}
