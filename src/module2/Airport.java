package module2;

import java.util.Scanner;

public class Airport {
	private String name;
	private int code;
	private int runway;
	private String Location;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Airport name");
		name = sc.next();
		System.out.println("ENter Airporty code");
		code = sc.nextInt();
		System.out.println("Enter runways of airport ");
		runway = sc.nextInt();
		System.out.println("ENter location of airport");
		Location = sc.next();
	}

	public void Entery() {
		System.out.println("Enter in Airport =>> ");
	}

	public void Verification() {
		System.out.println("Veerifying passport and other details.....!! =>> ");
	}

	public void flights() {
		System.out.println("How many flights are here....=>> ");
	}

	public void delayFlights() {
		System.out.println("Delay flights.....!!!!!   =>> ");
	}

	public void immigrationCheck() {
		System.out.println("Checking the persons of other countryes .....!!  =>> ");
	}

	public void customsCheck() {
		System.out.println("Checking the gold and bags of Peoples...!! =>> ");
	}

	public void Parking() {
		System.out.println("Here's the parking avalible...!! =>> ");
	}

	public void Exit() {
		System.out.println("Exist with check....!!!  =>> ");
	}

	public void Display() {
		System.out.println("Airport Name =>> " + name);
		System.out.println("Airport Code =>> " + code);
		System.out.println("Airport runway =>> " + runway);
		System.out.println("Airport Location =>> " + Location);
	}

}
