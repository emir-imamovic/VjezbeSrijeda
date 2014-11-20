package zadaci;
 import java.io.*;
public class Bazen {
public static void main(String[] args) {
	System.out.println("Unesite dimenzije plocica!");
	int sirinaPlocice = TextIO.getlnInt();
	int duzinaPlocice = TextIO.getlnInt();
	System.out.println("Unesite dimenzije bazena!");
	int sirinaBazena = TextIO.getlnInt();
	int duzinaBazena = TextIO.getlnInt();
	int visinaBazena = TextIO.getlnInt();
	int dimenzijaPlocica = sirinaPlocice * duzinaPlocice;
	int dimenzijaBazena = sirinaBazena * duzinaBazena * visinaBazena;
	int brojPlocica = dimenzijaBazena / dimenzijaPlocica;
	System.out.println("Broj plocica u bazenu je: " + brojPlocica + " .");
}
}
