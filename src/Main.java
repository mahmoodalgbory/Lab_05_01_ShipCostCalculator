public class Main
{
    public static void main(String[] args)
    {
        int itemPrice = 69;
        double totalPrice = itemPrice * 1.02;


        if (itemPrice >= 100)
        {
            System.out.println("Congratulations you qualify for free shipping your total is " + itemPrice);
        }
        else
        {
            System.out.print("You do not qualify for free shipping your total is " + totalPrice);
        }

    }
}