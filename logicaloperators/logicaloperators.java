import java.util.Scanner;
public class logicaloperators {
    public static void main(String[]args)
    {

        // && OPERATOR
        boolean hungry = false;
        boolean icecream = false;
        // true && true-> Eat
        //true && false --> dont eat
        //false && true --> dont eat
        //false && false --> dont eat

        if (hungry && icecream)
        {
            System.out.println("Eat");
        }
        else{
            System.out.println("Dont eat");
        }

        // || OPERATOR

        boolean cricket= false;
        boolean football = false;

        // true || true --> true
        // true || false --> true
        // false || true --> true
        // false || false -->false

        if (cricket || football)
        {
            System.out.println("I play");

        }
        else
        {
            System.out.println("I wont play");
        }

    }
    
}
