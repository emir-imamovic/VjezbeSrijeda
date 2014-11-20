package zadaci;
 import java.io.*;
public class Razdaljina {
 public static void main(String[] args) {
	 System.out.println("Unesite broj minuta!");
	int minuti = TextIO.getlnInt();
	int sekundi = (int)(minuti * 60);
	double gravitacija = 9.81;
	double distanca = (gravitacija *  Math.pow(sekundi, 2)) / 2;
	System.out.println("Distanca slobodnog pada za uneseno vrijeme je: " + distanca + " metara.");
}
}
