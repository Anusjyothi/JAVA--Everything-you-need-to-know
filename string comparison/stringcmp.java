public class stringcmp {
    public static void main(String args[])
    {
        String a1="anu"; // contents are not checked but the references
        String a2="anu";

        String a3= new String("orange"); // since this a new object created sepertely in heap.
        String a4= new String("orange");// this too. So both in seperate boxes, with 2 diff addresses
        // so their addresses are not same, so o/p: false
        System.out.println(a1==a2);
        System.out.println(a3==a4);


        //so to comapre teh values use:

        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a4));
    
    }
    
}
