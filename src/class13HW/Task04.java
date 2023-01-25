package class13HW;

public class Task04 {

    /*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/
    public static void main(String[] args) {

        StringBuilder sentence= new StringBuilder("Today is Wednesday.");

        sentence.reverse();

        System.out.println(sentence);



    }
}

