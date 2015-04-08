package basic.sort;

public class QuickSort implements Sort {
  private int[] original;
  private int[] sorted;
  
  public QuickSort(int[] list) {
    this.original = list;
    this.sorted = list.clone();
  }
  
  @Override
  public int[] sort() {
    this.sort(0, this.sorted.length);
    return this.sorted;
  }
  
  public int[] sort(int lo, int hi) {
    if (hi - lo < 2) {
      return this.sorted;
    }
    
    // choose a pivot
    int pivotIndex = this.choosePivot(lo, hi);
    int pivotValue = this.sorted[pivotIndex];
    
    // move the pivot to end of list by swapping
    int temp = pivotValue;
    this.sorted[pivotIndex] = this.sorted[hi - 1];
    this.sorted[hi - 1] = temp;
    
    //
    int swapIndex = lo;
    
    for (int i = lo; i < hi - 1; i++) {
      if (this.sorted[i] < pivotValue) {
        temp = this.sorted[swapIndex];
        this.sorted[swapIndex] = this.sorted[i];
        this.sorted[i] = temp;
        swapIndex++;
      }
    }
    temp = this.sorted[swapIndex];
    this.sorted[swapIndex] = this.sorted[hi - 1];
    this.sorted[hi - 1] = temp;
    
    this.sort(lo, swapIndex);
    this.sort(swapIndex + 1, hi);
    
    return this.sorted;
  }
  
  private int choosePivot(int lo, int hi) {
    return (hi - lo) / 2  + lo;
  }
  
  /* (non-Javadoc)
   * @see basic.Sort#toString()
   */
  @Override
  public String toString() {
    
    StringBuilder sb = new StringBuilder();
    
    //sb.append(getClass().getSimpleName() + "\n");
    
    sb.append("original: ");
    for (int item : this.original) {
      sb.append(" " + item);
    }
    sb.append("\n");

    sb.append("  sorted: ");
    for (int item : this.sorted) {
      sb.append(" " + item);
    }
    sb.append("\n");

    
    return sb.toString();
  }

}
