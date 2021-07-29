
/* Dado un carácter, determine si el código ASCII es par o no. */
import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un caracter: ");
    char c = sc.next().charAt(0);
    sc.close();
    System.out.print("El contenido de la variable c es: " + c);
  }
}
