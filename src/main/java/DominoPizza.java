public class DominoPizza implements Pizzeria{
    private static DominoPizza instance=new DominoPizza();

    private DominoPizza(){}

    public static DominoPizza getInstance() {
        return instance;
    }
    public PizzaComposite createPizza(){
        return null;
    }
}
