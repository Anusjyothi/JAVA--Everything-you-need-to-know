import java.util.*;
public class q3 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if ( number%3 ==0 && number%5==0){

            System.out.println("Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Not divisible by both 3 and 5");
        }

    }
}
