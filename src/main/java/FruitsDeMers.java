public class FruitsDeMers implements Composant {
    private double prix;

    public FruitsDeMers(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
