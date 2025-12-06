import java.util.*;
public class elseif {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int score =sc.nextInt();
        
        //score-->62, o/p: video game
        //  iphone
         if (score >35 && score <60)
        {
            System.out.println("Video game");
        }

      /*  if(score>60)
        {
            System.out.println("iphone");
        }

        if(score>100)
        {
            System.out.println("apple phone");
        }*/
 
        else if(score>60 && score<100)
        {
            System.out.println("iphone");
        }
        else
        {
            System.out.println("apple phone");
        }

    }    
}
