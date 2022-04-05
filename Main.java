import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("wpisz text");
    Scanner myObj = new Scanner(System.in);
    String text = myObj.nextLine();
    text = text.replace(" ","_");
    System.out.println(text);
  }
}
