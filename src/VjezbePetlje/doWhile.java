package VjezbePetlje;
 import java.util.*;
public class doWhile {
public static void main(String[] args) {
	double a,b;
	do { 
		a=TextIO.getlnDouble();
		b= TextIO.getlnDouble();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a % b);
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(b));
	}
 while (a !=0 && b !=0);
	{
	 System.out.println("Unesite brojeve vece od 0!");
 }
	 
}
}
