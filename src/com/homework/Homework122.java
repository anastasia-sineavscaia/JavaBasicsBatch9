package com.homework;

public class Homework122 {
	
	 String nameOfCountry;
	  String capital;
	  int populationSize;

	  public static void main(String []args){

	    Homework122 obj=new Homework122();
	    obj.nameOfCountry="USA";
	    obj.capital="Washington DC";
	    obj.populationSize=330000000;
	    System.out.println("The capital of "+obj.nameOfCountry+" is "+obj.capital+" and population is "+obj.populationSize);

	    Homework122 obj2=new Homework122();
	    obj2.nameOfCountry="Kazakhstan";
	    obj2.capital="Astana";
	    obj2.populationSize=18500000;
	    System.out.println("The capital of "+obj2.nameOfCountry+" is "+obj2.capital+" and population is "+obj2.populationSize);
	  }

}
