package main;
import Banque.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		CompteB cpt = new CompteB();
		CompteB unautre ;
		unautre =cpt;
		
		cpt.setMontant(100);
		
		cpt.modifier(1000);
		System.out.println("le solde  " +unautre.getMontant());

		System.out.println("le solde final " +cpt.getMontant());
	}

}
