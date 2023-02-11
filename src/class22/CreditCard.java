package class22;
/*Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */

public class CreditCard {
    void CalculateInterest(double balance, double interest) {

        System.out.println(balance * (interest / 100));

    }


}
class Visa extends CreditCard{

}


class AX extends CreditCard{

    @Override
    void CalculateInterest(double balance, double interest) {
        System.out.println(balance*(interest+2/100));
    }


    public static void main(String[] args) {
        CreditCard creditcard=new CreditCard();
        creditcard.CalculateInterest(300,4);
        Visa visa=new Visa();
        visa.CalculateInterest(500,3);
        AX ax= new AX();
        ax.CalculateInterest(600,2);
    }






}
