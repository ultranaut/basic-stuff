package basic;

public class Factorial {
  private long n;
  
  public long factorialize(long n) {
    if (n < 2) {
      return 1;
    } else {
      return n * factorialize(n - 1);
    }
  }
}
