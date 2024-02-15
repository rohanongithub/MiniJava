import java.util.Date;
import java.util.Scanner;

class Begin{
public static void main(String[]args){
    int age = 10;
    float weight = 23.34F;

    System.out.println(weight);
    System.out.println(age);
     
    Date current = new Date();
    //Date is a predefined class in java.util
    //Here u are calling java class and accessing the utility package from its vast 
    //library.. 
    //current is an instance u created in the date class. new used to allocate space. Date() is method.
    System.out.println(current);

    double x=1.1;
    double y = (int)x + 2; //explixit conversion
    System.out.println(y);

    //use of parseint

    //we use wrapper class called INTEGER in java.lang

    String a = "2";
    int b = Integer.parseInt(a) + 3;
    System.out.println(b);

    //taking inputs

    Scanner scanner = new Scanner(System.in);
    System.out.print("Type in your age:");
    byte ge = scanner.nextByte();
    System.out.println("You are" + ge);
    
    Scanner nm = new Scanner(System.in);
    System.out.println("Name:");
    String name = nm.nextLine();
    System.out.println("Name is" + name);
    
    

}
}
