package q20;

public class OTG extends PenDrive{
    String type;
    String make;
    OTG(int capacity, String type) {
        super(capacity);
        this.type = type;
    }
    OTG(String make){
        super(0);
        this.make = make;
    }
}
