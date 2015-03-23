package basic;

public class HelloWorld {
  private String greeting;
  private String recipient;
  
  public HelloWorld() {
    this("Hello", "world");
  }
  
  public HelloWorld(String recipient) {
    this("Hello", recipient);
  }
  
  public HelloWorld(String greeting, String recipient) {
    this.greeting = greeting;
    this.recipient = recipient;
  }
  
  public void sayIt() {
    System.out.printf("%s, %s!\n", greeting, recipient);
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }
}
