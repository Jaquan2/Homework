package class17;

public class Task3 {

    private String strV (String str){
        String a=str.replaceAll("[^aeiou]","");

        return a;
    }

    public static void main(String[] args) {
        Task3 mp= new Task3();

        System.out.println(mp.strV("Saturday"));
    }

}
