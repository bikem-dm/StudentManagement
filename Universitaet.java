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
public class Universitaet {
    	private String Kuerzel ="-1";
	private String Name = "-1";
	private String Gruendungsjahr ="-1";
	
	
	public String getKuerzel() {
		return Kuerzel;
	}


	public void setKuerzel(String kuerzel) {
		Kuerzel = kuerzel;
	}


	public String getGruendungsjahr() {
		return Gruendungsjahr;
	}


	public void setGruendungsjahr(String gruendungsjahr) {
		Gruendungsjahr = gruendungsjahr;
	}
        
        
        
        	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	
	//tc arraylist hat person -student und dozent- tc nummer .
       
       
        
        
	ArrayList<String> tc = new ArrayList<String>();
        
	ArrayList<Student> liste = new ArrayList<Student>();
	ArrayList<LVA> lva = new ArrayList<LVA>();
	ArrayList<Dozent> d = new ArrayList<Dozent>();
	
	
	Universitaet(String n)	{
		setName(n);
	 }
	
	
	public boolean alreadyExists(Universitaet uni, Student s) {
		for (int i = 0; i < uni.liste.size(); i++) {
			Student k= (Student) uni.liste.get(i);
        	if(k.equals(s)){
        		//System.out.println("Student mit dieser Matrikelummer existiert bereits");
        		return true;
        	}
	


		}
		return false;
	}
        
        public boolean alreadyExists2(Universitaet uni, String s) {
		for (int i = 0; i < uni.liste.size(); i++) {
			
        	if(s.equals(uni.liste.get(i).getMatrikelnummer())){
        		//System.out.println("Student mit dieser Matrikelummer existiert bereits");
        		return true;
        	}
	


		}
		return false;
	}
	


	
	public  boolean alreadyExistsd(Universitaet uni, Dozent d){
		for (int i = 0; i < uni.d.size(); i++) {
			
        	if(uni.d.get(i).getTCNummer().equals(d.getTCNummer())){
        		//System.out.println("Dozent existiert bereits");
        		return true;
        	}
	


		}
		return false;
	}
	
	public  boolean alreadyExistslva(Universitaet uni, LVA l){
		for (int i = 0; i < uni.lva.size(); i++) {
			
        	if(uni.lva.get(i).getKuerzel().equals(l.getKuerzel())){
     
        		//System.out.println("LVA existiert bereits");
        		return true;
        	}
	 


		}
		return false;
	}
        
        
        // alreadyExistslva funktioniert wie alreadyExistslva2.
     
        public  boolean alreadyExistslva2(Universitaet uni,String s) {
            for (int i = 0; i < uni.lva.size(); i++) {
			
        	if(uni.lva.get(i).getKuerzel().equals(s)){
     
        		
        		return true;
        	}
            
        


		}
		return false;
	}
        
        //ich will nicht dass einige Informationen leer sein.
      static public boolean  control_space(String s){
        if(s.startsWith(" ")|| s.endsWith(" "))
            return true;
        else
          return s.isBlank();
          
      }
      
      
	static public boolean control_tc(String s,Universitaet p){
            for(int i=0;i<p.tc.size();i++){
                if((p.tc.get(i).equals(s))==true)
               return true;
            }
            
       return false;     
       
}
        
        
      
}