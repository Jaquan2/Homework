package DecemberHomework;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {

        double celsius=0.0;
        double fahrenheit=0.0;

        Scanner reader= new Scanner(System.in);
        System.out.println("Please input your city");
        reader.next();
        System.out.println("What is the temperature in your city");

        celsius=reader.nextDouble();

        fahrenheit=9.0/5.0*celsius+32.0;



    }
}
