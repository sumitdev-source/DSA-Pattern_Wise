package oops;

//Type1: Overloading
/*
class M {
  void greet(){
    System.out.println("Hi!");
  }

  void greet(String name){
    System.out.println("Hi! My name is " + name);
  }

  void greet(String name, int age){
    System.out.println("Hi! My name is " + name + " " + "& age is " + age + ".");
  }
}
*/

//Type2: Overriding
class M {
 void greet(String name, int age){
    System.out.println("Hi! My name is " + name + " " + "& age is " + age + ".");
  }
}

class N extends M {
 void greet(String name, int age){
    System.out.println(name + " " + "&" + " " + age);
  }
}


public class about_polymorphism {
  public static void main(String[] args) {
    //Overloading
    /*
    M o1 = new M();
    o1.greet();
    */

    //Overriding
    /*
    N o1 = new N();
    o1.greet("Ram", 12);
    */
    
  }
}


/*
Polyphormism: One names (methods/function) behave in different ways depending on the situation.
Types:
1. Compile Time : When the method call is resolved during compilation. It is achieved by Method Overloading.
Method Overloading: Same method name but different parameters. It doesn't need Inheritance.
Final keyword doesn't use in overriding.

2. Runtime Polymorphism : When method call is decided at runtime. It is achieved by Method Overriding
Method Overriding: Same method name and also same parameters but different behaviour in child class, It needs inheritance. Child class overrides the parent class.

Note: Overloading & Overriding doesnt apply on instance variable.

*/
