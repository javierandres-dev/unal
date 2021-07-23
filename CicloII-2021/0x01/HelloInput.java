import java.util.Scanner;

public class HelloInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese su nombre: ");
    String name = sc.nextLine();
    sc.close();
    System.out.print("Hello, " + name);
  }
}
