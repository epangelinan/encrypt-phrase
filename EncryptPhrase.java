import java.io.Console;

public class EncryptPhrase {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please enter a sentence and I will encrypt it!");
    String sentence = myConsole.readLine();
    String myEncryptedResults = sentence.replaceAll("a", "anthony p");
    System.out.println("Encrypted message is: " + myEncryptedResults);
  }
}
