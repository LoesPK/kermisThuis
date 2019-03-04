package weekOpdrachtKermis;

public class Spin extends RisicoVolleAttracties{
	
	Spin(String naam, double prijs) {
		super(naam, prijs);
	}
	
	public boolean opstellingsKeuring(){
		return true;
	}
	
	public int draaiLimiet() {
		return 5;
	}

	@Override
	boolean opstellingskeuring() {
		return true;
	}
	
}
