package oops;

class Singleton {
  //these are three steps to make a Singleton Class, and these three are main pillar.
  
  //static private variable
  static private Singleton instance;

  //private constructor
  private Singleton(){
    System.out.println("Object Created");
  }

  //public static method 
  public static Singleton getInstance(){
    if(instance == null){
      instance = new Singleton();
    }
    return instance;
  }
}

public class singleton_object {
  public static void main(String[] args) {
    Singleton obj1 = Singleton.getInstance();
    System.out.println(obj1);

    Singleton obj2 = Singleton.getInstance();

    //it return true, because both point to same memory reference
    System.out.println(obj2 == obj1);
  }
}

/*
Singleton Pattern Summary

1. Private Constructor
   - Prevents object creation from outside the class.
   - This is what stops multiple objects from being created.

2. Static Variable
   - Stores the single object of the class.
   - Since it is static, only one copy exists for the entire class.

3. Static Method (getInstance())
   - Provides controlled access to the object.
   - Creates the object only once and returns the same object every time.

Flow:
   First call  -> Object created and stored in instance.
   Next calls  -> Same object returned.

Result:
   obj1 and obj2 point to the same memory reference.

Key Idea:
   Control object creation and ensure only one object exists in the application.
*/