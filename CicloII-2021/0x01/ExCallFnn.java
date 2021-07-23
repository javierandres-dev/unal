import java.util.Scanner;

public class ExCallFnn {
  public static double fn(double x, double y) {
    return Math.pow(x, y);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese primer número: ");
    double a = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese segundo número: ");
    double b = Double.parseDouble(sc.nextLine());
    sc.close();
    System.out.print("El resultado es: " + fn(a, b));
  }
}
