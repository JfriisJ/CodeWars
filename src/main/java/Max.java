import java.util.Arrays;
public class Max {

    public  static int alternativ(int[] arr){
        //alternativ
        final int[] max = {0};
        return Arrays.stream(arr).map(i -> i = max[0] = i + max[0] > 0 ? max[0] + i : 0).max().orElse(0);
    }
    public static int sequence(int[] arr) {
        int size = arr.length;
        int higestPositiv = Integer.MIN_VALUE, keeper = 0;
        if (size == 0){
            return 0;
        }

        for (int i = 0; i < size; i++)
        {
            keeper = keeper + arr[i];
            if (higestPositiv < keeper)
                higestPositiv = keeper;
            if (keeper < 0)
                keeper = 0;
        }
        return Math.max(higestPositiv, 0);
    }

    public static void main(String[] args) {
        System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(Max.alternativ(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(Max.sequence(new int[]{}));
        System.out.println(Max.sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));

    }
}