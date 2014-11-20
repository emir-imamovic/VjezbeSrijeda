package VjezbePetlje;
import java.util.*;
public class ProstiBrojevi {
public static void main(String[] args) {
	System.out.println("Unesite interval!");
	int a = TextIO.getlnInt();
	int b = TextIO.getlnInt();
	int i;
	int brojac = 0;
	for ( i = a ; i < b ; i++) {
		if (i % 2 == 0){
		i++;
	}
	if (i % 2 != 0) {
		brojac++;
		i++;
		System.out.println(i);}


}
}}
