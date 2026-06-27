import java.util.Scanner;

public class exception_handlling {

public static void ageCheck(int age) throws ArithmeticException{
   
  if(age < 18) {
    throw new ArithmeticException("Not Valid");
  }
}

public static void main(String[] args) {

  // try-catch
  /*
   try {
    int x = 0;
    int y = 10;
    int z = 10/0;
    System.out.println(z);
    
  } catch (Exception e) {
    System.out.println("Can't divide by 0");
  }
  System.out.println("Program Continues");
  */

  // try with multiple catch
  /*
  try{
  Scanner sc = new Scanner(System.in);
  int[] arr = {1,2,3};
  System.out.print("Enter index: ");
  int ind = sc.nextInt();
  System.out.println("Element: " + arr[ind]);

  System.out.print("Enter number: ");
  int num = sc.nextInt();
  int x = 10/num;
  System.out.println(num);
  } catch (ArrayIndexOutOfBoundsException e){
    System.out.println("invalid index");
  } catch (ArithmeticException e){
    System.out.println("divide by zero");
  }
  */

  // try-catch-finally
  /*
  try {
    int x = 10 * (10 / 0);
    System.out.println(x);
  } 
  catch (ArithmeticException e) {
   System.out.println("Can't divide by 0");
  } 
  finally {
    System.out.println("Finally programm is runned");
  }

  */
 
  // throw

  // writing type 1;
  /*
  int age = 15;
 
   if(age < 18){
    throw new ArithmeticException("Not eligible for vote");
   }

   System.out.println("Eligible for vote");
  */
  
  // writing type 2:
 /*
 int age = 15;
  try {
  if(age < 18){
    throw new ArithmeticException("Not eligible for vote");
   }
 }
   catch(ArithmeticException e) {
    System.out.println(e.getMessage());
  }
 */

  // throws
  // ageCheck(15);
  
 }
}
