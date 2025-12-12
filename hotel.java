public class hotel {
    int tea=0;
    int coffee=0;
    int vada=0;
    int cutlet=10;

    int cupicecream=50;

    public static void main(String[]args)
    {
        hotel hotel1 = new hotel();
        hotel hotel2 =new hotel();
        hotel hotel3 = new hotel();

        hotel server = new hotel();

        hotel1.tea=10;
        hotel1.coffee=20;
        hotel1.vada=30;
        hotel1.cutlet=40;

        hotel2.tea=5;
        hotel2.coffee=15;
        hotel2.vada=25;
        hotel2.cutlet=35;

        System.out.println(hotel2.coffee);
        System.out.println(hotel1.vada);

        System.out.println(server.cupicecream);

        System.out.println(hotel3.tea);


    }
    
}
