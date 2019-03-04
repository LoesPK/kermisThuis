package weekOpdrachtKermis;

public class Kermis {
	private double kassa;
	private int aantalKaartjes;
	Prompter prompter = new Prompter();
	Attractie attractie = new Attractie("", 0);
	
	public void kermisTonen() {
		
		System.out.println("welkom op de kermis");
		attractie.attractieList();
		for(Attractie a: attractie.attracties) {
			if( a instanceof RisicoVolleAttracties) {
				System.out.println(a.getNaam() + " moet eerst een keuring hebben.");
			}
		}
		
		while(true) {
			System.out.println(prompter.starten());
			prompter.keuzeMaken();
			switch(prompter.keuzeStart) {
				case "A": 
				int keuze = prompter.attractieRijden();
				System.out.println(keuze);
				
					rijden();
				

				continue;
				case "O": omzetTonen();
				continue;
				case "K": kaartenTonen();
				continue;
				default: System.out.println("maak een keuze");
				break;
			}
		}
	}
	
	
	
	public void rijden() {
		try {
		System.out.println(attractie.attracties.get(prompter.keuze-1).draaien(prompter.keuze));
		this.kassa += attractie.attracties.get(prompter.keuze-1).getPrijs();
		this.aantalKaartjes++;
		} catch (Exception e) {
			System.out.println("te vaak");
		}
//		System.out.println("De kermis heeft in totaal " + this.aantalKaartjes + " kaartjes verkocht voor haar attracties en daarmee €" + this.kassa + " verdiend." );
	}

	public void omzetTonen() {
		System.out.println("De kermis heeft in totaal: €" + this.kassa + " verdiend." );
		for(Attractie a : attractie.attracties) {
			if(a.getKassa()> 0.0) {
				System.out.println(a.getNaam() + " heeft €" + a.getKassa() + " verdiend.");
			}
		}
	}
	
	public void kaartenTonen() {
		System.out.println("De kermis heeft in totaal: " + this.aantalKaartjes + " kaartje(s) verkocht." );
		for(Attractie a : attractie.attracties) {
			if(a.getKaartjes()> 0) {
				System.out.println(a.getNaam() + " heeft " + a.getKaartjes() + " kaartje(s) verkocht.");
			}
		}
	}
	
}
