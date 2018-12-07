public class Prosciutto implements Composant {
    private int prix;

    public Prosciutto(int prix) {
        this.prix = prix;
    }

    @Override
    public int getPrize() {
        return this.prix;
    }
}
