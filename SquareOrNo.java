package codewars;

public class SquareOrNo {

	public static void main(String[] args) {

		int[] niz = new int[] { 4, 3, 9, 7, 2, 1 };

		int[] noviNiz = provera(niz);

		ispisNiza(noviNiz);
	}

	public static int[] provera(int[] niz) {
		int[] noviNiz = new int[6];

		for (int i = 0; i < niz.length; i++) {
			if (((int) Math.sqrt(niz[i])) * ((int) Math.sqrt(niz[i])) == niz[i])
				noviNiz[i] = (int) Math.sqrt(niz[i]);
			else
				noviNiz[i] = niz[i] * niz[i];
		}
		return noviNiz;
	}

	public static void ispisNiza(int[] noviNiz) {
		for (int i = 0; i < noviNiz.length; i++) {
			System.out.print(noviNiz[i] + "  ");
		}
	}

}
