class OverloadingDemo{
    void test(){
        System.out.println("No parameters passed");

    }
    void test(int a){
        System.out.println("Value of a is " + a);
    }


}
/**
 * Overload
 */
public class Overload {
public static void main(String[] args) {
    OverloadingDemo ob = new OverloadingDemo();
    ob.test();
    ob.test(2);
}
   
}
