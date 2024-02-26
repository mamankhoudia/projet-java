public class Paysan extends Roturier {
    private int capacite;

    public Paysan() {
        super(); // Appel au constructeur de la classe parente
        this.capacite =  20;
    }
    // Accesseurs pour capacite
    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
