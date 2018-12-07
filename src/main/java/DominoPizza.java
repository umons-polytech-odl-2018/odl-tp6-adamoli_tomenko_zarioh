public class DominoPizza implements AbstratFactory{
    private static DominoPizza instance=new DominoPizza();

    private DominoPizza(){}

    public static DominoPizza getInstance() {
        return instance;
    }
    public PizzaComposite createPizza(){
        return null;
    }
}
