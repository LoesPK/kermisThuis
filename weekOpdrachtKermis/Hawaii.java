package weekOpdrachtKermis;

public class Hawaii extends Attractie implements Risicovol{

	Hawaii(String naam, double prijs) {
		super(naam, prijs);
	}
	
	public boolean opstellingsKeuring(){
		return true;
	}

}
