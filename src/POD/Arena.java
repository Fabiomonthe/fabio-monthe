package POD;

public class Arena extends robot{
	
	robot r1, r2;
	
	public Arena() {}
	public Arena (robot a , robot b) {
		this.r1= a;
		this.r2= b;
		
	}
	public void fight(robot r1, robot r2) {
		while (r2.nbr_vie!=0){
		r1.fire(r2);
		if (r2.nbr_vie != 0){
			r2.fire(r1);
		}else {
			isDead (r2);
			System.out.println("combat terminer. "+r1.nom+" est victorieux");
			}
	}
		
	}
	public String toString() {
		return "combat d'arene";
		
}
	  public static void main (String[]args) {
		  robot r1= new robot("D2R2",10);
		  robot r2= new robot("Data",10);
		  Arena A = new Arena(r1,r2);
		  
		  A.fight(r1,r2);
	  }
}