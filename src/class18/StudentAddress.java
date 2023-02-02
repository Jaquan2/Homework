package class18;

/*Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
 */
public class StudentAddress {

    String address;
    String name;

    StudentAddress(String sName,String sAddress){

        name=sName;
        address=sAddress;

    }

    void displayInfo(){
        System.out.println("Student name is "+name+ " and there address is "+address+".");
    }

    public static void main(String[] args) {

        StudentAddress location=new StudentAddress("Alex","231 Java Ave.");
        location.displayInfo();
        StudentAddress location1=new StudentAddress("Megan","345 Syntax Dr.");
        location1.displayInfo();
    }

}
