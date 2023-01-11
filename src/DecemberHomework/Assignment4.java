package DecemberHomework;
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner dmv= new Scanner(System.in);
        System.out.println("What is your age?");
        int age= dmv.nextInt();
        if (age>=18) {
            System.out.println("Here is your license");
        }else {
            System.out.println("You are eligible for a learners permit");
        }


    }
}
