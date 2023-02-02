package class17;

public class Task2 {

    public String strR ( String Sunday) {

      StringBuilder str= new StringBuilder("Sunday");

      str.reverse();

      String a= str.toString();

      return a;

    }

    public static void main(String[] args) {
        Task2 hW= new Task2();

        System.out.println(hW.strR("Sunday"));

    }

}




