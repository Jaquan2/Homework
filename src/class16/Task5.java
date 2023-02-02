package class16;

public class Task5 {
    //Write a method to return whether given number is prime or not?
    boolean isPrime(int value1){
        int number=5;
        boolean value=true;
        if (number>1){
            for (int i=2;i <number;i++){
                if (number %i ==0);
                value=false;
                break;
            }
        }else{
            value=false;
        }
        System.out.println(number+"is prime");

        return value;
    }
}
