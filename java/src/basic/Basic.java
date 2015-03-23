package basic;

public class Basic {
  public static void main(String[] args) {

    // hello world
    HelloWorld hello = new HelloWorld();
    hello.sayIt();

    System.out.print(String.format("\n\n%60s\n\n", "").replace(' ', '-'));

    Factorial fact = new Factorial();
    
    long factResult = fact.factorialize(5);
    System.out.println(factResult);

  }
}
