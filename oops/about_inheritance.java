package oops;
// Types:
//1. Single Inheritance : One child class inherit from one parent class.
/*
class J {
  void greet(){
    System.out.println("In J class");
  }
}

class K extends J {
  void show(){
    System.out.println("In K class");
  }
}
*/

//2. Multilevel Inheritance : It makes a chain of inhertance, one parent class in inherited by childe class that child class inherited by other class.
/*class J {
  void greet(){
    System.out.println("In J class");
  }
}

class K extends J {
  void show(){
    System.out.println("In K class");
  }
}

class L extends K {
   void display(){
    System.out.println("In L class");
  }
}
*/

//3. Hierarchial Inheritance : One parent class inherited by many child class.
/*
class J {
  void greet(){
    System.out.println("In J class");
  }
}

class K extends J {
  void show(){
    System.out.println("In K class");
  }
}

class L extends J {
   void display(){
    System.out.println("In L class");
  }
}
*/

public class about_inheritance {
  public static void main(String[] args) {
    //1. Single Inheritance
    /*
    K o1 = new K();
    o1.greet(); //greet() method of Parent Class J
    o1.show(); //show() method of Parent Class K
    */

    //2. Multilevel Inheritance
    /*
     L o1 = new L();
    o1.greet(); //greet() method of Parent Class J
    o1.show(); //show() method of Parent Class K
    o1.display(); 
    */
    
    //3. Hierarchial Inheritance
    /*
    L o1 = new L();
    o1.display(); 
    o1.greet(); //greet() method of Parent Class J
    
    K o2 = new K();
    o2.greet(); //greet() method of Parent Class J
    o2.show(); //show() method of Parent Class K
    */ 
  }
}


/*
Inheritance: One parent class data and behvaior inherited by child class.
Note: Multiple Inheritance does not support by Java with classes to avoid ambiguity. It is achieved by interface.
*/