public class Carbonara implements Composant{
    private int prix;

    public Carbonara(int prix) {
        this.prix = prix;
    }

    @Override
    public int getPrize() {
        return this.prix;
    }
}
