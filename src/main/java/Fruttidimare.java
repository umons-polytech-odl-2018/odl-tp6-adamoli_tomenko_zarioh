public class Fruttidimare implements Composant {
    private int prix;

    public Fruttidimare(int prix) {
        this.prix = prix;
    }

    @Override
    public int getPrize() {
        return this.prix;
    }
}
