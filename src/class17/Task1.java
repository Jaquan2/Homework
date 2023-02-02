package class17;

public class Task1 {

    int sumArray(int[]array){

        int sum=0;

        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Task1 mp=new Task1();
        int[] arr= {1,2,3};
        System.out.println(mp.sumArray(arr));
    }

}
