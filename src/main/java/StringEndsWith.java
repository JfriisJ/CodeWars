
public class StringEndsWith {
    public static boolean solution(String str, String ending) {

        //reverse the strings so that they are read backwards
        //split the strings into single chars
        StringBuilder sb;
        sb = new StringBuilder().append(str).reverse();
        char[] first = sb.toString().toCharArray();
        sb = new StringBuilder().append(ending).reverse();
        char[] second = sb.toString().toCharArray();

        //make sure the for loop only is as long as the shortest string
        int index;
        if (first.length > second.length){
            index = second.length;
        }else {
            index = first.length;
        }
        //match the strings
        boolean match = false;
        for(int i = 0; i < index; i++) {
            if (first[i] == second[i]){
                match = true;
            }else {
                return false;
            }

        }
        return match;

    }


    public static void main(String[] args) {
        solution("samurai", "ai");
        solution("sumo", "omo");
        solution("ninja", "ja");
        solution("sensei", "i");
        solution("samurai", "ra");
        solution("abc", "abcd");
        solution("abc", "abc");
        solution("abcabc", "bc");
        solution("ails", "fails");
        solution("fails", "ails");
        solution("this", "fails");
        solution("this", "");
        solution(":-)", ":-(");
        solution("!@#$%^&*() :-)", ":-)");
        solution("abc\n", "abc");
    }
}