package demo;

public class Person {
	static int current_year = 2017;//current year
	private String name;//name of person
	private int birthdate;//year person was born
	private int age;//age of person
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthdate = bdate;
	}
	/**
	 * sets birthdate to the year given by caller
	 * @param year
	 */
	public void reset_birthday(int year){
		birthdate = year;
	}
	/**
	 * prints formatted name, birthdate, and age
	 * calls seniorCitizen
	 */
	public void display() {
		System.out.println("This is " + name);//prints formatted name
		System.out.printf("I was born in %d. ",birthdate);//prints formatted birthdate
		age = current_year - birthdate;//calculates age by subtracting birthdate from the current year
		System.out.printf("\nI am %d years old ",age);//prints formatted age
		isSeniorCitizen();//checks if person is a senior citizen
	}
	/*
	 * checks if person is a senior citizen and prints whether or not he/she is
	 */
	public void isSeniorCitizen() {
		if (age >= 65)
			System.out.println("\nI'm a senior citizen");//prints if person is a senior citizen
		else
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");//prints if person is not a senior citizen
	}

	public static void main(String[] args) {
		// creates new person and calls display
		Person John = new Person("John",1957);
		John.display();
	}

}