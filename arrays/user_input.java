package arrays;

import java.util.Scanner;

public class user_input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of row: ");
    int row = sc.nextInt();
    System.out.print("Enter the no. of col: ");
    int col = sc.nextInt();
    int[][] arr = new int[row][col];

    //traverse
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j <arr[i].length; j++){
      arr[i][j] = sc.nextInt();
      }
    }

    // traverse
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j <arr[i].length; j++){
      System.out.print(arr[i][j] + " ");
      }
    }
    
  }
}
