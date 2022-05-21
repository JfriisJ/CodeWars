import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryString = "";
        for(int i = 0; i < binary.size(); i++) {
            binaryString += binary.get(i);
        }
        return Integer.parseInt(binaryString,2);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(ConvertBinaryArrayToInt(list));
    }
}