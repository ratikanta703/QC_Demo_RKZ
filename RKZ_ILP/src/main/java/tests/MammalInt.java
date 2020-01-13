package tests;

/*public class Myinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p = new Dog();
	     p.test();

	}

}*/



/*public class MammalInt implements Animal {

	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }

	   public static void main(String args[]) {
	      MammalInt m = new MammalInt();
	      m.eat();
	      m.travel();
	   }
	} */

interface Animal{
	  public void test();
	}
	class Dog implements Animal{
	   public void test(){
	     System.out.println("Interface Method Implemented");
	  }
	   public static void main(String args[]){
	     Animal p = new Dog();
	     p.test();
	  }
	}