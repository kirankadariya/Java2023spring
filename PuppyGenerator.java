package dog;

public class PuppyGenerator {
	
	public static void main(String[] args) {
		
		//create a new dog object
		
		Dog2 dobby = new Dog2();
		
		//set attributes for the new dog
		
		//dobby.setBread("Chihuahua");
		
		//dobby.setAgeInMonths(27);
		
		dobby.setColor("tannn");
	

		//create another dog object
	
		Dog2 rover = new Dog2(" some", 23, "nu");
	
	
	//rover.setBread("GreatDane");
	
	   //	rover.setAgeInMonths(9);
	
		//rover.setColor("black");
	
		Dog2 spot = new Dog2(" ja", 14, "Whit");
	
		spot.setBread("JackRussel");
	
		spot.setAgeInMonths(14);
	
		spot.setColor("White");
	
		dobby.sleep();
	
		rover.bark();
		
		// public out a dog detail 
		
		//dobby.printDetails();
		//rover.printDetails();
		//spot.printDetails();
		
		
		
	
	System.out.println("Our first dog is a: " + dobby.breed);
	
	System.out.println("His age is: " + dobby.ageInMonths + " months old");
	
	System.out.println("His color is: " + dobby.color);
	
	
//System.out.println(rover.breed);


 

}

}


