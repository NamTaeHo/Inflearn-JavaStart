package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.2;
        int intValue = 0;
        
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
