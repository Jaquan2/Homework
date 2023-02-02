package class18;
/*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
 Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
 */
public class Student {
    String name;
    int score1;
    int score2;
    int score3;
    double average1;


    Student( String sName, int sScore1,int sScore2, int sScore3) {

        name = sName;
        score1 = sScore1;
        score2 = sScore2;
        score3 = sScore3;
        average1 = (score1 + score2 + score3) / 3;
    }

       void printInfo(){

            System.out.println(" My name is " + name + " and my average score " + average1 + ".");
        }


    public static void main(String[] args) {

        Student passFail=new Student("Jones",90,89,98);
        passFail.printInfo();
        Student passFail1=new Student("Elise",89,99,92);
        passFail1.printInfo();
        Student passFail2=new Student("Louis",90,95,89);
        passFail2.printInfo();

    }






}



