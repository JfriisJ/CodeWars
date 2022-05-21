import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class DirReduction {

    public static String[] alternativ(String[] arr){
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
    public static String[] dirReduc(String[] arr) {

        LinkedList<String> ll = new LinkedList<>(List.of(arr));
        int index = ll.size();

        for(int i = 0; i < index; i++) {
            System.out.println("Before: i is " + i + " and list contains: " + ll);
            if (i < index - 1) {
                System.out.println("outside i: " + "i is " + i + " and comp is: " + ll.get(i).compareTo(ll.get(i + 1)));
                if (ll.get(i).length() - ll.get(i + 1).length() == 0 && ll.get(i).compareTo(ll.get(i + 1)) != 0) {
                    System.out.println("inside i: " + "i is " + i + " and comp is: " + ll.get(i).compareTo(ll.get(i + 1)));
                    System.out.println("removed: " + ll.get(i));
                    ll.remove(i);
                    System.out.println("removed: " + ll.get(i));
                    ll.remove(i);
                    index = ll.size();
                    i = -1;
                    System.out.println("after i: " +  i + " list contains: " + ll);
                }
            }
        }
            // Your code here.
        return ll.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));// East
        //System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH"})));
        //System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})));
        //System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"})));
    }
}


/*
Once upon a time, on a way through the old wild mountainous west,…
… a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST".
 Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.

Going to one direction and coming back the opposite direction right away is a needless effort.
 Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!

How I crossed a mountainous desert the smart way.
The directions given to the man are, for example, the following (depending on the language):
You can immediatly see that going "NORTH" and immediately "SOUTH" is not reasonable, better stay to the same place!
 So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:

Task
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).

The Haskell version takes a list of directions with data Direction = North | East | West | South.
The Clojure version returns nil when the path is reduced to nothing.
The Rust version takes a slice of enum Direction {North, East, West, South}.
 */