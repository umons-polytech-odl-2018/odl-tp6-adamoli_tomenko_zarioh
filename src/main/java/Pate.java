public class Pate implements Composant{
    private double prix;

    public Pate(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
