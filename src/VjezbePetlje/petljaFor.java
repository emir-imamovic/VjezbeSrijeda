package VjezbePetlje;
import java.util.*;
public class petljaFor {
public static void main(String[] args) {
	System.out.println("Unesi broj");
	int broj = TextIO.getlnInt();
	int brojac = 0;
	for  ( int  i = 1 ; i<=broj; i++) {
		if (broj%i == 0){
			brojac ++;
	}
  } 
if (brojac == 2) {
	System.out.println("Broj je prost.");}
	else {System.out.println("Broj nije prost.");}

}
}
