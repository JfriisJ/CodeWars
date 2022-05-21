import java.util.HashMap;

public class DuplicateEncoder {
    static String encode(String word){
        char[] chars = word.toLowerCase().toCharArray();
        String result = "";
        HashMap<Character, Boolean> allChars = new HashMap<Character, Boolean>();
        for(int i = 0; i < chars.length; i++) {
            if (allChars.containsKey(chars[i])){
                allChars.put(chars[i], true);
            }else {
                allChars.put(chars[i], false);
            }
        }
        for(int i = 0; i < chars.length; i++) {
            if (allChars.get(chars[i]) == true){
                result = result + ")";
            } else {
                result = result + "(";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DuplicateEncoder encode = new DuplicateEncoder();
        String din = "din";
        System.out.println(encode(din));

        String renegade = "renegade";
        System.out.println(encode(renegade));
        String Prespecialized = "Prespecialized";
        System.out.println(encode(Prespecialized));
    }
}
