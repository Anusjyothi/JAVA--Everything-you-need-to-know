public class c3 {
    public static void main(String[] args)
    {
        int countOfOdd = 0;

        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                ++countOfOdd;
            }
        }

        System.out.println("Count of odd numbers = "+countOfOdd);

    }
    
}
