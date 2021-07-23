import java.util.Scanner;

/**
 * Mi mamá me manda a comprar P panes a $300 cada uno, M bolsas de leche a $3300
 * cada una y H huevos a $350 cada uno. Hacer un programa que me diga las
 * vueltas (o lo que quedo debiendo) cuando me da un billete de B pesos.
 */
public class Exercise03 {
  public static double getSubtotal(double amount, double unitValue) {
    return amount * unitValue;
  }

  public static double balance(double xBread, double xMilk, double xEgg, double paid) {
    double subtotal = 0;
    subtotal += getSubtotal(xBread, 300);
    subtotal += getSubtotal(xMilk, 3300);
    subtotal += getSubtotal(xEgg, 350);
    return paid - subtotal;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese cantidad de panes: ");
    double breadAmount = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese cantidad de bolsas de leche: ");
    double milkAmount = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese cantidad de huevos: ");
    double eggAmount = Double.parseDouble(sc.nextLine());
    System.out.print("Ingrese el valor pagado: ");
    double amountPaid = Double.parseDouble(sc.nextLine());
    sc.close();
    double res = balance(breadAmount, milkAmount, eggAmount, amountPaid);
    if (res < 0) {
      System.out.print("Debe: $" + res);
    } else {
      System.out.print("Su cambio es de: $" + res);
    }
  }
}
