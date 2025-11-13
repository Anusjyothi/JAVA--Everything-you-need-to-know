import java.util.*;
public class q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if(income >7000)
        {
            System.out.println("Scholarship is available");
        }
        else{
            System.out.println("Not eligible for Scholarship");
        }

    }
    
}
