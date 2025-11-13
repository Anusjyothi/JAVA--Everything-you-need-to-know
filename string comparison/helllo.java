public class helllo {
    public static void main(String [] args)
    {
        String a = "one";
        String b= "one";
        String c=b;
        System.out.println(a==c);//address same
        System.out.println(a.equals(c));//values same

        String d =new String("one");
        String e = d; 
        System.out.println(a==e);
        System.out.println(a.equals(e));

    }
    
}
