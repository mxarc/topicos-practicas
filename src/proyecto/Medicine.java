package proyecto;

import java.util.ArrayList;

public class Medicine {
    private String name;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Medicine(String name, String ingredient, float quantity){
        this.name = name;
        this.ingredients.add(new Ingredient(ingredient, quantity));
    }

    public String getData() {
        return String.format("Medicine information:\nName: %s", this.name);
    }

}
