package class18;

public class Movie {

    static String name;
    static double length;
    static String genre;


    Movie(String mName,String mGenre,double mLength){
        name=mName;
      genre=mGenre;
      length=mLength;
    }

    void displayInfo(){
        System.out.println("The movie that I watch was "+name+ " and it was "+length+
                " hours long."+" The genre was "+genre+".");

    }

    public static void main(String[] args) {
        Movie film=new Movie("Avengers","action",2);
        film.displayInfo();
    }
}
