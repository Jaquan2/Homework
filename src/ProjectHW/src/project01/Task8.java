package project01;

public class Task8 {
    //Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int sum;

        for (int i = 1; i <= 10; i++) {

            System.out.print(a + ", ");
            sum = a + b;
            a = b;
            b = sum;

        }


    }
}
