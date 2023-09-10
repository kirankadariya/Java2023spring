package dog;


public class Dog2 {

	

		//attributes of the dog class        

		String breed;

	
		int ageInMonths;

		String color;

		//create construct

		

		public Dog2() {

			

		}

		//create new dog object

		

		public Dog2(String breed, int ageInMonths,String color) {

			this.setBread(breed);

			this.setAgeInMonths(ageInMonths);

			this.setColor(color);		

		}
		
		

		

		//start methods

		

		//bark method to make sound

		

		void bark()   {

			

			System.out.println("Woof");

		}

		

		void sleep() {

			

			System.out.println("ZZZzzzzz");

		}

		

		//add accessors methods to get attributes

		

		public String getBreed()  {

			return breed;

		}

		

		public int getageInMonths() {

			return ageInMonths;

		}

		

		public String getcolor() {

			return color;

		}

		

		public void setBread(String breed) {

			this.breed = breed;

		

	    }

        public void setAgeInMonths(int ageInMonths) {

        	this.ageInMonths = ageInMonths;

        }

        

        public void setColor(String color) {

        	this.color = color;
        	
        	
        }

        //set up print details 
        
        public void printDetails() {
        	
        	System.out.println("This dog is a: "+ breed);
        	System.out.println(" This dog is "+ ageInMonths+  "months old");
            System.out.println("This dog is "+ color+ "color"); 	
       
}

}

	
		