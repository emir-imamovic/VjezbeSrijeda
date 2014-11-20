package VjezbePetlje;
import java.*;
public class plata {
public static void main(String[] args) {
	System.out.println("Unesite broj radnih sati");
	int brojSati = TextIO.getlnInt();
	System.out.println("Unesite satnicu");
	int satnica = TextIO.getlnInt();
	System.out.println(brojSati * satnica);
}
}
