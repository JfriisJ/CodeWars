

public class SolutionWhoLikesIt {
public static String whoLikesIt(String... names) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < names.length; i++) {
        if (!names[i].equals("") && names.length == 1) {
            sb.append(names[i]).append(" likes this");
        }else if (names.length == 2){// two person like this
            sb.append(names[i]);
            if (i < names.length -1){
                sb.append(" and ");
            }
            if (i == names.length -1){
                sb.append(" like this");
            }
        } else if (names.length == 3){
            sb.append(names[i]);
            if (i < names.length - 2){
                sb.append(", ");
            }
            if (i == names.length -2){
                sb.append(" and ");
            }
            if (i == names.length -1){
                sb.append(" like this");
            }
        } else if (names.length > 3){//if there is more than 3 persons
            if (i < 2){
                sb.append(names[i]);
            }
            if (i == 0){
                sb.append(", ");
            }
            if (i == names.length -1){
                sb.append(" and ").append(names.length - 2).append(" others like this");
            }
        }
    }if (sb.isEmpty()){
        sb.append("no one likes this");
    }
    return sb.toString();
}
public static String whoLikesItAlternate(String... names) {
    switch (names.length) {
        case 0: return "no one likes this";
        case 1: return String.format("%s likes this", names[0]);
        case 2: return String.format("%s and %s like this", names[0], names[1]);
        case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
    }
}

public static void main(String[] args) {
    System.out.println(whoLikesIt());
    System.out.println(whoLikesIt("Peter"));
    System.out.println(whoLikesIt("Jacob", "Alex"));
    System.out.println(whoLikesIt("Max", "John", "Mark"));
    System.out.println(whoLikesIt("Alex","Jacob","Mark","Max","Alex","Jacob","Mark","Max"));
}
}
