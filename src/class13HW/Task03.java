package class13HW;

public class Task03 {
    /*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
     How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {

        String a= "Is it saturday? Is it raining? Do we have a Java Class today?";

        String [] aMetrix= a.split("[?]");
        System.out.println(aMetrix.length);
        System.out.println(a);



    }
}
