public class PizzaHut implements Pizzeria {
    private static PizzaHut instance=new PizzaHut();
    private PizzaHut(){}
    public static PizzaHut getInstance() {
        return instance;
    }

    public Composant createPizza(String name){
        return new PizzaComposite(name);
    }
}
