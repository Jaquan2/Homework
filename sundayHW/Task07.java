package sundayHW;

public class Task07 {
    public static void main(String[] args) {

        int sum=0;
        int [] values= {10,20,30,40,50,2};
        for (int i=0;i < values.length;i++) {

            sum+=values[i];
        }
        System.out.println(sum);
    }
}
