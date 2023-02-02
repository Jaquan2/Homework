package class18;
/*Write a java class that will have a constructor: one with parameters and second without any parameters.
 Create a separate Test class where you will execute both of the constructors 1 by 1.*/

public class Dog {

String name;
double weight;
int age;

Dog(String dogName,double dogWeight, int dogAge ){
    name=dogName;
    weight=dogWeight;
    age=dogAge;


    }

    Dog() {
        name = "Nina";
        weight = 50.0;
        age = 11;
    }

    void printInfo(){
        System.out.println("My dog name is "+name+ " and she is "+ weight+ " pounds and she is "+age+ "  years old.");
    }
}
