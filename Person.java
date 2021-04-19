/**
 *
 * 
 */
package javaapplicationguıapp;

import java.util.ArrayList;

/**
 *
 * @author BEKONG
 */
public class Person {
        
        
        
	private String 	Name = "-";
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public String getTCNummer() {
		return TCNummer;
	}
	public void setTCNummer(String tCNummer) {
		TCNummer = tCNummer;
	}
	public String getGeschlecht() {
		return Geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}
	public String getGeburtsdatum() {
		return Geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getEmailadresse() {
		return emailadresse;
	}
	public void setEmailadresse(String emailadresse) {
		this.emailadresse = emailadresse;
	}
	public String getPhonenummer() {
		return phonenummer;
	}
	public void setPhonenummer(String phonenummer) {
		this.phonenummer = phonenummer;
	}
	@Override
	public String toString() {
		return " [Name=" + Name + ", Nachname=" + Nachname + ", TCNummer=" + TCNummer + ", Geschlecht="
				+ Geschlecht + ", Geburtsdatum=" + Geburtsdatum + ", Adresse=" + Adresse + ", emailadresse="
				+ emailadresse + ", phonenummer=" + phonenummer ;
	}
	private String Nachname = " ";
	private String TCNummer="-";
	private String Geschlecht = "-";
	private String Geburtsdatum = "-";
	private String Adresse = "-";
	private String emailadresse = "-";
	private String phonenummer = "-";



    
}