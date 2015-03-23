package basic;

public class Basic {
  public static void main(String[] args) {

    // hello world
    HelloWorld hello = new HelloWorld();
    hello.sayIt();

    // -------------------------------------------------------------------
    System.out.print(String.format("\n\n%60s\n\n", "").replace(' ', '-'));

    Factorial fact = new Factorial();

    long factResult = fact.factorialize(5);
    System.out.println(factResult);

    // -------------------------------------------------------------------
    System.out.print(String.format("\n\n%60s\n\n", "").replace(' ', '-'));

    int[] sortList = {5, 2, 4, 3, 1};
    MergeSort sort = new MergeSort(sortList);
    int[] sorted = sort.sort();

    StringBuilder sb = new StringBuilder();
    sb.append("sorted list: ");
    for (int item : sorted) {
      sb.append(" " + item);
    }
    System.out.println(sb.toString());

  }
}
