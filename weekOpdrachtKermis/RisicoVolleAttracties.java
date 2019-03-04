package weekOpdrachtKermis;

abstract class RisicoVolleAttracties extends Attractie{
	RisicoVolleAttracties(String naam, double prijs) {
		super(naam, prijs);
	}
	abstract boolean opstellingskeuring();
	abstract int draaiLimiet();
}
