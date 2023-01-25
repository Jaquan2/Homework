package project01;

public class Task5 {
    //Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.
    public static void main(String[] args) {

        int [][] matrix={{2,4,6,8,10},{1,3,5,7,9}};

        int sumEven=0;
        int sumOdd=0;

        for (int i=0; i < 2;i++){
            for (int g=0; g < 5; g++){

                if (matrix[i][g] % 2==0){
                    sumEven+=matrix[i][g];
                }else{
                    sumOdd=matrix[i][g];
                }
            }
            System.out.println("Sum of odd and even number is"+ (sumEven+sumOdd));
        }

    }
}
