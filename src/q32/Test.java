package q32;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var path = Paths.get("F:\\A\\.\\B\\C\\D\\..\\Book.java");
        path.normalize();
        // Implementations of Path interface are immutable,
        // hence path.normalize() method doesn't make any changes to the Path object referred by reference variable 'path'.
        System.out.println(path);
        System.out.println(path.normalize());
    }
}
