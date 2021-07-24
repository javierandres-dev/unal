import java.util.Scanner;

/**
 * Si pido prestados P cantidad de pesos para pagarlos en dos meses, si el
 * interés del préstamo es del 3%. ¿Cuánto se debe pagar al final del segundo
 * mes si el interés es compuesto mensualmente?.
 */
public class Exercise04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el valor del prestamo: ");
    double loan = Double.parseDouble(sc.nextLine());
    sc.close();
    byte interestRate = 3;
    byte months = 2;
    double monthInterest = (loan * interestRate) / 100;
    double pay = loan + (monthInterest * months);
    System.out.print("Al final del segundo mes deberá pagar: " + pay);
  }
}
