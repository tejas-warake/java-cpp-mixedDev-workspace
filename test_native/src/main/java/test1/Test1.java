package test1;

public class Test1 {
    public Test1() {
        
    }
    
    public native double multiply(double a, double b) ;
    
    public static void main(String[] args) {
        Test1 ob = new Test1();
        double res = ob.multiply(2.0, 4.0);
        System.out.println(res);
    }
    
}
