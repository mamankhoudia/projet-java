import java.util.Arrays;
import java.util.List;


public class Royaume {
	private int age;
	public List <Village> Village ;
	public static int caisse;
	public int getAge() {
		return age;
	}
	
	public Royaume(int age) {
		
		this.age = age;
		
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void impot( int montant) {
		Royaume.caisse-=montant;
		
	}
	public void production(){};
	public void vieillir() {
		age++;
		
	}
	public Roturier ajoutHabitant(Roturier r) {
		return r;
		
		
	}
	
	

}
