package oops;
class C {
  String name;
  int age;

  C(){
    //It is the code of Type 1
    /*
    // this("A", 0);
    // System.out.println("Default Constructor");
     */ 

    //It is the code of Type 2
    System.out.println("Parent Constructor");
  }

  //Type 1
  C(String name, int age){
    this.name = name;
    this.age = age;
    System.out.println("Parametrized Constructor");
  } 
}

class D extends C {
  D(){
    super();
    System.out.println("Child Constructor");
  }
}

public class Constructor_Chaining {
  public static void main(String[] args) {
    // Type 1
    // C s1 = new C();
    // System.out.println(s1.name + " " + s1.age);

    // Type 2
    // D s2 = new D();

  }
}

/*
Constructor Chaining: It is used to call constructor from other constructor. Using this() and super().
Type 1: this() = it works within same class.
Type 2: super() = it uses inheritence.
*/
