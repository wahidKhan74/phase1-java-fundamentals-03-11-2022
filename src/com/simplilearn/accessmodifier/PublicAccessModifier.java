package com.simplilearn.accessmodifier;

public class PublicAccessModifier {

	public static void main(String[] args) {
		
		// create object
		Goverment goverment = new Goverment();
		
		System.out.println("The public transport is : "+ goverment.transportation);
		System.out.println("The public park is : "+ goverment.park);
		System.out.println("The public tax assets is : "+goverment.taxAssets);
		
		System.out.println(goverment.showPark());
		System.out.println(goverment.showPublicAssets());
	}

}

class Goverment {
	
	// data variable
	public String transportation = "Train";
	public String park = "Community Park";
	public double taxAssets = 456456.456;
	
	// public methods
	public double showPublicAssets() {
		return taxAssets;
	}
	
	public String showPark() {
		return park;
	}
	
	// public constructor
	public Goverment() {}
}