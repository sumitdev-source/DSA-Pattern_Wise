package oops;
// Type 1. abstract class
/*
abstract class animal {
  abstract void sound();
  int age = 10;

  void age(){
    System.out.println("normal method with body inside abstract class");
  }
}

class Dog extends animal {
  void sound(){
    System.out.println("abstract method is called");
  }
}

*/

// Type 2 -  interface
interface Animal{
  void sound();
}

class Dog implements Animal {
   public void sound(){
    System.out.println("Bark");
  }
}

class Cat implements Animal {
   public void sound(){
    System.out.println("Meow");
  }
}


public class about_abstraction {
  public static void main(String[] args) {
    /*
    // Type 1.
    Dog d = new Dog();
    System.out.println(d.age);
    */
    
    // Type 2
    /* */
    Animal d = new Cat();
    d.sound();
    d.sound();
  }
}

/*
-> Abstraction: It means hiding complex data, only show the important features to the user.
Lets take an example of ATM, we only want money from ATM, what the process of getting money from ATM we dont know and we dont want.

-> Abtraction achieve by two ways - abstract or interface.

1. abstract class - An abstract class is a class that cannot be used to create objects directly. It is used as a blueprint for other classes. child class must implements the methods of abstract class.
-> abstract can be class or method by using "abstract" keyword.
-> It can have:
            - Abstract methods (without body)
            - Normal methods (with body)
            - Variables
            - Constructors
            - Static method (with body)
            - Final variable can be initiliaze in abstract class constructor. it is for constant values.
-> abstract method can't be private, final or static.
-> you can't achieve MULTIPLE INHERITANCE by Abstract class but can achieve with INTERFACE.


2. interface: It is a blueprint of a class that contains only method declarations not implementations. It tells what to do, but not how to do it.
-> Can't create object of Interface.
-> It is like a contract - any class that uses it must follow it rules.
-> An interface is not a class. It is a contract that defines methods which implementing classes must provide.
-> Why use? To achieve abstraction, To support Multiple Inheritance, To achieve loose coupling.
-> "implements" keyword is used to apply methods of interface.
-> It supports multiple inheritance
-> It can't have constructor.
-> It extend to another interface using extends keyword.
-> Interface can have default and static method.
-> It can have:
            - Abstract methods
            - Variables
            - Default methods (must have body)
            - Static methods (must have body)
-> STATIC METHOD IN interface;
         - this method called by using interface name.
         - they are not inherited by implementing class
         - they can't be overriden
         - static method must have body.
-> DEFAULT METHOD IN interface; A default method is a method in an interface that has a body. It was introduced in Java 8 to add new functionality to interfaces without breaking existing implementing classes.
         - must be inside interface 
         - must use "default" keyword
         - can be overriden in class
         - can't be abstract
*/
