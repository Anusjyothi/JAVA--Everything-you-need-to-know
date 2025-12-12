import java.util.*;
public class find{

    void evenodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd");
        }
    }



    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        find f = new find();
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        f.evenodd(number);


    }
}