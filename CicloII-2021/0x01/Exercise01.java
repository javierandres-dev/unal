import java.util.Scanner;

/**
 * Área de un rectángulo
 */
public class Exercise01 {
  public static double area_rectangle(double w, double l) {
    return w * l;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el ancho: ");
    double width = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese el largo: ");
    double length = Double.parseDouble(sc.nextLine());
    sc.close();
    double res = area_rectangle(width, length);
    System.out.print("El área del rectangulo es: " + res);
  }
}
