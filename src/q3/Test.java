package q3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var list1 = List.of(); //create an unmodifiable list containing specified elements.
        var list2 = List.of("A");
//        list1 = list2;
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
