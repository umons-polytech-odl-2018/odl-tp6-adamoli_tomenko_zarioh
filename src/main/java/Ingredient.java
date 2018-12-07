public class Ingredient implements Composant {
    private double prix;
    private String name;

    public Ingredient(String name, double prix) {
        this.prix = prix;
        this.name = name;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Food{"+"name="+'\''+", price=" + prix+ '}';
    }
}
