package class13HW;

public class Task06 {
   //How would you swap  2 strings without a temporary variable?
    public static void main(String[] args) {

        String word="hey";
        String word2="bye";

        System.out.println("before swap:"+word +" "+ word2);

        word= word + word2;

        word2= word.substring(0,word.length()- word2.length());

        word= word.substring(word2.length());

        System.out.println("After:"+ word+ " "+ word2);




    }
}
