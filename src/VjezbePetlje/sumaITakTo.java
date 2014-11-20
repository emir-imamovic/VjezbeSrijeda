package VjezbePetlje;
import java.util.*;
public class sumaITakTo {
public static void main(String[] args) {
	int broj;
	int suma = 0;
	do {
		broj = TextIO.getlnInt();
		suma = suma + broj;
		System.out.println("Suma je " + suma);
	}
while (broj!=0);
}
}
