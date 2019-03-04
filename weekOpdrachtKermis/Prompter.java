package weekOpdrachtKermis;

import java.util.Scanner;

public class Prompter {
	Scanner scanner = new Scanner(System.in);
	int keuze;
	
	//------------welkomstbericht + menu------------//
	int starten() {
		
		System.out.println("Kies \n" +
				"1. \tvoor botsauto's \t €2,50 \n" + 
				"2. \tvoor spin \t\t €2,25 \n" + 
				"3. \tvoor spiegelpaleis \t €2,75 \n" + 
				"4. \tvoor spookhuis \t\t €3,20 \n" + 
				"5. \tvoor Hawaii \t\t €2,90 \n" + 
				"6. \tvoor ladderklimmen \t €5,00 ");
		keuze = scanner.nextInt();
		return keuze;
	} 
	
}
