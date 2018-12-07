import java.util.ArrayList;

public class FruttiDiMare_Hut extends FruttiDiMare_Domino {
    public FruttiDiMare_Hut(ArrayList<Ingredient> ingredients){
        super(ingredients);
        ingredients.add(new Olives());
    }
}
