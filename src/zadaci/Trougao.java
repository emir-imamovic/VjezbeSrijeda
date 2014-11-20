package zadaci;
import java.io.*;
public class Trougao {
public static void main(String[] args) {
	System.out.println("Unesite duzinu prve stranice!");
	int a = TextIO.getlnInt();
	System.out.println("Unesite duzinu druge stranice!");
	int b = TextIO.getlnInt();
	System.out.println("Unesite duzinu trece stranice!");
	int c = TextIO.getlnInt();
	if (a >= b + c && b >= a + c && c >= a + b) {
		System.out.println("Unesene duzine stranica ne mogu praviti trougao!");
	}
	else { 
		
	}
}
}
