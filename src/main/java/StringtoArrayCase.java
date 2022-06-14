public class StringtoArrayCase {

    public static String[] stringToArray(String s) {
        String[] result;
        result = s.split( " ");
        return result;
    }

    public static void main(String[] args) {
        StringtoArrayCase sta1 = new StringtoArrayCase();
        sta1.stringToArray("Robin Singh");

    }

}