import java.util.ArrayList;

public class Carbonara_Hut extends Carbonara_Domino {
    public Carbonara_Hut(ArrayList<Ingredient> ingredients){
        super(ingredients);
        ingredients.add(new Olives());
    }
}
