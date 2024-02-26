public class Roturier extends Personne {
    protected int argent;

    public Roturier() {
        super(); // Appel au constructeur de la classe parente
        this.argent =  50;
    }
    public int production() {
        return argent /  10;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void impot(int montant) {
        argent -= montant;
    }
}

