/* Input examples:
1&Fruta&1&Granadilla&13&Azul
1&Fruta&2&Manzana Verde&567&AVerde
1&Carne&937&Carne de res&1254&Vaca&true
2
3 */
package Challenge02;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

  public static void main(String[] args) {
    ArrayList<Fruta> fruits = new ArrayList<Fruta>();
    ArrayList<Carne> meats = new ArrayList<Carne>();
    Scanner sc = new Scanner(System.in);
    byte option;

    do {
      String line = sc.nextLine();
      if (line.length() == 1 && line.startsWith("3")) {
        option = 3;
      } else if (line.length() == 1 && line.startsWith("2")) {
        option = 2;
      } else if (line.length() > 1 && line.startsWith("1")) {
        option = 1;
      } else {
        option = 0;
      }

      switch (option) {
        case 1:
          String[] arr = line.split("&");
          String type = arr[1];
          long id = Long.parseLong(arr[2]);
          String name = arr[3];
          int amount = Integer.parseInt(arr[4]);

          if (type.equals("Fruta") && arr.length == 6) {
            String color = arr[5];
            Fruta fruit = new Fruta(id, name, amount, color);
            fruits.add(fruit);
          } else if (type.equals("Carne") && arr.length == 7) {
            String animal = arr[5];
            boolean animalHair = Boolean.parseBoolean(arr[6]);
            Carne meat = new Carne(id, name, amount, animal, animalHair);
            meats.add(meat);
          } else {
            // System.out.println("Invalid line");
            break;
          }
          break;
        case 2:
          System.out.println("***Inventario de productos***");
          for (byte i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
          }
          for (byte i = 0; i < meats.size(); i++) {
            System.out.println(meats.get(i));
          }
          break;
        case 3:
          break;
        default:
          // System.out.println("Invalid option");
          break;
      }
    } while (option != 3);
    sc.close();
  }
}
