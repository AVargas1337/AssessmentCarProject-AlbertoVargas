//Alberto Vargas
//10.13.2026
//Assessment on creating a car anaylzer for data sets

//this is the start of your Car class 

package assessmentCarProject;

public class Car {
	
	private string car_id;
	private string Brand;
	private string Model;
	private int Year;
	private string Fuel_Type;
	private string Color;
	private string Milage_kmpl;
	
	
	//constructor

	public Car(string car_id, string brand, string model, int year, string fuel_Type, string color,
			string milage_kmpl) {
		super();
		this.car_id = car_id;
		Brand = brand;
		Model = model;
		Year = year;
		Fuel_Type = fuel_Type;
		Color = color;
		Milage_kmpl = milage_kmpl;
	}


}
