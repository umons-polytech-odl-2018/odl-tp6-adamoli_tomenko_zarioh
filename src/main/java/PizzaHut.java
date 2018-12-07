public class PizzaHut implements Pizzeria {

    public Composant createPizza(String name){
        return new PizzaComposite(name);
    }
}
