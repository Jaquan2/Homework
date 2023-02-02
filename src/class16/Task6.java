package class16;
import java.util.Scanner;
public class Task6 {
    /*Create class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/
    char grade(){
        char grade='a';
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your score");
        int a=scan.nextInt();
        if(a>90) {
            grade='A';
        } else if (a>80) {
            grade ='B';
        } else if (a>70) {
            grade='C';
        } else if (a>50) {
            grade='D';
        }else {
            grade='F';
        }
        return grade;

    }

    public static void main(String[] args) {

        Task6 mp= new Task6();
        System.out.println(mp.grade());
    }
}
