import java.lang.System;
import java.util.Scanner;

public class nameAndAge {
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    String Name=sc.nextLine();
    int Age=sc.nextInt(); //it wont take the  entire line..! So...! 
    sc.nextLine(); // this takes the line the nextInt() dont takes
    String Address = sc.nextLine(); // so the address will be read in new line

    System.out.println("My name is "+Name);
    System.out.println("My age is "+Age);
    System.out.println("My address is "+Address);
}    
}
