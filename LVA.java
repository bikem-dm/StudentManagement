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

public class LVA {

//Diese Arraylist haelt Studenten und Dozenten, die zur LVA angemeldet.
ArrayList<Student>lva_s= new ArrayList();
ArrayList<Dozent>lva_d= new ArrayList();

private String Name="-";
private String Fakultaet="-";
private String Credits="-";
private String Kuerzel="-";
private String Sprache="-";
private String Anwesenheitspflicht="-";
private String Raum="-";
private String Kontingent="-";


public String getRaum() {
	return Raum;
}

public void setRaum(String raum) {
	Raum = raum;
        
}
public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
	
}
	public String getFakultaet() {
		return Fakultaet;
	}

	public void setFakultaet(String fakultaet) {
		Fakultaet = fakultaet;
	}

	public String getCredits() {
		return Credits;
	}

	public void setCredits(String credits) {
		Credits = credits;
	}

	public String getKuerzel() {
		return Kuerzel;
	}

	public void setKuerzel(String kuerzel) {
		Kuerzel = kuerzel;
	}

	public String getSprache() {
		return Sprache;
	}

	public void setSprache(String sprache) {
		Sprache = sprache;
	}

	public String getAnwesenheitspflicht() {
		return Anwesenheitspflicht;
	}

	public void setAnwesenheitspflicht(String anwesenheitspflicht) {
		Anwesenheitspflicht = anwesenheitspflicht;
	}

	public String getKontingent() {
		return Kontingent;
	}

	public void setKontingent(String kontingent) {
		Kontingent = kontingent;
	}
        




	
@Override
public String toString() {
	return " Kuerzel von der LVA=" + Kuerzel+" " ;
}

//public void showinf(){
	//System.out.println(toString()+" ,Raum="+Raum+" ,Fach Bereich="+Fach_Bereich);
//}




	static boolean kontrolKuerzel(String s){
		if(s.length()!=6){
			//System.out.println("Laenge von Name soll 6 sein.");
			return false;
		}
		 if(s.length()==6){
			for(int i=0;i<3;i++){
			if(Character.isUpperCase(s.charAt(i))==false){
			//System.out.println("LVA's Name soll mit drei Grossbuchstaben anfangen.");	
			return false;
			}
			}
			for(int k=5;k>3;k--){
				if(Character.isLetter(s.charAt(k))==true){
					//System.out.println("LVA's Name soll mit drei Ziffern beenden.");
					return false;
				}
			}
			
			
		}
		 return true;
	}
	
	
	
}

