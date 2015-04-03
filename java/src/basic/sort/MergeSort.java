package basic.sort; 

public class MergeSort implements Sort {
  private int[] original;
  private int[] sorted;
  
  public MergeSort(int[] list) {
    this.original = list;
  }
  
  /* (non-Javadoc)
   * @see basic.Sort#sort()
   */
  @Override
  public int[] sort() {
    this.sorted = this.sort(this.original);
    return this.sorted;
  }
  
  private int[] sort(int[] list) {
    if (list.length < 2) {
      return list;
    } else {
      int[][] subs = splitList(list);
      return merge(sort(subs[0]), sort(subs[1]));
    }
  }
  
  private int[] merge(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    while (true) {
      if (left[i] < right[j]) {
        merged[k] = left[i];
        i++;
      } else {
        merged[k] = right[j];
        j++;
      }
      k++;
      if (i == left.length || j == right.length) {
        break;
      }
    }
    
    while (i < left.length) {
      merged[k] = left[i];
      i++;
      k++;
    }
    
    while (j < right.length) {
      merged[k] = right[j];
      j++;
      k++;
    }
    
    return merged;
  }
  
  // pretty sure this is probably *not* the way to do it
  private int[][] splitList(int[] list) {
    // figure out the lengths of the two split arrays
    int lenSubA = list.length / 2;
    int lenSubB = list.length - lenSubA;
    
    int[] subA = new int[lenSubA];
    int[] subB = new int[lenSubB];

    System.arraycopy(list, 0, subA, 0, lenSubA);
    System.arraycopy(list, lenSubA, subB, 0, lenSubB);
    
    
    int[][] split = {subA, subB};
    return split;
  }


  /* (non-Javadoc)
   * @see basic.Sort#toString()
   */
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
