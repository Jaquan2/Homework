package class16;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    boolean palindrome (String input){

        StringBuilder str = new StringBuilder(input);
        if (input.equals(str.reverse().toString())) {
            return true;
        } else {
            return false;
        }

    }


        /*
        // this is the proper way because it did not ask for return it ask to print
        void palindrome( String input){

        String straight="kayak";
        StringBuilder st=new StringBuilder();
        st.reverse();
        String reversedStr=st.toString();
        if (straight.equals(reversedStr)){
            System.out.println(str+"is palindrome");
        }else{
            System.out.println(str+"Not palindrome");
        }
        }*/


}
