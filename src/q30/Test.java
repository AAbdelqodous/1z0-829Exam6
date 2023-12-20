package q30;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        var list = List.of(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };
        // a new instance of Predicate is used, hence every time ctr will be initialized to 1.
        // For -80, Output is '1.' but predicate returns false, hence findFirst() doesn't terminate the operation.
        // For 100, '1.' is appended to previous output, so on console you will see '1.1.' and predicate returns true,
        // hence findFirst() finds an element and terminates the operation.
        list.stream()
                .filter(predicate)
                .findFirst();
    }
}
