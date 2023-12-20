package q35;

import java.time.Month;

public class Test {
    public static void main(String[] args) {
        var month = Month.APRIL;
        var quarter = switch (month){
            case JANUARY, FEBRUARY, MARCH -> "1";
            case APRIL, MAY, JUNE -> "2";
            case JULY, AUGUST, SEPTEMBER -> "3";
            case OCTOBER, NOVEMBER, DECEMBER -> "4";
            //  All the cases must be exhaustive or
            // default  -> throw new IllegalArgumentException("NOT VALID");
        };
        System.out.println(quarter);
    }
}
