package facade;

public class Objednavka {
	private Dodavatel dodavatel;
	private Tovar tovar;
	
	public Objednavka() {
		dodavatel = new Dodavatel();
		tovar = new Tovar();
	}
	
	public void objednaj(int mnozstvo){
		dodavatel.doTask1();
		System.out.println("Cena: " + (tovar.doTask2() * mnozstvo));
	}
}
