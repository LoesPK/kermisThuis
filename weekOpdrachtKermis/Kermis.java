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
			prompter.kaartOfOmzet();
			switch(prompter.kaartOfOmzet()) {
				case "O": omzetTonen();
				default: System.out.println("maak een keuze");
			}
		}
	}
	
	
	
	public void keuzeMaken() {
		System.out.println(attractie.attracties.get(prompter.keuze-1).draaien(prompter.keuze));
		this.kassa += attractie.attracties.get(prompter.keuze-1).getPrijs();
		this.aantalKaartjes++;
		System.out.println("De kermis heeft in totaal " + this.aantalKaartjes + " kaartjes verkocht voor haar attracties en daarmee €" + this.kassa + " verdiend." );
	}

	public void omzetTonen() {
		System.out.println("De kermis heeft in totaal €" + this.kassa + " verdiend." );
		for(Attractie a : attractie.attracties) {
			System.out.println(a.getNaam() + " heeft €" + a.getKassa() + " verdiend.");
		}
	}
	
}
