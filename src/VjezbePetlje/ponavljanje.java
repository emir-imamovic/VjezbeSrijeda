package VjezbePetlje;
import java.text.*;
public class ponavljanje {
public static void main(String[] args) {
	System.out.println("Unesi ime!");
     String ime = TextIO.getlnString();
     System.out.println("Koliko puta zelite ponavljanje?");
     int puta = TextIO.getlnInt();
     
	int ponavljanjje = puta;
			while (ponavljanjje > 0) {
				System.out.println(ime);
				ponavljanjje--;
			}
}
}
