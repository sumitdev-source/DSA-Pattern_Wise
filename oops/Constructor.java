package oops;

class B {
  int age;
  String name;
  String grade;

  int marks;
  String remarks;

  //default constructor, it is called automatically ,even if you dont make constructor.
  B(){
    System.out.println("Constructor is executed");
  }

  //if the instance variable name is different than Constructor Parameters variables,then we dont need "this" keyword.
  B(int mark, String remark){
      marks = mark;
      remarks = remark;
  }

  //if the instance variable name is same as Constructor Parameters variables,then we need "this" keyword.
  B(int age, String name, String grade){
    this.age = age;
    this.name = name;
    this.grade = grade;
  }

  //copy constructor
  B(B s){
    age = s.age;
    name = s.name;
    grade = s.grade;
  }

  //+ ", marks: " + marks + ", remarks: " + remarks + 
  public String toString(){
    return "B{" + "age: " + age + ", name: " + name + ", Grade: " + grade + "}";
    } 
  }


public class Constructor {
  public static void main(String[] args) {
    //1. Default constructor is called
    B s1 = new B();
    System.out.println(s1);

    //2. Parametrized Constructor
    B s2 = new B(4, "A", "F");
    System.out.println(s2);

    //3. Copy Constructor
    B s3 = new B(s2);
    System.out.println(s2);

  }

}


/*
Here we see about Constructor:
-> Constructor is special method which is used to initiliaze object, does not return any thing.
-> Constructor can be overloaded , for example see the class B , there multiple types of constructor with different parameters.
-> Constructor can't be overridden, because Overriding needs inheritance, but child class can't inherit constructor of parent class.
-> Constructor can be private, real life example is Singleton Class
*/
