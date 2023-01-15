package class08HW;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner reply= new Scanner(System.in);
        for (int card=0; card< 10; card++) {
        System.out.println("Apply for a credit card");
        String answer= reply.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            break;
        }
        }
    }
}
