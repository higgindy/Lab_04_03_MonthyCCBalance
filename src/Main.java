public class Main
{
    public static void main(String[] args)
    {
       int cardBalance = 5000;
       double interestRate = 0.17;
       double firstAmount = 0.0;
       double secondAmount = 0.0;

       firstAmount = cardBalance * interestRate;
       secondAmount = (firstAmount + cardBalance) * interestRate;

       System.out.println("The interest due after one month is: " + firstAmount);
       System.out.println("The interest due after two months is: " + secondAmount );




















    }
}