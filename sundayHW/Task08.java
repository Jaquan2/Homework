package sundayHW;

public class Task08 {
    public static void main(String[] args) {

        String[] countries = {"Canada", "Virginia", "Texas", "Maryland", "Ohio"};
        // String[] captials={"Ottawa","Richmond","Austin","Annapolis","Columbus"}

        for (int i = 0; i < countries.length; i++) {

            switch(countries[i]){

                case "Canada":
                    System.out.println("The capital of"+" "+countries[0]+" "+"is"+" "+"Ottawa");
                    break;
                case "Virginia":
                    System.out.println("The capital of"+" "+countries[1]+" "+"is"+" "+"Richmond");
                    break;
                case "Texas":
                    System.out.println("The capital of"+" "+countries[2]+" "+"is"+" "+"Austin");
                    break;
                case "Maryland":
                    System.out.println("The capital of"+" "+countries[3]+" "+"is"+" "+"Annapolis");
                    break;
                case "Ohio":
                    System.out.println("The capital of"+" "+countries[4]+" "+"is"+" "+"Columbus");
            }

         }
    }

}

