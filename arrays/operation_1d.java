package arrays;

public class operation_1d {

  public void rotate(int[]arr, int k){
    int n = arr.length;
    k = k % n;

    //rotate whole array
    reverse(arr, 0, n-1);

    //rotate first k element
    reverse(arr, 0, k-1);

    // rotate remaining elements
    reverse(arr, k, n-1);
  }


  public void reverse(int[]arr, int start, int end){
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    // insert element
    // Q. insert 25 at index 2;
    /*
    int[] arr = new int[6];

    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 40;
    arr[3] = 50;
    arr[4] = 60;

    int size = 5;
    int pos = 2;
    int value = 25;

    for(int i = size; i > pos; i--){
      arr[i] = arr[i-1];
    }

    arr[pos] = value;
    size++;

    for(int a : arr){
      System.out.println(a);
    }
    */

    //delete an array
    //in delete shift the element to the right;
    /*
    int[] arr = {1,2,2,3,4,5};
    int size = 6;
    int delete = 2;

    for(int i = delete; i < size - 1; i++ ){
       arr[i] = arr[i+1];
    }

    size--;

    for(int i = 0; i < size; i++){
      System.out.println(arr[i]);
    }
    

    */

    // find min max
    /*
    int[] arr = {1,5,1,8,0};
    int min = arr[0];
    int max = arr[0];

    for(int i = 1; i <= arr.length-1; i++){
      
      if(arr[i] < min){
        min = arr[i];
      } else if(arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("Max: "+ max);
    System.out.println("Min: "+ min);
    */
  

    // find largest and second largest 
    /*
    int[] arr = {10,1,-1,0,100};
    int largest = Integer.MIN_VALUE;
    int secondlargest= Integer.MAX_VALUE;

    for(int num : arr){
      if(num > largest){
        secondlargest = largest;
        largest = num;
      }
      else if(num > secondlargest && secondlargest != largest){
        secondlargest = num;
      }    
    }
    System.out.println("Largest: " + largest);
    System.out.println("Second Largest: " + secondlargest);
    */

    //rotate an array

    /*
       int[] arr = {1,2,3,4,5};

    int last = arr[arr.length - 1];

    for(int i = arr.length - 1; i > 0; i--){
      arr[i] = arr[i - 1];
    }
    arr[0] = last;
    System.out.println(arr[0]);
    */
     
    // rotate by K

 
    
  }
}

// Code of rotate an array
class RotateArray {

  public void rotate(int[]arr, int k){
    int n = arr.length;
    k = k % n;

    //rotate whole array
    reverse(arr, 0, n-1);

    //rotate first k element
    reverse(arr, 0, k-1);

    // rotate remaining elements
    reverse(arr, k, n-1);
  }


  public void reverse(int[]arr, int start, int end){
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }
}