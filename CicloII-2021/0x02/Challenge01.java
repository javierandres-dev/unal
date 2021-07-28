
/* Los hermanos Skywalker fueron capturados por el Imperio y tu trabajo es
hallar en que bases del imperio se encuentran ellos y definir la dificultad de
poder rescatarlos y entregar esta información a la alianza rebelde.

La alianza rebelde le indica a Han debe dirigirse a una estación espacial
identificada con un numero natural que le informaran en el momento adecuado
pues el imperio tiene un Código en java para hallar la ubicación de los
hermanos Skywalker. La alianza identifica que para poder determinar el número
de la base imperial donde se encuentran los hermanos Han debe hacer lo
siguiente:

Si a el número de base en la que se encuentra Luke se le resta cuatro será
igual a dos veces el identificador de la base inicial que se le informara a Han
en el momento adecuado cuando se pueda hackear la computadora central del
imperio y será introducido a la consola del Alcón Milenario.
Luego para encontrar a Leia, Han deberá sumar los identificadores de la base
informada y la base donde se encuentra Luke y esto le dará el numero de la base
imperial donde esta Leia pero multiplicado por cinco.
Ya con esta información Han deberá clasificar la base donde se encuentra Leia e
informarla para esto el deberá tener en cuenta lo siguiente:

Si el numero de la base esta entre 0 y 20 esta será clasificada como tipo uno.
Si el numero de la base esta entre 21 y 30 esta será clasificada como tipo dos.
Si el numero de la base esta entre 31 y 50 esta será clasificada como tipo tres.
Y finalmente, si el numero de la base es mayor que 50 esta será clasificada
como tipo cuatro.
Luego de realizar esta tarea Han deberá enviar un mensaje que informará su base
imperial de partida y las de los hermanos Skywalker separada por un espacio y
en una nueva línea del mensaje indicar el tipo de base en la que se encuentra
Leia.

Entrada

La entrada es un número natural que identifica a la base imperial a la cual han
debe dirigirse.

Salida

Tres números naturales separados por un espacio que informara la base imperial
de partida de Han y las de los hermanos Skywalker separada por un espacio y en
una nueva línea del mensaje indicar el tipo de base en la que se encuentra Leia
(uno, dos, tres o cuatro). */
import java.util.Scanner;

public class Challenge01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int HanTarget = sc.nextInt();
    sc.close();
    int LukeSkywalker = HanTarget * 2 + 4;
    int LeiaSkywalker = (HanTarget + LukeSkywalker) / 5;
    String classification = "";
    if (LeiaSkywalker > 50) {
      classification = "cuatro";
    } else if (LeiaSkywalker > 30 & LeiaSkywalker <= 50) {
      classification = "tres";
    } else if (LeiaSkywalker > 20 & LeiaSkywalker <= 30) {
      classification = "dos";
    } else if (LeiaSkywalker >= 0 & LeiaSkywalker <= 20) {
      classification = "uno";
    }
    System.out.print(HanTarget + " " + LukeSkywalker + " " + LeiaSkywalker + "\n" + classification);
  }
}
