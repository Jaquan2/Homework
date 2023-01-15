package class08HW;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner money= new Scanner (System.in);
        double moneyGiven;
        System.out.println("What items do you have?");
        String ItemName= money.nextLine();
        System.out.println("Price of Item");
        double ItemPrice= money.nextDouble();
        System.out.println("Your total is "+ItemName);
        System.out.println("Please enter money given?");
        moneyGiven= money.nextDouble();

        if (moneyGiven<ItemPrice) {
            System.out.println("Please pay $"+ (ItemPrice - moneyGiven)+"to pay of your due");
        }else {
            System.out.println("your change is"+ (moneyGiven-ItemPrice));
        }
        System.out.println("Thank you for shopping");


    }
}
