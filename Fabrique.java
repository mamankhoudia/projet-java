
public class Fabrique {
//	private int capacite;
//	private int pdv;
//	public Fabrique() {
//		this.capacite=20;
//		this.pdv=40;
//	}
//	
//	public int getCapacite() {
//		return capacite;
//	}
//
//	public void setCapacite(int capacite) {
//		this.capacite = capacite;
//	}
//
//	public int getPdv() {
//		return pdv;
//	}
//
//	public void setPdv(int pdv) {
//		this.pdv = pdv;
//	}
//
//	public void crerPaysan() {
//		Roturier r1 = new Roturier();
//		
//	}
	public Paysan creerPaysan() {
		return new Paysan();
	}

	public Village creerVillage() {
		return new Village();
		
	}
}
