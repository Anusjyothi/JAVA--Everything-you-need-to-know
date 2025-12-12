public class store1 {

    int getsoap(int money)
    {
        int soap_price=18;
        int balance=money -soap_price;
        return balance;
    }
    
    public static void main(String[]args)
    {

        store1 s= new store1();

        int balance=s.getsoap(20);
        System.out.println("The balance= "+balance);
    }





    
}
