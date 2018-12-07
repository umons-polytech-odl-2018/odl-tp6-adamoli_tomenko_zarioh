public class Jambons implements Composant {
    private double prix;
    private String name;

    public Jambons(double prix) {
        this.prix = prix;
    }

    @Override
    public double getPrize() {
        return this.prix;
    }

    @Override
    public String getName() {
        return name;
    }
}
