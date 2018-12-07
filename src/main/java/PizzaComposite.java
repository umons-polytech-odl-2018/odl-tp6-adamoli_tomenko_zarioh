import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PizzaComposite implements Composant{

    private String name;
    private Collection children;
    private double prix;


    public PizzaComposite(String name) {
        children = new ArrayList();
        this.name = name;
        prix = 0;
    }


    public void add(Composant composant){

        children.add(composant);
    }


    public void remove(Composant composant){
        children.remove(composant);
    }

    public Iterator getChildren() {
        return children.iterator();
    }

    protected void setPimp(double prix){
        this.prix += prix;
    }

    @Override
    public double getPrize() {
        double result = prix;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
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
