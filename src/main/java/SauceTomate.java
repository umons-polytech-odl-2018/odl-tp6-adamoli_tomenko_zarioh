public class SauceTomate implements Composant {
    private double prix;

    public SauceTomate(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
