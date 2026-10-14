//Alberto Vargas
//10.13.2026
//Assessment on creating a car anaylzer for data sets

//this is the start of your Car class 

package assessmentCarProject;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Car {
	
	private String Car_ID;	
	private String Model;
	private int Year;
	private String Fuel_Type;
	private String Color;
	private int Milage_kmpl;

	private static ArrayList<Car> cars;

	{
    	new ArrayList<>(cars.subList(0, 2000));
        try (Scanner scanner = new Scanner(new File("data.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Split by commas
                @SuppressWarnings("unused")
				String[] values = line.split(",");
                Car.add();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Car.toArray();
    }
	private static String[][] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	private static void add() {
		// TODO Auto-generated method stub
		
	}
	
	
    	//constructor
	
	public Car(String car_ID, String model, int year, String fuel_Type, String color, int milage_kmpl) {
		super();
		Car_ID = car_ID;
		Model = model;
		Year = year;
		Fuel_Type = fuel_Type;
		Color = color;
		Milage_kmpl = milage_kmpl;
		}
		
		//Setters and getters
		
		public String getCar_ID() {
			return Car_ID;
		}

		public void setCar_ID(String car_ID) {
			Car_ID = car_ID;
		}

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public int getYear() {
			return Year;
		}

		public void setYear(int year) {
			Year = year;
		}

		public String getFuel_Type() {
			return Fuel_Type;
		}

		public void setFuel_Type(String fuel_Type) {
			Fuel_Type = fuel_Type;
		}

		public String getColor() {
			return Color;
		}

		public void setColor(String color) {
			Color = color;
		}

		public int getMilage_kmpl() {
			return Milage_kmpl;
		}

		public void setMilage_kmpl(int milage_kmpl) {
			Milage_kmpl = milage_kmpl;
		}
		@Override
		public String toString() {
			return "Car [Car_ID=" + Car_ID + ", Model=" + Model + ", Year=" + Year + ", Fuel_Type=" + Fuel_Type
					+ ", Color=" + Color + ", Milage_kmpl=" + Milage_kmpl + "]";
		}
		
		
	
	
}//end class

