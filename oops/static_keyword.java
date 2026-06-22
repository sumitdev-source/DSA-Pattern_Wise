package oops;

//1. Static variable: For calling static member(variable,class,method) we dont need object. We can call it by Class name.
/*
class F {
  static int a = 10;
}
*/

//2. Static Method:
/*
class F {
  static void show(){
    System.out.println("Inside Static Method");
  }
}
*/

//4. Static Class: It achieve in Nested Class, Class inside another class marked Static.
/*
class F {
  static class F2 {
    void display(){
      System.out.println("Inside Nested Static Class");
    }
  }
}
*/

//5. Accessing non-static member inside a static.
/*
class F {
  static void fun(){
  F obj = new F();
  obj.greeting();
  }

  void greeting(){
    System.out.println("A Non Static Method");
  }
}
*/

//6. Accessing static member inside a non-static.
/*
class F {
  static int x = 10;
  void display(){
    System.out.println(x);
  }
}
*/







public class static_keyword {

  //3. Static Block: It run once when the main class is loaded. main class is -> public class static_keyword {}
  /*
   static {
    System.out.println("Static block is executed");
  }
  */
 

  public static void main(String[] args) {
    //1.
    // System.out.println(F.a);

    //2.
    // F.show(); 
    
    //3.
    // System.out.println("Static Block will Run");

    //4.
    /*
    F.F2 obj = new F.F2();
    obj.display();
    */

    //5. Calling a non static method from a static method.
    // F.fun();

    //6.Calling a static member from a non static method.
    /*
    F a = new F();
    a.display();
    */

  }
}


/*
What is: Static is a keyword which belongs to class not to objects.
Why we need it: Because sometie some data or behavior have to share among object instead of duplicated.
Static keyword cant use this and super, because these two keywords need object.

*/