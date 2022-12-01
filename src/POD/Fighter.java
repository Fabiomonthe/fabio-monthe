package POD;

import java.util.Random;

public class Fighter extends robot {
	private boolean seed;

	public Fighter() {
		
		super();
	}
	public Fighter (String a , int b) {
		super (a,b);
	}
	 public void show() {
		 System.out.println("Fighter "+this.nom);
	 }
	 public String tostring() {
		  return "fighter "+this.nom;
	  }

Fighter fire(Fighter r) {
	Fighter r2 = new Fighter();
	if (nextBoolean()==true) {
		r.nbr_vie = r.nbr_vie;
		System.out.println(r.nom +" a ete rate par "+ this.nom+".vie:"+r.nbr_vie);
	} else if (nextBoolean ()== false) {
		r.nbr_vie -=2;
		System.out.println(r.nom +" a ete rate par "+ this.nom+".vie:"+r.nbr_vie);
	}
	return r;
}
   
    private boolean nextBoolean() {
    	Random rand = new Random();
    	seed = rand.nextBoolean();
    	return seed;
    }
public static void main (String[]args) {
	
	Fighter F1= new Fighter("fabio",11);
	Fighter F2= new Fighter("lenoir",11);
	
	F1.fire(F2);
	F2.fire(F1);
	

}
    
       
}
