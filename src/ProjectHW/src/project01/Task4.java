package project01;

public class Task4 {
    //Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {

        int [][] arr= {{2,4,6,8},{1,3,5,7}};

        for (int i=0; i < 2;i++){
            for(int j=0; j < 4;j++){
               if(arr[i][j] %2==0){
                   System.out.println(arr[i][j]);
               }
            }
        }
    }
}
