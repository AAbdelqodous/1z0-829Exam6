package q27;

public abstract class Profit implements Profitable1, Profitable2{
    // default keyword for method is allowed only inside the interface and default methods are implicitly public.
    // So overriding method should use public modifier and shouldn't use default keyword.
    // If you want to invoke the default method implementation from the overriding method,
    // then the correct syntax is: [Interface_name].super.[default_method_name].
    @Override
    public double profit() {
        return Profitable1.super.profit();
    }
}
