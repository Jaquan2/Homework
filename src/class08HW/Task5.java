package class08HW;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.println("Enter 1st number: ");
        int number1=input.nextInt();

        System.out.println("Enter 2nd number: ");
        int number2=input.nextInt();

        int totalEven=0;
        int totalOdd=0;

        for (int i= number1;i <=number2;i++) {
            if (i%2==0){
                totalEven+=i;
            }else{
                totalOdd+=i;
            }
            System.out.println("Even numbers= "+totalEven);
            System.out.println("Odd numbers= "+totalOdd);
        }
    }
}
