public class PanDecorator extends PizzaDecorator{
    public PanDecorator(PizzaComposite decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getPrize(){
        return decoratedPizza.getPrize() + 1.5;
    }

    @Override
    public String getName(){
        return "Pan " + decoratedPizza.getName();
    }
}
