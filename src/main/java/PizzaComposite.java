import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PizzaComposite implements Composant{

    protected String name;
    protected Collection ingredients;

    public PizzaComposite(){

    }

    public PizzaComposite(String name) {
        ingredients = new ArrayList();
        this.name = name;
    }

    public void add(Composant composant){

        ingredients.add(composant);
    }


    public void remove(Composant composant){
        ingredients.remove(composant);
    }

    public Iterator getIngredients() {
        return ingredients.iterator();
    }

    /*protected void setPimp(double prix){
        this.prix += prix;
    }*/

    @Override
    public double getPrize() {
        int result = 0;
        for (Iterator i = ingredients.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            Composant composant = (Composant)objet;

            result += composant.getPrize();
        }
        return result;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "pizza: "+name+", prix: ";
    }
}
