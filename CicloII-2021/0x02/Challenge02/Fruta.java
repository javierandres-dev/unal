package Challenge02;

public class Fruta extends Producto {

  public String color;

  public Fruta(long identificador, String nombre, int cantidad, String color) {
    super(identificador, nombre, cantidad);
    this.color = color;
  }

  @Override
  public String toString() {
    return "\tFruta - Id: " + id + "\n\tCantidad: " + amount + " items" + "\n\tNombre: " + name + "\n\tColor: " + color;
  }
}
