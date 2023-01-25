package class13HW;

public class Task05 {
//How would you check if String is palindrome or not? aba=> true
//Abbc =>false
    public static void main(String[] args) {

        String word= "Kayak";
        boolean flag=true;

        word=word.toLowerCase();

        for (int i= 0; i < word.length()/2;i++){

            if (word.charAt(i)!=word.charAt(word.length()-i-1)){
                flag= false;
                break;

            }
        }

        if(flag){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }


    }
}
