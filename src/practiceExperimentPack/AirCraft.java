package practiceExperimentPack;
public class AirCraft{
	String airCraftName;
	int passengerCount, cruiseSpeed;
	double fuelCapacity,fuelBurnRate; 
	
	public AirCraft(String airCraftName, int passengerCount ){
		this.airCraftName = airCraftName;
		this.passengerCount = passengerCount;
		
	}
	public void displayInfo(){
		System.out.println( "Aircaft Name: " + airCraftName);
		System.out.println("Total Passenger: "+ passengerCount);
	}
}





