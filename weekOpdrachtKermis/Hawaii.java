package weekOpdrachtKermis;

public class Hawaii extends RisicoVolleAttracties{
	
	
	Hawaii(String naam, double prijs) {
		super(naam, prijs);
	}
	
	public boolean opstellingsKeuring(){
		return true;
	}
	
	public int draaiLimiet() {
		return 10;
	}

	@Override
	boolean opstellingskeuring() {
		
		return true;
	}

}
