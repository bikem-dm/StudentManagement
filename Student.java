/**
 *
 * 
 */
package javaapplicationguıapp;

import java.util.Scanner;
import java.util.ArrayList;



public class Student extends Person{
	
	//Diese Arraylist haelt LVA's von Studenten.
	ArrayList<LVA> s_lva = new ArrayList<LVA>();




	
	
	public String getMatrikelnummer() {
		return Matrikelnummer;
	}


	public void setMatrikelnummer(String matrikelnummer) {
		Matrikelnummer = matrikelnummer;
	}


	public String getFakultaet() {
		return Fakultaet;
	}


	public void setFakultaet(String fakultaet) {
		Fakultaet = fakultaet;
	}


	public String getFach() {
		return Fach;
	}


	public void setFach(String fach) {
		Fach = fach;
	}


	public String getSemester() {
		return Semester;
	}


	public void setSemester(String semester) {
		Semester = semester;
	}





	private String Matrikelnummer = "-";
	private String Fakultaet = "-";
	private String Fach = "-";
	private String Semester = "-";
	
	
	Student (String m , String n, String k){
		setMatrikelnummer(m);
		setName(n) ;
		setNachname(k) ;
		
	}
	
	
	Student (String m){
		Matrikelnummer=m;
		
	}
	
	Student (String m , String n, String k, String p){
		Matrikelnummer=m;
		setName(n) ;
		setNachname(k) ;
	        setPhonenummer(p);
		
	}
	
	
	//mit Methode toUpperCase() wird klein Buchstaben zum gross Buchstaben transformiert.
        
	@Override
	public String toString() {
		return "Student ["+ Matrikelnummer + "," + getName() + ", " + getNachname().toUpperCase() ;
	}

	
	//toString methode ist Vererbung vo der Klasse Person
	void showinf(){
		System.out.println(super.toString()+", Matrikelnummer="+Matrikelnummer+", Fakultaet="+Fakultaet+", Fach="+Fach+", Semester="+Semester);
		
		
	}
	
	
	
	
	public static boolean num(String n){
		 
		//ich habe static benutzt, um dieser methode ohne objeckt zu verwenden.
		//es wird getestet,ob die jeder karakter von String n Ziffern ist.
		  for(int i=0; i<n.length();i++){
                     
	  			if( Character.isLetter(n.charAt(i))){
	            //System.out.println("Matrikelnummer soll aus Ziffern bestehen.");
	            return false;
	  	       
	            
	            
	  	       }
	  		}
  		
 	   	 // es wird getestet,ob die Matrikelnummer 7 Ziffern besteht. 
  		if(n.length()!=7){
  			//System.out.println("Matrikelnummer soll aus 7 Ziffern bestehen");
  			return false;
  			
  			}
  		
  		//es wird getestet,ob die erste Ziffer der Matrikelnummer "0"ist.
  		else if(n.charAt(0)=='0'){
  			//System.out.println("Erste Ziffer der Matrikelnummer soll nicht 0 sein.");
  			return false;
  	  	 
  		}
  		 
  		else return true;
  		
  			
  			
  			
  	}


	
	
	
	
	//es wird getestet,ob "o" ein objeckt von Student ist. wenn es nicht, ist equals methode "false"
	
	
	@Override
	public boolean equals(Object o) {
	    if(!(o instanceof Student)) return false;
	   //typecasting 
	    else{
	    Student k = (Student)o;
	    //es wird getestet,ob Matrikelnummer von "o" gleich unsere Matrikelnummer ist.
	    return (k.Matrikelnummer.equals(this.Matrikelnummer));}
	   
	}
	 
	 
	//wenn Student schon zur LVA angemeldet wurde,wird er nicht wieder angemeldet.
	public static boolean alreadyExistsLVA(LVA l,Student s){
		for(int i=0; i<s.s_lva.size();i++){
			if(s.s_lva.get(i).getKuerzel().equals(l.getKuerzel())){
				//System.out.println("Student wurde zur LVA schon angemeldet.");
				return true;
			}
			
		}
		return false;
	}
	
	
	
}



