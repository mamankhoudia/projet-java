import java.util.List;

public class Village {
	private int age;
	public String nom;
	public List <Roturier> paysans;
	public static int caisseImpot;
	
	// construicteur
	public Village(int age, String nom, List<Roturier> paysans) {
		this.age = age;
		this.nom = nom;
		this.paysans = paysans;
	}
	

	public Village(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
		paysans.add(new Paysan());
	}



	public int getAge() {
		return getAge(); // pour retourner l'age			
	}
	
	public void  vieillir() {
		age++;
	}
	public void production () {}
	
	
	public void impot (int montant) {
		caisseImpot-=montant;
		Royaume.caisse+=montant;
		
	}
}
