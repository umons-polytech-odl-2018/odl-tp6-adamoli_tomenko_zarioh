public class CremeBlanche implements Composant {
    private double prix;

    public CremeBlanche(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }
}
