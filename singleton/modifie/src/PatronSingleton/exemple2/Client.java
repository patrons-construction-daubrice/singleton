package PatronSingleton.exemple2;

public class Client {

	public static void main(String[] args) {
		int som = Singleton.getInstance().somme(2, 5);
		System.out.println("la somme est: " + som);

		int diff = Singleton.getInstance().difference(9, 4);
		System.out.println("la difference est: " + diff);

		Singleton s1 = Singleton.getInstance(8, 3);
		s1.afficher();

		Singleton s2 = Singleton.getInstance(16, 19);
		s2.afficher();
	}
}
