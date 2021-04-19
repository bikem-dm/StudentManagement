/**
 *
 * 
 */
package javaapplicationguıapp;

/**
 *
 * @author BEKONG
 */
import java.util.ArrayList;

public class Dozent extends Person {
private String Raum="-";
private String Bereich="-";

//Diese Arraylist haelt LVA's von Dozenten.
ArrayList<LVA> d_lva = new ArrayList();
public String getRaum() {
	return Raum;
}





public void setRaum(String raum) {
	Raum = raum;
}




public String getBereich() {
	return Bereich;
}





public void setBereich(String bereich) {
	Bereich = bereich;
}






	
	
	
	
@Override

	
public String toString() {
	return "Dozent Name=" + getName() + ", Nachname=" + getNachname() + ", TCNummer=" + getTCNummer() ;
}

//toString methode ist Vererbung vo der Klasse Person
void showinfd(){
	System.out.println(super.toString()+", Raum="+ Raum+", Bereich="+Bereich+"]" );
}



public static boolean kontrolTC(String s){
	
	if(s.length()!=11){
		//System.out.println("TC Nummer soll aus 11 Ziffern bestehen.");
		return false;
	}
	
	else{
	for(int i=0;i<s.length();i++){
		if(Character.isLetter(s.charAt(i))==true){
			//System.out.println("TC Nummer soll aus Ziffern bestehen.");
			return false;
		}
	}
	}	
	
	 
	
		return true;	
		
	
	
}

//wenn Dozent schon zur LVA zugewiesen wurde,wird er nicht wieder zugewiesen.
public static boolean alreadyExistsLVA(LVA l,Dozent d){
	for(int i=0; i<d.d_lva.size();i++){
		if(d.d_lva.get(i).getKuerzel().equals(l.getKuerzel())){
			//System.out.println("Dozent wurde zur LVA schon zugewiesen.");
			return true;
		}
		
	}
	return false;
}

}
