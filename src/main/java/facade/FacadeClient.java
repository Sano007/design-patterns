package facade;

public class FacadeClient {
	public static void main(String args[]){
		Objednavka obj = new Objednavka();
		obj.objednaj(3);
		obj.objednaj(1);
	}
}
