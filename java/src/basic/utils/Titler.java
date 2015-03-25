package basic.utils;

import java.util.Arrays;
import java.util.Formatter;

public class Titler {
  int width;

  public Titler() {
    this.width = 80;
  }
  
  public Titler(int width) {
    this.width = width;
  }
  
  private String rule() {
    Formatter str = new Formatter();
    String rule;
    
    // gotta be a simpler way...
    char[] chars = new char[this.width];
    Arrays.fill(chars, '-');
   
    str.format("%s", new String(chars));
    
    rule = str.toString();
    str.close();
    
    return rule;
  }
  
  public void display(String heading) {
    Formatter str = new Formatter();
    
    str.format("\n\n%s\n%s", heading, this.rule());
    System.out.println(str.toString());
    str.close();
  }
}
