package class13HW;

public class Task02 {
    public static void main(String[] args) {

        /*Create a String that should be combination of letters, numbers and special
        characters. Find out how many Alphanumeric(abd AZ 284) characters are there
        in the String.
         */

        int letters=0;
        String str= "QWERTYasdf1234asQWYUfgh";

        for (int i= 0; i < str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                letters++;


            }
        }
        System.out.println("total isDigit in str is "+letters);





    }
}
