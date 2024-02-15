import java.util.Scanner;

/**
 * Student
 */
public class Student {
String name;
int usn;
String dept;
int sem;
void read(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");

    name = scanner.nextLine();

    System.out.println("Enter your usn: ");
    usn = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter your department: ");
    dept = scanner.nextLine();

    System.out.println("Enter your semester: ");
    sem = scanner.nextInt();

}

void display(){
    System.out.println("Your name: " + name);
    System.out.println("Your usn: " + usn);
    System.out.println("Your department: " + dept);
    System.out.println("Your semester: " + sem);



}
    public static void main(String[]args){
        Student o1 = new Student();
        o1.read();
        o1.display();
    }
}