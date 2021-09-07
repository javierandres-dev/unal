package model;

/**
 *
 * @author Johanna Zuluaga, Javier Andrés Garzón Patarroyo
 */
public class Meat {

    private String id;
    private String name;
    private String amount;
    private String animal;
    private String hair;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String value) {
        this.amount = value;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String value) {
        this.animal = value;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String value) {
        this.hair = value;
    }

    public String getMeat() {
        return amount + "Kg de " + name + " de " + animal + " " + hair + " pelo";
    }
}
