package oops.abstopic.interfacetopic;


import java.util.Scanner;

public class TestApp1 
{
//	public static void isValidObject(Vehicle vehicle)
//	{
//		if(vehicle instanceof TwVehicle) 
//		{
//			System.out.println("if(vehicle instanceof TwVehicle)---TRUE-------vehicle=====>TwVehicle");
//			vehicle.getSpec();
//			// Downcasting----[Child reference = (Child reference)Parent reference]
//			TwVehicle twVehicle = (TwVehicle)vehicle;
//			twVehicle.getTwModelInfo(); 
//			
//		}else if(vehicle instanceof LmvVehicle) 
//		{
//			System.out.println("if(vehicle instanceof LmvVehicle)---TRUE-------vehicle=====>LmvVehicle");
//			vehicle.getSpec();
//			// Downcasting----[Child reference = (Child reference)Parent reference]
//			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
//			lmvVehicle.getLmvModelInfo();
//			
//			//-------------------------------------------
//		}else if(vehicle instanceof HmvVehicle) 
//		{
//			//-------------------------------------------
//			System.out.println("if(vehicle instanceof HmvVehicle)---TRUE-------vehicle=====>HmvVehicle");
//			vehicle.getSpec();
//			// Downcasting----[Child reference = (Child reference)Parent reference]
//			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
//			hmvVehicle.getHmvModelInfo();
//		}
//	}
	
	public static void main(String[] args) 
	{	
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Below choice : ");
		System.out.println("1) For Two Vehicle");
		System.out.println("2) For LMV Vehicle");
		System.out.println("3) For HMV Vehicle");
		int choice = sc.nextInt();

//		ParentClass parRef = new ParentClass();
//		ParentClass parRef = new ChildClass();
		
//		Vehicle vehicle = new TwVehicle();
		// reference variable
		// object---TwVehicle
		
		
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: // Upcasting / Late Binding / Runtime Polymorpshim / Dynamic BInding
					vehicle = new TwVehicle();
					vehicle.getSpec();
//					isValidObject(vehicle);
					break;
					
			case 2: vehicle = new LmvVehicle();
//					isValidObject(vehicle);
					vehicle.getSpec();
					break;
					
			case 3: vehicle = new HmvVehicle();
					vehicle.getSpec();
//					isValidObject(vehicle);
					break;
			default:
					break;
		}
	}
}