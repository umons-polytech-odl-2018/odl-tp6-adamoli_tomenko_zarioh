public class Margherita implements Composant {
    private int prix;

    public Margherita(int prix) {
        this.prix = prix;
    }

    @Override
    public int getPrize() {
        return this.prix;
    }
}
