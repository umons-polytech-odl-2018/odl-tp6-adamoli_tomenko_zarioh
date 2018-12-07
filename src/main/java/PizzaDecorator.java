public class PizzaDecorator implements Composant {
    protected PizzaComposite decoratedPizza;

    public PizzaDecorator(PizzaComposite decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public double getPrize() {
        return decoratedPizza.getPrize();
    }

    @Override
    public String getName() {
        return decoratedPizza.getName();
    }
}
