public class SauceTomate implements Composant {
    private double prix;
    private String name;

    public SauceTomate(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }

    @Override
    public String getName() {
        return null;
    }
}
