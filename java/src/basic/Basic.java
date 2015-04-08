package basic;

import basic.sort.*;
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
    int[] list = {3, 7, 8, 6, 2, 1, 9, 5, 4};

    MergeSort sortList = new MergeSort(list);

    sortList.sort();

    System.out.println(sortList.toString());


    // -------------------------------------------------------------------
    // Quick sort

    titler.display("QuickSort");
    int[] quicklist = {3, 7, 8, 6, 2, 1, 9, 5, 4};

    QuickSort quicksort = new QuickSort(quicklist);

    quicksort.sort();

    System.out.println(quicksort.toString());


  }
}
