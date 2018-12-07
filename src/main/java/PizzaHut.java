public class PizzaHut {

    private static PizzaHut instance=new PizzaHut();

    private PizzaHut(){}

    private static PizzaHut getInstance(){
        return instance;
    }
}
