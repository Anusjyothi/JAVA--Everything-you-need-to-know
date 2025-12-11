import java.util.*;
public class c9 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a= new int[size];
        System.out.println("Enter the "+size+" elements");
        for(int i=0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        
        if (size%2!=0)
        {
            int n=size/2;
            System.out.println("The middle element is : "+a[n]);
        }
        else{
            int n=size/2;
            int n2=n-1;
            System.out.println("The middle elements are: "+a[n]+" "+a[n2]);
        }



    }
    
}
