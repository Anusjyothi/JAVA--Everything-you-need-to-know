public class store {
 
void powder(int money)
{
    System.out.println(money);
    System.out.println("Powder purchased");
}
 void chocolate(int money)
 {
    System.out.println(money);
    System.out.println("Chocolate purchased");
 }


    public static void main(String[]args)
    {
        store s= new store();
        s.powder(50);
        s.chocolate(15);

    }
    
}
