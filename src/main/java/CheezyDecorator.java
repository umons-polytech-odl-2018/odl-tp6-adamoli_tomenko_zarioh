public class CheezyDecorator extends PizzaDecorator{
    public CheezyDecorator(PizzaComposite decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getPrize(){
        return decoratedPizza.getPrize() + 2;
    }

    @Override
    public String getName(){
        return "Cheezy " + decoratedPizza.getName();
    }
}
