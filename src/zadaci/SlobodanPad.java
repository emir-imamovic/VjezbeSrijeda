package zadaci;

import java.io.*;

public class SlobodanPad {
	public static void main(String[] args) {
		System.out.println("Unesite visinu u metrima");
		double visina = TextIO.getlnDouble();
		System.out.println("Unesite vrijeme u sekundama!");
		double vrijeme = TextIO.getlnDouble();
		double gravitacija = 9.81;
		double formula = (gravitacija * vrijeme * vrijeme) / 2;
		if (formula <= visina) {
			System.out.println("Houston, we have a problem! ");
		} else {
			System.out.println("Do pada vam je ostalo " + ((formula) % visina)
					+ " sekundi");
		}
	}
}
