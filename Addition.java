public class Addition {
    int a =10;
    int b= 20;

    static void sum()
    {
        Addition ad = new Addition();
        int total = ad.a + ad.b;
        System.out.println("Total= "+total);
     }

    public static void main(String[]args)
    {

        sum();

    }
    
}
