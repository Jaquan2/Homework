package class16;

public class Task2 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    String languages (String helloLang){

        switch (helloLang){

            case "USA":
                return "Hello";

            case "Spanish":
                return "Hola";

            case "Arabic":
                return "أهلا";

            case "China":
                return "你好";

            default:
                return "country is not supported";
        }
    }


    public static void main(String[] args) {
        Task2 mp= new Task2();
        System.out.println(mp.languages("China"));
    }
}
