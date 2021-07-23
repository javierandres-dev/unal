import java.util.Scanner;

public class ExCallFn {
  public static double fn(double x) {
    return x * x;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    double x = Double.parseDouble(sc.nextLine());
    sc.close();
    System.out.print("El resultado es: " + fn(x));
  }
}
