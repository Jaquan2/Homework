package class18;
/*Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed */
public class Book {

    String name;
    String author;
    int length;
    double price;
    Book ( String bName, String bAuthor, int bLength, double bPrice) {

        name = bName;
        author = bAuthor;
        length = bLength;
        price = bPrice;
    }
    void displayInfo() {
        System.out.println(" The book name is "+ name + " it is written by " + author +
        " it has " + length + " pages. The price was " + price + ".");
    }

    Book( String bName, String bAuthor, double bPrice){

        name=bName;
        author=bAuthor;
        price=bPrice;


    }
void displayInfo2(){
    System.out.println(" The book name is "+ name + " it is written by " + author +
            ". "+ " The price was " + price + ".");
}

    public static void main(String[] args) {

        Book novel=new Book("Mobey Dick","James Gunn",234,24.99);
        novel.displayInfo();
        Book novel2=new Book("Hunger Games","Jessica Sesomes",15.89);
        novel2.displayInfo2();
    }

}
