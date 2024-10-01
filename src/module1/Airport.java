package module1;

public class Airport {
 private String name;
 private int code;
 private int runway;
 private String Location;
 
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
	 System.out.println("Airport Name =>> "+name);
	 System.out.println("Airport Code =>> "+code);
	 System.out.println("Airport runway =>> "+runway);
	 System.out.println("Airport Location =>> "+Location);
 }
 
 public static void main(String[] args) {
	 Airport Airport=new Airport();
	 Airport.name="Indiragandhi Airport";
	 Airport.code=1234;
	 Airport.Location="Hydrabad";
	 Airport.runway=1;
	 Airport.Display();
	 Airport.Entery();
	 Airport.Verification();
	 Airport.flights();
	 Airport.delayFlights();
	 Airport.immigrationCheck();
	 Airport.customsCheck();
	 Airport.Parking();
	 Airport.Exit();
	 System.out.println("=====================================!!!!!");
	 Airport Airport1=new Airport();
	 Airport1.name="Chatrapati Shivaji maharaj Airport";
	 Airport1.code=5678;
	 Airport1.Location="Mumbai";
	 Airport1.runway=2;
	 Airport1.Display();
	 Airport1.Entery();
	 Airport1.Verification();
	 Airport1.flights();
	 Airport1.delayFlights();
	 Airport1.immigrationCheck();
	 Airport1.customsCheck();
	 Airport1.Parking();
	 Airport1.Exit();
	 System.out.println("=====================================!!!!!");
	 
 }
}
