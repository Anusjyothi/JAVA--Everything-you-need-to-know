public class c4 {
    public static void main(String[] args)
    {
        int countOfEven = 0;

        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                ++countOfEven;
            }
        }

        System.out.println("Count of even numbers = "+countOfEven);

    }
    
}
