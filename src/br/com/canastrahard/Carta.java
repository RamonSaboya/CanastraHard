package br.com.canastrahard;

public class Carta {

	private byte numero;
	private byte naipe;
	private boolean azul;

	public Carta(byte numero, byte naipe, boolean azul) {
		this.numero = numero;
		this.naipe = naipe;
		this.azul = azul;
	}

	public byte getNumero() {
		return numero;
	}

	public byte getNaipe() {
		return naipe;
	}

	public boolean isAzul() {
		return azul;
	}

	public String info() {
		String info = "";

		switch (numero) {
		case 0:
			info = "Ás";
			break;
		case 1:
			info = "Dois";
			break;
		case 2:
			info = "Três";
			break;
		case 3:
			info = "Quatro";
			break;
		case 4:
			info = "Cinco";
			break;
		case 5:
			info = "Seis";
			break;
		case 6:
			info = "Sete";
			break;
		case 7:
			info = "Oito";
			break;
		case 8:
			info = "Nove";
			break;
		case 9:
			info = "Dez";
			break;
		case 10:
			info = "Valete";
			break;
		case 11:
			info = "Dama";
			break;
		case 12:
			info = "Rei";
			break;
		}
		
		info += " de ";
		
		switch (naipe) {
		case 0:
			info += "Espadas";
			break;
		case 1:
			info += "Copas";
			break;
		case 2:
			info += "Paus";
			break;
		case 3:
			info += "Ouros";
			break;
		}
		
		info += " ";
		
		if (azul) {
			info += "Azul";

		} else {
			info += "Vermelho";
		}
		
		return info;
	}

}
