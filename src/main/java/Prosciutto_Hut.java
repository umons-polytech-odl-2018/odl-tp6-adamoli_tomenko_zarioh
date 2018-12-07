import java.util.ArrayList;

public class Prosciutto_Hut extends Prosciutto_Domino {
    public Prosciutto_Hut(ArrayList<Ingredient> ingredients){
        super(ingredients);
        ingredients.add(new Olives());
    }
}
