import java.util.*;
public class qb{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int sub1= sc.nextInt();
        int sub2= sc.nextInt();
        int sub3= sc.nextInt();
        int sub4= sc.nextInt();
        int sub5= sc.nextInt();
      int totalmarks = sub1+ sub2+ sub3 + sub4+ sub5;
      int  averageMarks = totalmarks/5;

      if (averageMarks<35)
      {
        System.out.println("Additional class is required");
      }
      else
      {
        System.out.println("You are good to go");
      }



    }
}
