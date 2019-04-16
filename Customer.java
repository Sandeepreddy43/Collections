package com.reg.collections.bus;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Customer {
	Bus b = new Bus();
	Travel t = new Travel();
	
	List<Bus> bu = b.getDetails();
	Scanner s = new Scanner(System.in);

	public void askCustomer() {
		System.out.println("Searching Fields are: " + "\n1. Travelling Route" + "\n2. Transporter" + "\n3. Amenities");
		System.out.println("\nWhich field you want to search .. .. .? ");
		int answer = s.nextInt();
		showDetails(answer);
	}

	public void showDetails(int ans) {
		if (ans == 1) {
			System.out.println("Routs Available for now: \n" + Arrays.toString(t.routeList));
			System.out.println("Select Your Route .. .!");
			String route = s.next();
			for (int i = 0; i < bu.size(); i++) {
				if (bu.get(i).travelling.route.equalsIgnoreCase(route)) {
					display(i);
				}
			}
		}
		if (ans == 2) {
			System.out.println("Transporters Available for now: \n" + Arrays.toString(t.tList));
			System.out.println("Select Your Transporter .. .!");
			String trans = s.next();
			for (int i = 0; i < bu.size(); i++) {
				if (bu.get(i).travelName.equalsIgnoreCase(trans)) {
					display(i);
				}
			}
		}
		if (ans == 3) {
			System.out.println("Amenities Available for now: \n" + Arrays.toString(t.amenity));
			System.out.println("Select Your Amenity .. .!");
			String amenity = s.next();
			for (int i = 0; i < bu.size(); i++) {
				if (bu.get(i).travelling.actype.equalsIgnoreCase(amenity)) {
					display(i);
				}
			}
		}
	}

	public void display(int index) {
		Bus abc = bu.get(index);
		System.out.println("\n----------Bus Details.!----------");
		System.out.println(
				"Transporter Name: " + abc.travelName + "\nSerial No: " + abc.idNo + "\nReg. No: " + abc.regNo);
		System.out.println("Amenities: " + abc.travelling.actype + "\nRoot Selected: " + abc.travelling.route
				+ "\nSeat type: " + abc.travelling.seatType);
	}
	public void displayAll() {
		for(Bus n:bu) {
			System.out.println("*~*~*~*~*~*~*");
			System.out.println("Transporter name: "+n.travelName);
			System.out.println("Serial No: "+n.idNo);
			System.out.println("Reg. No: "+n.regNo);
			System.out.println("Route: "+n.travelling.route);
			System.out.println("AC Type: "+n.travelling.actype);
			System.out.println("Seater Type: "+n.travelling.seatType+"\n");
		}		
	}
}