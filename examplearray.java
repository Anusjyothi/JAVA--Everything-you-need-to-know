import java.util.Scanner;
public class examplearray {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] marks= new int[5];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        for(int i=0; i<5;i++)
        {
            sum+=marks[i];
        }
        System.out.println("Total sum= "+sum);


    }
}
