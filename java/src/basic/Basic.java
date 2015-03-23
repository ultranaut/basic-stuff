package basic;

public class Basic {
  public static void main(String[] args) {

    // hello world
    System.out.println("Obligatory 'Hello, world!'");
    HelloWorld hello = new HelloWorld();
    hello.sayIt();

    // -------------------------------------------------------------------
    System.out.print(String.format("\n\n%60s\n\n", "").replace(' ', '-'));

    System.out.println("Factorial");
    Factorial fact = new Factorial();

    for (int i = 0; i < 20; i++) {
      System.out.printf("%2s! = %s\n", i, fact.factorialize(i));
    }
    

    // -------------------------------------------------------------------
    System.out.print(String.format("\n\n%60s\n\n", "").replace(' ', '-'));

    System.out.println("Merge sort");
    int[] list = {5, 2, 4, 3, 1};
    SortableList sortList = new SortableList(list);
    
    int[] sorted = sortList.sort();
    
    System.out.println(sortList.toString());

  }
}
