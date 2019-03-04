package weekOpdrachtKermis;

public class Kermis {
	private double kassa;
	private int aantalKaartjes;
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
		System.out.println(attractie.attracties.get(prompter.keuze-1).draaien(prompter.keuze));
		this.kassa += attractie.attracties.get(prompter.keuze-1).getPrijs();
		System.out.println("De kassa van de kermis heeft €" + this.kassa + " in de kassa");
	}

}
