import java.util.*;
public class ifelse {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);        
        boolean rain = false;

        if (rain)
        {
            System.out.println("Take an umbrella");
        }
        else{
            System.out.println("Have sunbath");
        }

        System.out.println(1>11);
//WHICH IS GREATER
        int n1=18;
        int n2=20;

        if(n1>n2){

            System.out.println("n1 is greater");
        }
        else{
            System.out.println("n2 is greater");
        }
//CHECK WHETHER NUMBER 1 AND NUMBER 2 ARE EQUAL OR NOT
        System.out.println(3==5);

        int a=15;
        int b=18;
        
        if(a==b){
            System.out.println("Yes, equal");
        }
        else{
            System.out.println("not equal");
        }

//User input type
        
        int c = sc.nextInt();
        sc.nextLine();
        int d = sc.nextInt();

        if (c==d)
        {
            System.out.println("Yes "+c+" and "+d+" are equal");
        }
        else{
            System.out.println("They are not equal");
        }


    }
}
