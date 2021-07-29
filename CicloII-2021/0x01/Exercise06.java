
/* Dado un número entero, determinar si ese número corresponde al
código ASCII de una vocal minúscula. */
import java.util.Scanner;

public class Exercise06 {
  public static boolean isLowerVowel(int n) {
    int[] vowelCodes = { 97, 101, 105, 111, 117 };
    for (int i : vowelCodes) {
      if (n == i) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int x = sc.nextInt();
    sc.close();
    if (isLowerVowel(x)) {
      System.out.print("Si corresponde");
    } else {
      System.out.print("No corresponde");
    }
  }
}
