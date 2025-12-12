import java.util.*;
public class random1 {
    public static void main(String[]args)
    {
        Random rd = new Random();

        int newnum=0;

        while(newnum!=5)
        {
            newnum= rd.nextInt(11);
            System.out.println(newnum);

        }





    }
}
