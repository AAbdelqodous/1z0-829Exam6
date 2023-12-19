package q19;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        var stream = Stream.of("r", "t", "a");
//        var list = stream.map(s -> s.toUpperCase()).toList();
        // returns an unmodifiable list containing the stream elements.
        var list = stream.map(s -> s.toUpperCase())
                        .collect(Collectors.toList());
        list.sort(String::compareTo);
        System.out.println(list);
    }
}
