import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
         //split String after each sentence
        String[] txt = str.split(" ");
        String word;
        String[] result = new String[str.length()];
        //iterate through the array of strings and split them into chars.
        for(int i = 0; i <txt.length ; i++) {
            //save the txt into a char array
            char[] ch = txt[i].toCharArray();
            //save first char in a temp char.
            char temp = ch[0];
            //make the chars jump one index lower.
            for (int j = 0; j < ch.length; j++) {
                if (j < ch.length - 1) {
                    ch[j] = ch[j + 1];
                }
                //set the temp char as the last char in the char array
            }
            ch[ch.length - 1] = temp;
            word = String.valueOf(ch);
            if (!Pattern.matches("[.!?-]",word)) {
                word = word + "ay";
            }
            if (i < txt.length-1) {
                word = word + " ";
            }
            result[i] = word;
            sb.append(result[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }
}