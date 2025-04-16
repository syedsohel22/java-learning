public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
    
    // variable declaration and initialization
    int a = 10; // integer variable
    double b = 20.5; // double variable
    String c = "Hello"; // string variable
    boolean d = true; // boolean variable
    char e = 'A'; // character variable
    
    // variable usage
    System.out.println("The value of a is " + a);
    System.out.println("The value of b is " + b);
    System.out.println("The value of c is " + c); 
    System.out.println("The value of d is " + d);
    System.out.println("The value of e is " + e);
    
    // variable reassignment
    a = 15; // reassigning value to a
    b = 25.5; // reassigning value to b
    c = "World"; // reassigning value to c
    d = false; // reassigning value to d
    e = 'B'; // reassigning value to e
    
    // variable usage after reassignment
    System.out.println("After reassignment, the value of a is " + a);
    System.out.println("After reassignment, the value of b is " + b);
    System.out.println("After reassignment, the value of c is " + c);
    System.out.println("After reassignment, the value of d is " + d);
    System.out.println("After reassignment, the value of e is " + e);
    
    //  explanation of each line:
    // public class Main: This line declares a public class named Main. In Java, every application must have at least one class definition.
    // public static void main(String[] args): This line declares the main method, which is the entry point of any Java application. The main method must be declared as public and static.
    // System.out.println("Hello World"): This line prints the string "Hello World" to the console using the System.out.println() method.
    
    // String concatenation: The + operator is used to concatenate strings and variables. For example, "The value of a is " + a concatenates the string with the value of variable a.
    
    String name = "John"; // string variable
    String greeting = "Hello, " + name + "!"; // string concatenation
    System.out.println(greeting); // prints "Hello, John!"
    
    
    
  }
}