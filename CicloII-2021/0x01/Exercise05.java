import java.util.Scanner;

/**
 * El número de contagiados de Covid-19 en el país de NuncaLandia se duplica
 * cada día. Hacer un programa que diga el número total de personas que se han
 * contagiado cuando pasen D días a partir de hoy, si el número de contagiados
 * actuales es C.
 */
public class Exercise05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese número de días a partir de hoy: ");
    int nDays = sc.nextInt();
    System.out.print("Ingrese número de contagiados actuales: ");
    int currentInfected = sc.nextInt();
    sc.close();
    int totalInfected = (2 * currentInfected) * nDays;
    System.out.print("El número total de personas contagiadas cuando hayan ");
    System.out.print("transcurrido " + nDays + " días será de " + totalInfected);
  }
}
