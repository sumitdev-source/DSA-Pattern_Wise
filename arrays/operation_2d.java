package arrays;

public class operation_2d {
  public static void main(String[] args) {
    int[][] arr = {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
              };

    // count row
    /*
    int row = 1;
    int sum = 0;
    for(int i = 0; i <arr[row].length; i++){
          sum = sum + arr[row][i];
    }

    System.out.println(sum);
    */

    //count column
    /*
    int col = 1;
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum = sum + arr[i][col];
    }
    System.out.println(sum);
    */

    // print diagonal
    /*
     for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i][i] + " ");
    }

    */
   
    //print opposite diagonal
    /*
    int n = arr.length;
    for(int i = 0; i < n; i++){
      System.out.print(arr[i][n-1-i] + " ");
    }    
    */

    //transpose
    /*
    int rows = arr.length;
    int cols = arr[0].length;

    int[][] transpose = new int[cols][rows];

    for(int i = 0; i < rows ; i++){
      for(int j = 0; j < cols; j++){
        transpose[j][i] = arr[i][j]; 
      }
    }

    for(int i = 0; i < transpose.length ; i++){
      for(int j = 0; j < transpose[i].length; j++){
        System.out.print(transpose[i][j] + " ");
      }
    }
    */
    
  }
}
