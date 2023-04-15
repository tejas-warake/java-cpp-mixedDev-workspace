package test;


public class Test1 {
    
    // static initializer for loading cpp library
    static {
        System.loadLibrary("libCppJNILibrary_1");
    }
    
    // declaring the methods as native to be written in c++
    public static native void sayHi() ;
    public static native void sayHiToMe() ;
    public static native void sayHiToMeAndGoodbye() ;
    
    public static void main(String[] args) {
        Test1.sayHi();
        Test1.sayHiToMeAndGoodbye();
//        System.out.println("Hello from java");
    }
}
