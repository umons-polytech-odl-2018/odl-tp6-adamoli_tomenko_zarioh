public class Jambons implements Composant {
    private double prix;

    public Jambons(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
