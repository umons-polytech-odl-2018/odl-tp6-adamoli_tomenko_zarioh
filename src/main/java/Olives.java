public class Olives implements Composant {
    private double prix;

    public Olives(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
