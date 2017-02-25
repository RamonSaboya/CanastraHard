package br.com.canastrahard;

public class CanastraHard {

	public static void main(String[] args) {
		Carta carta = new Carta((byte) 10, (byte) 2, false);
		
		System.out.println(carta.info());
	}

}
