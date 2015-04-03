package basic.sort;

public class BubbleSort implements Sort {
  private int[] original;
  private int[] sorted;
  
  public BubbleSort(int[] list) {
    this.original = list;
  }

  @Override
  public int[] sort() {
    this.sorted = this.sort(this.original);
    return this.sorted;
  }
  
  private int[] sort(int[] list) {
    int[] sorted = list;
    for (int i = 1; i < sorted.length; i++) {
        for (int j = 0; j < sorted.length - i; j++) {
          if (sorted[j] > sorted[j+1]) {
            int temp = sorted[j+1];
            sorted[j+1] = sorted[j];
            sorted[j] = temp;
          }
        }
    }
    return sorted;
  }

  @Override
  public String toString() {
    
    StringBuilder sb = new StringBuilder();
    
    sb.append(getClass().getSimpleName() + "\n");
    
    /*
    sb.append("original: ");
    for (int item : this.original) {
      sb.append(" " + item);
    }
    sb.append("\n");
    */
    
    sb.append("  sorted: ");
    for (int item : this.sorted) {
      sb.append(" " + item);
    }
    sb.append("\n");
    
    return sb.toString();
  }
}
