package basic;

import basic.utils.Titler;

public class Basic {
  public static void main(String[] args) {
    
    Titler titler = new Titler(30);

    // -------------------------------------------------------------------
    // hello world
    System.out.println();

    titler.display("Obligatory 'Hello, world!'");

    HelloWorld hello = new HelloWorld();
    hello.sayIt();


    // -------------------------------------------------------------------
    // Factorials
    titler.display("Factorial");
    Factorial fact = new Factorial();

    for (int i = 0; i < 20; i++) {
      System.out.printf("%2s! = %s\n", i, fact.factorialize(i));
    }


    // -------------------------------------------------------------------
    // Merge sort
    titler.display("Merge sort");
    int[] list = {5, 2, 4, 3, 1};
    BubbleSort sortList = new BubbleSort(list);

    sortList.sort();

    System.out.println(sortList.toString());

  }
}
