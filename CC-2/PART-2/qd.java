import java.util.*;
public class qd {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int age = sc.nextInt();

        if ( salary>=20000 || age<=25)
        {
            int loanAmount = sc.nextInt();

            if(loanAmount<=50000)
            {
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("The maximum loan amount is 50000");
            }
        }
        else
        {
            System.out.println("You are not eligible for loan");
        }





    }


    
}
