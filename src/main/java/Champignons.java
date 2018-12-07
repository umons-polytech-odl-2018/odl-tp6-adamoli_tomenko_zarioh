public class Champignons implements Composant {
    private double prix;

    public Champignons(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
