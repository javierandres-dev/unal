import java.util.Scanner;

/**
 * Diseñe una función que calcule la cantidad de carne de aves en kilos si se
 * tienen N gallinas, M gallos y K pollitos cada uno pesando 6 kilos, 7 kilos y
 * 1 kilo respectivamente.
 *
 */
public class Exercise02 {

  public static double calculateAmountOfMeat(String animal, double amount) {
    double res = 0;
    if (animal == "hens") {
      res = amount * 6;
    } else if (animal == "roosters") {
      res = amount * 7;
    } else if (animal == "chicks") {
      res = amount * 1;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el número de gallinas: ");
    double hens = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese el número de gallos: ");
    double roosters = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese el número de pollitos: ");
    double chicks = Double.parseDouble(sc.nextLine());
    sc.close();
    double hensWeight = calculateAmountOfMeat("hens", hens);
    double roostersWeight = calculateAmountOfMeat("roosters", roosters);
    double chicksWeight = calculateAmountOfMeat("chicks", chicks);
    System.out.println("\nCantidad de carne de gallina: " + hensWeight + "Kgs");
    System.out.println("Cantidad de carne de gallo: " + roostersWeight + "Kgs");
    System.out.println("Cantidad de carne de pollitos: " + chicksWeight + "Kgs");
    System.out.print("Cantidad total de carne de aves: " + (hensWeight + roostersWeight + chicksWeight) + "Kgs");
  }
}
