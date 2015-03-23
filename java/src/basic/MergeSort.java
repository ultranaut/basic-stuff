package basic;

import java.util.Formatter;

public class MergeSort {
  private String[] list;
  
  public MergeSort(String[] list) {
    this.list = list;
  }
  
  private int[] splitList(String[] list) {
    int firstPart = list.length / 2;
    System.out.println(firstPart);
    int secondPart = list.length - firstPart;
    int[] split = {firstPart, secondPart};
    return split;
  }
  
  public String toString() {
    int[] split = splitList(list);
    Formatter fmt = new Formatter();
    fmt.format("(%d, %d)", split[0], split[1]);
    
    return fmt.toString();
  }
  
}
