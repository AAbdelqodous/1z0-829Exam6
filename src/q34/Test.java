package q34;

public class Test {
    public static void main(String[] args) {
        var sb = new StringBuilder();
//        sb.append(null);
        // compiler gets confused as to which method `append(null)` can be tagged
        String s = null;
        StringBuffer buffer = new StringBuffer();
        char[] arr = {};
        sb.append(s);
        sb.append(buffer);
        sb.append(arr);
        System.out.println(sb);
    }
}
