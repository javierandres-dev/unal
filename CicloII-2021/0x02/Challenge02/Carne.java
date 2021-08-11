package Challenge02;

public class Carne extends Producto {

  String animal;
  String animalHair;

  public Carne(long identificador, String nombre, int cantidad, String animal, boolean pelo) {
    super(identificador, nombre, cantidad);
    this.animal = animal;
    this.animalHair = pelo ? "Si" : "No";
  }

  @Override
  public String toString() {
    return "\tCarne - Id: " + id + "\n\tCantidad: " + amount + " Kg" + "\n\tNombre: " + name + "\n\tAnimal: " + animal
        + "\n\tTiene pelo: " + animalHair;
  }
}
