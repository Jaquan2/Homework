package project01;

public class Task3 {
    public static void main(String[] args) {

        int [][] matrix= {{2,3,4},{2,3,4},{2,3,4}};

        int sum= 0;

        for (int i=0; i < 3;i++){
            for (int j=0; j < 3;j++){
                sum+=matrix[i][j];
            }

        }
        System.out.println("The sum is"+" "+sum);
    }
}
