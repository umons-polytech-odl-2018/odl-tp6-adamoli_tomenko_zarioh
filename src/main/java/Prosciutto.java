public class Prosciutto implements Composant {
    private double prix;

    public Prosciutto(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
