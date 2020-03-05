package proyecto;

public class Ingredient {
    private String name;
    private float quantity;
    public Ingredient(String name, float quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getData() {
        return String.format("Ingredient data:\nName: %s, Quantity: %f", this.name, this.quantity);
    }
}
