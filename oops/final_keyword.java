package oops;

// Type 1
/*
class E {
  final int age = 10;

}
*/


// Type 2
//it also gives error, it says if the parent class is final class, then it cannot be inherited by subclass/child class.
/*
final class E {
 
}

class D extends E {

}
 */

// Type 3
//if a parent class is not final but the method is final, then it cant be overriden in child class
/* 
class E {
  final void msg(){
    System.out.println("Final Method");
  }
}

class D extends E {
  void msg(){
    
  }
}
*/

// Type 4: When we make final an object.
class E {
  int age = 10;

}


public class final_keyword {
  public static void main(String[] args) {
    // Type 1 
    /*
     E a = new E();
     System.out.println(a.age); // output -> 10
    //if you try to change the value of final Instance Variable, It will give you an error. 
    // a.age = 20;
    */

    //Type 4: When we make final an object.
    /*
    //then, we change the value
    final E a = new E();
    a.age = 35;
    System.out.println(a.age);  // output -> 35

    //but we can't reassign it gives the error.
     a = new E();
    */
  }
}

/*
  final means, after using it with class, method or variable it will not change.
*/
