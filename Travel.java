package com.reg.collections.bus;

public class Travel {
	final String[] tList = { "Orange", "SRS", "Yatragenie", "Morning Star", "Kaveri","Kesineni", "APSRTC","KSRTC"  };
	final String[] routeList = { "NLR-BLR", "BLR-NLR", "HYD-BLR", "BLR-HYD", "Chennai-BLR", "BLR-Chennai" };
	final String[] amenity = { "AC", "Non-AC" };
	String route;
	String actype;
	String seatType;
	Bus b = new Bus();

	public int ticketFare(String transportName) {
		if (transportName.equalsIgnoreCase(tList[0])) {
			int j = travelingRoute();
			switch (j) {
			case 1: {
				if (actype.equalsIgnoreCase("AC"))
					return 1200;
				else
					return 900;
			}
			case 2: {
				if (actype.equalsIgnoreCase("AC"))
					return 1000;
				else
					return 700;
			}
			case 3: {
				if (actype.equalsIgnoreCase("AC"))
					return 900;
				else
					return 600;
			}
			default: {
				return 0;
			}
			}

		}
		else if (transportName.equalsIgnoreCase(tList[1])) {
			int j = travelingRoute();
			switch (j) {
			case 1: {
				if (actype.equalsIgnoreCase("AC"))
					return 1200;
				else
					return 900;
			}
			case 2: {
				if (actype.equalsIgnoreCase("AC"))
					return 1000;
				else
					return 700;
			}
			case 3: {
				if (actype.equalsIgnoreCase("AC"))
					return 900;
				else
					return 600;
			}
			default: {
				return 0;
			}
			}

		}

		return 0;
	}

	public int travelingRoute() {
		if (route.equalsIgnoreCase("HYD-BLR") || route.equalsIgnoreCase("BLR-HYD")) {
			return 1;
		} else if (route.equalsIgnoreCase("NLR-BLR") || route.equalsIgnoreCase("BLR-NLR")) {
			return 2;
		} else if (route.equalsIgnoreCase("Chennai-BLR") || route.equalsIgnoreCase("BLR-Chennai")) {
			return 3;
		} else
			return 0;

	}
}
/*
 * HashMap<Integer, String> routeList = new HashMap<>(); route.put(1,
 * "NLR-BLR"); route.put(2, "BLR-NLR"); route.put(3, "HYD-BLR"); route.put(4,
 * "BLR-HYD"); route.put(5, "Chennai-BLR"); route.put(6, "BLR-Chennai");
 */