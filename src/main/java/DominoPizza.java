public class DominoPizza implements Pizzeria{
    private static DominoPizza instance=new DominoPizza();

    private DominoPizza(){}

    public static DominoPizza getInstance() {
        return instance;
    }
    public Composant createPizza(String name){
        return new PizzaComposite(name);
    }
}
