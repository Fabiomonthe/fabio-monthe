package POD;

public class robot {
	
	protected String nom;
	protected int nbr_vie;
	
	public robot() {
		this.nom ="";
		this.nbr_vie=10;
	}
  public robot (String a , int b) {
      this.nom = a;
      this.nbr_vie=b;
}
  public robot(String a) {
	  this.nom = a ;
  }
 
  public String getNbr_vie() {
	  return nom;
  }
  public int getString() {
	  return nbr_vie;
  }
  public void setNbr_vie(int a) {
	  this.nbr_vie= a;
  }
  public void setName(String b) {
	  this.nom = b;
  }
  public String tostring() {
	  return "robot "+this.nom;
  }
   robot fire(robot r ) {
	   robot r2 = new robot();
	   if (!isDead(r)) {
	   r.nbr_vie -=2;
	   System.out.println (r.nom+ "a ete touche par "+this.nom+".vie: "+r.nbr_vie);
	   }
	   return r;
   }

 public boolean isDead(robot r) {
	 if (r.nbr_vie == 0) {
		 System.out.println(r.nom+ "est mort");
			// TODO Auto-generated method stub
			return false;
		}
	 return false;
		}	   
	   
   public static void main (String[]args) {
	   robot bob =new robot ("robot bob",10);
	   robot john = new robot ("robot john",10);
	   
	   System.out.println(bob.nom);
	   System.out.println(john.nom);
	   
	   bob.fire(john);
	  
	  
	  
  }
}
