package Loop;

public class For1 {

    public static void main(String[] args) {
        
        int sum = 0;
        
        for ( int i = 0 ;i < 10; ++i){
            sum += i;
            System.out.println("sum = " + sum);
            System.out.println("i = " + i);
        }
        
    }
}
