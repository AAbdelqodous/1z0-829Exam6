package q12;

import q12.Threat;

public class AvoidThreats {

    public static void main(String[] args) {
        Threat obj = new Threat();
        obj.print();
        evaluate(obj);
        obj.print();
    }

    private static void evaluate(Threat t) {
        t = new Threat();
        t.name = "PHISHING";
    }
}
