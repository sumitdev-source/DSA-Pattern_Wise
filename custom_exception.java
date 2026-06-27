class InvalidAgeException extends RuntimeException {
  InvalidAgeException(String message){
      super(message);
}

}

public class custom_exception {
  static void checkBalance(int age) throws InvalidAgeException{
    if(age < 18){
      throw new InvalidAgeException("Age can't be eligible");
    }
    System.out.println("valid Age");
  }
  public static void main(String[] args) {
    checkBalance(15);
  }
}
