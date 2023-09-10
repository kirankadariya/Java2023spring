package controller;

public class Controller {
	
	// create attribute of controller class
	
	public String gamingSystem;
	
	public boolean wireless; 
	
	public float price;
	
	// add the accessors method to get the attribute 
	
	public String getGamingSystem() {
		
		return gamingSystem;
	
	}
	
	public boolean getWireless() {
		
		return wireless;
	}
	
	public float getPrice() {
		
		return price;
		
	}
	
	public void setGamingSystem(String gamingSystem) {
		
		this.gamingSystem= gamingSystem;
		
	}
	
	public void setWireless(boolean wireless) {
		
		this.wireless = wireless;
		
	}
	
	public void setPrice(float price) {
		
		this.price = price;
		
	}
	
	 
	
	// create the constructor 
	
	public Controller() {
		
	}
	
	// create new controller an object
	
	public Controller ( String gamingSystem, boolean wireless, float price){

		
		this.setGamingSystem (gamingSystem);
		
		this.setWireless(wireless);
		
		this.setPrice(price);
	
	}
	
	
	// create main method to display message 
	
	void main() {
		
		System.out.println("Welcome to the Inventory Tracking System for Gamer's Paradise!");
		
	    System.out.println("These are the controllers we currently carry in inventory.");
		}
	
	
	// create printControllerInformation method to display the attribute 
	
	public void printControllerInformation(){
		
		System.out.println("Gaming System: " + gamingSystem);
		
        System.out.println("Wireless: " + (wireless? "Yes": "No"));
        
        System.out.println("Price: $" + price);
        
        System.out.println();
	}
}

	
	
