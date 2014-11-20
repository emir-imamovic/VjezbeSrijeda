package VjezbePetlje;
import java.text.*;
public class unosenjeBr {
 public static void main(String[] args) {
	 int broj1 = 0;
	 int broj2 = 0;
	do {
		System.out.println("Unesi prvi broj!");
	
	 broj1 = TextIO.getlnInt();
	System.out.println("Unesi drugi broj!");
	 broj2 = TextIO.getlnInt(); 
	
	System.out.println("Zbir brojeva je: " + (broj1 + broj2));
	System.out.println("ponovo unesite brojeve");
 
	}
	while (broj1 != 0 && broj2 != 0); {

	System.out.println("Greska");
	}
		
	

}}
