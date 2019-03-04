package weekOpdrachtKermis;

public class Kermis {
	private double kassa;
	private 
	Prompter prompter = new Prompter();
	Attractie attractie = new Attractie("", 0);
	
	public void kermisTonen() {
		
		attractie.attractieList();
		
		while(true) {
			prompter.starten();
			keuzeMaken();
		}
	}
	
	
	
	public void keuzeMaken() {
		System.out.println(attractie.attracties.get(prompter.keuze-1).draaien());
		kassa += attractie.attracties.get(prompter.keuze-1).getPrijs();
		System.out.println(this.kassa);
	}

}
