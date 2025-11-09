import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Main{
     public static void main(String[] args) {

         //Task 2: FINDING MIN AND MAX IN AN ARRAY

         int[] myNum = new int[10];
         for (int i = 0; i < 10; i++) {
             myNum[i] = (int) (Math.random() * 100 + 1);
         }
         System.out.println("Numbers generated: " + Arrays.toString(myNum));
         int min = myNum[0];
         int max = myNum[0];
         for (int i = 1; i < myNum.length; i++) {
             if (myNum[i] < min) {
                 min = myNum[i];
             }
             if (myNum[i] > max) {
                 max = myNum[i];
             }
         }
         System.out.println("Minimum number is: " + min);
         System.out.println("Maximum number is: " + max);

         //Task 3: TWO-DIMENSIONAL ARRAY 10X10

         int[][] matrix;
         matrix = new int[10][10];
//         for (int x= 0, y=0; x < 10; x++, y++) {
//             matrix[x][y] = (int) (Math.random() * 100 + 1);
//         }

         matrix[0][0] = 0;
         matrix[1][1] = 1;
         matrix[2][2] = 2;
         matrix[3][3] = 3;
         matrix[4][4] = 4;
         matrix[5][5] = 5;
         matrix[6][6] = 6;
         matrix[7][7] = 7;
         matrix[8][8] = 8;
         matrix[9][9] = 9;

         int mSum = matrix[0][0]+matrix[1][1]+matrix[2][2]+matrix[3][3]+matrix[4][4]+matrix[5][5]+matrix[6][6]+matrix[7][7]+matrix[8][8]+matrix[9][9];
         System.out.println("The sum of diagonals of the matrix is: "+mSum);

         //Task 5: IS IT PALINDROME?

         Scanner input = new Scanner(System.in);
         System.out.println("Enter a word to check: ");

         String gotWord = input.nextLine();
         gotWord = gotWord.toLowerCase();

         boolean isPdm = true;

         for (int i=0;i<gotWord.length()/2;i++) {
             if (gotWord.charAt(i) != gotWord.charAt(gotWord.length() - 1 - i)) {
                 isPdm = false;
                 break;
             }
             if (isPdm){
                 System.out.println(gotWord+" is a Palindrome");
             }
             else {
                 System.out.println(gotWord+" is not a Palindrome");
             }
         }
     }
}
