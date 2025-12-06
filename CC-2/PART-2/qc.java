import java.util.*;
public class qc {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        String lightColor = sc.nextLine();

        if(lightColor.toLowerCase().equals("red"))
        {
            System.out.println("Stop");
        }
        else if(lightColor.toLowerCase().equals("yellow"))
        {
            System.out.println("Get ready");
        }
        else
        {
            System.out.println("Go");
        }

    }
}
