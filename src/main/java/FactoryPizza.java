import

public abstract class FactoryPizza {
    public static FactoryPizza getFactory (String name){
        switch (name){
            case("Hut"):
                return PizzaHut.getFactory();
            case("Domino"):
                return DominoPizza.getFactory();
            default:
                return null;
        }
    }

    public abstract PizzaComposite createPizza (String name);
}
