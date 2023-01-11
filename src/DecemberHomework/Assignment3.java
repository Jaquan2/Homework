package DecemberHomework;
import com.sun.source.tree.IfTree;

import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("What is the loan amount that is needed?");

        int loan= number.nextInt();
        if (loan<=200000) {
            System.out.println("I will lend you the money");
        }else{
            System.out.println("I'm sorry but I can not lend you the amount");
        }


    }
}
