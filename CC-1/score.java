import java.lang.System;
import java.util.Scanner;
public class score {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

            String name = sc.nextLine();
            float score = sc.nextInt();
            sc.nextLine();
            String department = sc.nextLine();

            System.out.println("My name is "+name);
            System.out.println("My Score is "+score/10 +" / 10");
            System.out.println("My department is "+department);
    }
}
