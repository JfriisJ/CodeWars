import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class validParenthesesCase {
    public static boolean validParentheses(String parens) {

        String[] split = parens.split("");

        int open = 0;
        int close = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")){
                open++;
            }
            if (split[i].equals(")")){
                close++;

            }if (close > open){
                return false;
            }
        }
        if ( open == close){

            return true;
        }
        return false;

    }

    public static boolean alternativeMethod(String parens){
        try {
            Pattern.compile(parens.replaceAll("[^()]", ""));
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }



    public static void main(String[] args) {
        validParenthesesCase vcase = new validParenthesesCase();

        vcase.validParentheses("()");
        vcase.validParentheses("())");
        vcase.validParentheses("32423(sgsdg)");
        vcase.validParentheses("(dsgdsg))2432");
        vcase.validParentheses("adasdasfa");
        vcase.validParentheses("Sy>E).)Bj((X3+8-s|/");
    }
}
