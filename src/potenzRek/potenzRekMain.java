package potenzRek;

public class potenzRekMain {

	public static void main(String[] args) {
		int rekPotenz = potenzRek(NUMBER, POTENZ);
		int iterPotenz = potenzIter(NUMBER, POTENZ);
		System.out.println("Rekursiv : "+rekPotenz);
		System.out.println("Iterativ : "+iterPotenz);
	}
	
	static final int NUMBER = 2;
	static final int POTENZ = 3;
	
	public static int potenzRek(int n, int p) {
		if (p <= 0) {
			return 1;
		}
		return n * potenzRek(n, p - 1);
	}
	public static int potenzIter(int n, int p) {
		int potenzProduct = 1;
		for (int i = 0; i < p; i++) {
			potenzProduct = potenzProduct * n;
		}
		return potenzProduct;
	}
}
