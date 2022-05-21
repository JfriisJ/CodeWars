import java.util.Arrays;

public class KataSortArray {
    public static int[] sortArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                for(int j = 0; j < array.length; j++) {
                  if (array[j] % 2 != 0){
                      if (array[i] > array[j] && i < j){
                          int a = array[i];
                          int b = array[j];
                          array[j] = a;
                          array[i] = b;
                      }
                  }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{7, 1})));
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));



    }
}