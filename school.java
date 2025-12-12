import java.util.*;
public class school {

String passorfail(int marks)
{
    if (marks<35)
    {
        return "Fail";
    }
    else{
        return "Pass";
    }
}


public static void main(String[]args)
{

    Scanner sc = new Scanner(System.in);

    school s= new school();
    System.out.println("Enter the Total marks: ");
    int totalmarks= sc.nextInt();

    String ans=s.passorfail(totalmarks);

    System.out.println(ans);




}
}
