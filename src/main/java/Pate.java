public class Pate implements Composant{
    private double prix;
    private String name;
    public Pate(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }

    @Override
    public String getName() {
        return name;
    }
}
