import java.util.ArrayList;

public class Margherita_Hut extends Margherita_Domino {
    public Margherita_Hut(ArrayList<Ingredient> ingredients){
        super(ingredients);
        ingredients.add(new Olives());
    }
}
