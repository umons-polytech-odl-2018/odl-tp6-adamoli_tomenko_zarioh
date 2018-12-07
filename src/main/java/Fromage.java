public class Fromage implements Composant {
    private double prix;

    public Fromage(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
