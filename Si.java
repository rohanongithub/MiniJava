import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;


class Si{

    long  p;
    long  t;
    long r;
   public int i;
 long calc(){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the principal amount Mr.Sanketh: ");
    p = scanner.nextInt();
    System.out.println("Enter the time: ");
    t = scanner.nextInt();
    System.out.println("Enter the rate of interest: ");
    r = scanner.nextInt();

    i = (int) ((p*t*r)/100);
     return i;
   }
  void display(){
    System.out.println(i);
  }

  public static void main(String[]args){
    Si o1 = new Si();
     o1.calc();
     o1.display();

  }







}