public class calculator {

    void sum(int a, int b){
        System.out.println("sum= "+(a+b));
    }

    void sub(int a, int b){
        System.out.println("sub= "+(a-b));
    }

    void mul(int a , int b){
        System.out.println("mul= "+(a*b));
    }

    void div(int a , int b)
    {
        System.out.println("div= "+(a/b));
    }

    public static void main(String[] args) {
        
        calculator c = new calculator();

        c.sum(5,6);
        c.sub(5,6);
        c.mul(5,6);
        c.div(5,6);
    }
    
}
