package oops;

//class is a blueprint that defines variables(data) and methods(behavior) for object.
class A {
  int age;      //variables(date) 
  String name;  //variables(date)

  void msg(){ 
    System.out.println("Hi! It is a Method Body");      //methods(behavior)
  }
}

public class object {
  public static void main(String[] args) {
    A s1 = new A();
    
    //1.
    //in object if nothing is assinged then default value is "null"
    //System.out.println(s1.name);

    //2.
    //java work in sequence and mostly program also. now name will print "B"    
    //s1.name = "A";
    //System.out.println(s1.name);
    //s1.name = "B";
    //System.out.println(s1.name);

    //3.
    //comparing two objects
    //A s2 = new A();
    //System.out.println(s1==s2);
    //output is false because each object is unique and their memory refernce is different

    //4.how to call a non static method
    //s2.msg();
    //Non-static method needs Object reference to call method.

  }
}
