import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PizzaComposite implements Composant {

    private Collection children;

    public PizzaComposite() {
        children = new ArrayList();
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

    @Override
    public double getPrize() {
        int result = 0;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            Composant composant = (Composant)objet;

            result += composant.getPrize();
        }
        return result;
    }
}
