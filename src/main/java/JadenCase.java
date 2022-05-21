public class JadenCase {

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null){
            return phrase;
        }
        StringBuilder result = new StringBuilder();
        String[] notJaden = phrase.split(" ");

        for(int i = 0; i < notJaden.length; i++) {
            notJaden[i] = notJaden[i].toLowerCase();
            notJaden[i] = notJaden[i].substring(0,1).toUpperCase() + notJaden[i].substring(1);
            result.append(notJaden[i]);
            if (i < notJaden.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

}