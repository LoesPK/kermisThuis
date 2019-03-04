package weekOpdrachtKermis;

public class Spin extends Attractie implements Risicovol{

	Spin(String naam, double prijs) {
		super(naam, prijs);
	}
	
	public boolean opstellingsKeuring(){
		return true;
	}
	
}
