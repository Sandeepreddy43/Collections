package com.reg.collections.bus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Booking {
	Bus b = new Bus();
	Travel t = new Travel();
	List<Bus> bu = b.getDetails();
	Scanner s = new Scanner(System.in);
	List<Bus> rootBus=new ArrayList<>();
	List<Bus> transporter=new ArrayList<>();
	public void askCustomer() {
		System.out.println("Searching Fields are: " + "\n1. Travelling Route" + "\n2. Transporter" + "\n3. Amenities");
		System.out.println("\nWhich filed U want to search .. .. .? ");
//		int answer = s.nextInt();
/*		showDetails(answer);*/
	}

	public void showDetails() {
		//if (ans == 1) {
			System.out.println("Routs Available for now: \n" + Arrays.toString(t.routeList));
			System.out.println("Select Your Route .. .!");
			String route = s.next();
			for (int i = 0; i < bu.size(); i++) {
				if (bu.get(i).travelling.route.equalsIgnoreCase(route)) {
					display(i, bu);
					rootBus.add(bu.get(i));
				}
			//}
		}
//		for(int k=0;k<rootBus.size();k++) {
//			System.out.println("******");
//			display(k,rootBus);
//		}
		//if (ans == 2) {
			System.out.println("Transporters Available for now: \n" + Arrays.toString(t.tList));
			System.out.println("Select Your Transporter .. .!");
			String trans = s.next();
			for (int i = 0; i < rootBus.size(); i++) {
				if (rootBus.get(i).travelName.equalsIgnoreCase(trans)) {
					display(i,rootBus);
					transporter.add(bu.get(i));
				}
			//}
		}
	//	if (ans == 3) {
			System.out.println("Amenities Available for now: \n" + Arrays.toString(t.amenity));
			System.out.println("Select Your Amenity .. .!");
			String amenity = s.next();
			for (int i = 0; i < transporter.size(); i++) {
				if (transporter.get(i).travelling.actype.equalsIgnoreCase(amenity)) {
					display(i,transporter);
				}
				else {
					if (i == transporter.size() - 1) {
					System.out.println("Sorry .. .!"+"\nNo Bus available for now");
				}
					continue;
			}
		}
		//}
	}

	public void display(int index, List<Bus> b) {
		Bus abc = b.get(index);
		System.out.println("\n----------Bus Details.!----------");
		System.out.println(
				"Transporter Name: " + abc.travelName + "\nSerial No: " + abc.idNo + "\nReg. No: " + abc.regNo);
		System.out.println("Amenities: " + abc.travelling.actype + "\nRoot Selected: " + abc.travelling.route
				+ "\nSeat type: " + abc.travelling.seatType);
	}
}