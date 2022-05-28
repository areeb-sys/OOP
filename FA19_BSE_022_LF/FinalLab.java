// Author : FA19_BSE_022(B)  AREEB AHMED

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinalLab implements Serializable
{
	public static ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
	
		public static void addVehicle(String data) throws Exception{
		FileWriter writer = new FileWriter(new File("ErrorMsgs.txt "));
        boolean err = true;

        Vehicle check = null;
        File f = new File(data);
        StringTokenizer tokenizer;
        String str = "";
        String str1;
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()) {
			err = true;
			str1 = scanner.nextLine();
			tokenizer = new StringTokenizer(str1, ",");
			check = new Vehicle();
			//Registration Number
			Pattern pattern = Pattern.compile("L[A-Z]{2}-\\d{2}-\\d{1,4}");
			str = tokenizer.nextToken();
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
                check.getRegNum(str);
            } else {
                err = false;
                writer.write("\nIncorrect Registration Number :" + str);
            }
			//Vehicle Type
			pattern = Pattern.compile("(MoterCycle|Car|Truck)");
            str = tokenizer.nextToken();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setEngCap(str);
            } else {
                err = false;
                writer.write("\nIncorrect Engine Capacity :" + str);
            }
			//Color
			pattern = Pattern.compile("(Red|Black|Blue)");
            str = tokenizer.nextToken();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setColor(str);
            } else {
                err = false;
                writer.write("\nIncorrect Engine Capacity :" + str);
            }
			//Manufacturing Year 
			pattern = Pattern.compile("\\d{2}");
            str = tokenizer.nextToken();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                check.setYearOfManufacturing(str);
            } else {
                err = false;
                writer.write("\nIncorrect Engine Capacity :" + str);
            }
			
		}
		writer.close();
	}
	
	private static void display() {
        for (int i = 0; i < vehicleArrayList.size(); i++) {
            System.out.println(vehicleArrayList.get(i));
        }
    }
	
	private static void readSerFile()
	{
        vehicleArrayList = null;
		try{
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("StudentData.ser"));
			// Explicit Casting
			vehicleArrayList = (ArrayList<Vehicle>) objectInputStream.readObject();
			objectInputStream.close();
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
			System.exit(1);
		}
		catch(ClassNotFoundException classNotFoundException){
			System.err.println("Class not found.Terminating...");
			System.exit(1);
		}
        
    }
	public static void main(String[] args)
	{
		
		try{
			addVehicle(args[0]);
			ObjectOutputStream VehicleData = new ObjectOutputStream(new FileOutputStream("VehicleData.ser"));
			VehicleData.writeObject(vehicleArrayList);
			VehicleData.close();
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
			System.exit(1);
		}
		catch(Exception ex){
			System.err.println("Error opening file.");
		}
		
		
		readSerFile();
        System.out.println("UnSorted ");
        display();
        Collections.sort(vehicleArrayList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getRegNum().compareTo(o2.getRegNum());
            }
        });
        System.out.println(" Sorted list by Registration:");
        display();
        Collections.sort(vehicleArrayList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getEngCap().compareTo(o2.getEngCap());
            }
        });
        System.out.println(" Sorted list by Engine Capacity");
        display();
        Collections.sort(vehicleArrayList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o2.getYearOfManufacturing().compareTo(o1.getYearOfManufacturing());
            }
        });
        System.out.println("Sorted list by Year Of Manufacturing in descending order");
        display();
		double avgEngCap = 0.0;
		for (int i = 0; i < vehicleArrayList.size(); i++) {

            avgGPA += Float.parseFloat(vehicleArrayList.get(i).getCGPA());
            avgAge += Float.parseFloat(vehicleArrayList.get(i).getAge());
        }
        System.out.println("The average is " + (avgEngCap / vehicleArrayList.size()));
	}
	
	
}
 class Vehicle implements Serializable
{
	private String RegistrationNumber , EngineCapacity , Color , YearOfManufacturing ;
	
	public Vehicle(String RegistrationNumber, int EngineCapacity, String Color ,int YearOfManufacturing )
	{
		this.RegistrationNumber = RegistrationNumber;
		this.EngineCapacity = EngineCapacity;
		this.Color = Color;
		this.YearOfManufacturing = YearOfManufacturing;
	}
	public Vehicle(){
	
	}
	@Override
    public String toString() {
        return "Vehicle{" +"Reg.#='" + RegistrationNumber + '\'' +",Eng Cap='" + EngineCapacity + '\'' +", Color='" + Color + '\'' +", ManufYear='" + YearOfManufacturing + '}'  ;
    }
	public String getRegNum(){
		return RegistrationNumber;
	}
	public void setRegNum(String RegistrationNumber)
	{
		this.RegistrationNumber = RegistrationNumber;
	}
	public String getEngCap()
	{
		return EngineCapacity;
	}
	public  void setEngCap(String EngineCapacity)
	{
		this.EngineCapacity = EngineCapacity;
	}
	public String getColor()
	{
		return Color;
	}
	public void setColor(String Color)
	{
		this.Color = Color;
	}
	public String getYearOfManufacturing()
	{
		return YearOfManufacturing;
	}
	public void setYearOfManufacturing(String YearOfManufacturing)
	{
		this.YearOfManufacturing = YearOfManufacturing;
	}

	
}
 class Car extends Vehicle
{
	public Car(String RegistrationNumber, int EngineCapacity, String Color ,int YearOfManufacturing)
	{
		super(RegistrationNumber, EngineCapacity, Color , YearOfManufacturing);
	}
}
 class MotorBike extends Vehicle
{
	public MotorBike(String RegistrationNumber, int EngineCapacity, String Color ,int YearOfManufacturing)
	{
		super(RegistrationNumber, EngineCapacity, Color , YearOfManufacturing);
	}
	
}
 class Truck extends Vehicle
{
	public Truck(String RegistrationNumber, int EngineCapacity, String Color ,int YearOfManufacturing)
	{
		super(RegistrationNumber, EngineCapacity, Color , YearOfManufacturing);
	}
	
}