package q24;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>(); //Line n1
        original.add(10); //Line n2
        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        // cloned contains memory address of the same Integer object.
        // original != cloned, but original.get(0) == cloned.get(0).
        Integer i1 = cloned.get(0); //returns the Integer object
        ++i1;
        // As Integer object is immutable, hence ++i1;
        // creates a new Integer object with value 11 and suppose this newly created Integer object is stored at memory
        System.out.println(cloned);
        // Cloned list stays intact and still refers to Integer object at memory old location
    }
}
