package project01;
import java.util.Scanner;
public class Task7 {
    //Write a java program to check whether a given number is prime or not.
    public static void main(String[] args) {
    Scanner user=new Scanner(System.in);
    System.out.println("Enter a number to see if number is prime");

    int num= user.nextInt();

  for (int i=2;i <=num; i++){
      if (num % i ==0){
          System.out.println(num+"is not a primary number");
          return;
      }

      }
        System.out.println(num+"is a primary number");
  }



    }

