package com.reg.collections.bus;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bus {
	String travelName;
	int idNo;
	String regNo;
	Travel travelling;

	public List<Bus> getDetails() {
		List<Bus> bList = new ArrayList<>();
		/* Creating Bus1 */
		Bus b1 = new Bus();
		b1.travelName = new Travel().tList[0];
		b1.idNo = 1234;
		b1.regNo = "AP26AP";
		b1.travelling = new Travel();
		b1.travelling.route = "NLR-BLR";
		b1.travelling.actype = "AC";
		b1.travelling.seatType = "Seater";
		bList.add(b1);

		/* Creating Bus2 */
		Bus b2 = new Bus();
		b2.travelName = new Travel().tList[0];
		b2.idNo = 2468;
		b2.regNo = "AP09AP";
		b2.travelling = new Travel();
		b2.travelling.route = "HYD-BLR";
		b2.travelling.actype = "AC";
		b2.travelling.seatType = "Seater";
		bList.add(b2);

		/* Creating Bus3 */
		Bus b3 = new Bus();
		b3.travelName = new Travel().tList[0];
		b3.idNo = 1359;
		b3.regNo = "TN01TN";
		b3.travelling = new Travel();
		b3.travelling.route = "Chennai-BLR";
		b3.travelling.actype = "Non-AC";
		b3.travelling.seatType = "Seater";
		bList.add(b3);

		/* Creating Bus4 */
		Bus b4 = new Bus();
		b4.travelName = new Travel().tList[1];
		b4.idNo = 1234;
		b4.regNo = "AP26AP";
		b4.travelling = new Travel();
		b4.travelling.route = "NLR-BLR";
		b4.travelling.actype = "AC";
		b4.travelling.seatType = "Seater";
		bList.add(b4);

		/* Creating Bus5 */
		Bus b5 = new Bus();
		b5.travelName = new Travel().tList[1];
		b5.idNo = 2468;
		b5.regNo = "AP09AP";
		b5.travelling = new Travel();
		b5.travelling.route = "HYD-BLR";
		b5.travelling.actype = "AC";
		b5.travelling.seatType = "Seater";
		bList.add(b5);

		/* Creating Bus6 */
		Bus b6 = new Bus();
		b6.travelName = new Travel().tList[1];
		b6.idNo = 1359;
		b6.regNo = "TN01TN";
		b6.travelling = new Travel();
		b6.travelling.route = "Chennai-BLR";
		b6.travelling.actype = "Non-AC";
		b6.travelling.seatType = "Seater";
		bList.add(b6);

		/* Creating Bus7 */
		Bus b7 = new Bus();
		b7.travelName = new Travel().tList[2];
		b7.idNo = 1234;
		b7.regNo = "AP26AP";
		b7.travelling = new Travel();
		b7.travelling.route = "NLR-BLR";
		b7.travelling.actype = "AC";
		b7.travelling.seatType = "Seater";
		bList.add(b7);

		/* Creating Bus8 */
		Bus b8 = new Bus();
		b8.travelName = new Travel().tList[2];
		b8.idNo = 2468;
		b8.regNo = "AP09AP";
		b8.travelling = new Travel();
		b8.travelling.route = "HYD-BLR";
		b8.travelling.actype = "AC";
		b8.travelling.seatType = "Seater";
		bList.add(b8);

		/* Creating Bus9 */
		Bus b9 = new Bus();
		b9.travelName = new Travel().tList[2];
		b9.idNo = 1359;
		b9.regNo = "TN01TN";
		b9.travelling = new Travel();
		b9.travelling.route = "Chennai-BLR";
		b9.travelling.actype = "Non-AC";
		b9.travelling.seatType = "Seater";
		bList.add(b9);

		/* Creating Bus10 */
		Bus b10 = new Bus();
		b10.travelName = new Travel().tList[3];
		b10.idNo = 1234;
		b10.regNo = "AP26AP";
		b10.travelling = new Travel();
		b10.travelling.route = "NLR-BLR";
		b10.travelling.actype = "AC";
		b10.travelling.seatType = "Seater";
		bList.add(b10);

		/* Creating Bus11 */
		Bus b11 = new Bus();
		b11.travelName = new Travel().tList[3];
		b11.idNo = 2468;
		b11.regNo = "AP09AP";
		b11.travelling = new Travel();
		b11.travelling.route = "HYD-BLR";
		b11.travelling.actype = "AC";
		b11.travelling.seatType = "Seater";
		bList.add(b11);

		/* Creating Bus12 */
		Bus b12 = new Bus();
		b12.travelName = new Travel().tList[3];
		b12.idNo = 1359;
		b12.regNo = "TN01TN";
		b12.travelling = new Travel();
		b12.travelling.route = "Chennai-BLR";
		b12.travelling.actype = "Non-AC";
		b12.travelling.seatType = "Seater";
		bList.add(b12);

		/* Creating Bus13 */
		Bus b13 = new Bus();
		b13.travelName = new Travel().tList[4];
		b13.idNo = 1234;
		b13.regNo = "AP26AP";
		b13.travelling = new Travel();
		b13.travelling.route = "NLR-BLR";
		b13.travelling.actype = "AC";
		b13.travelling.seatType = "Seater";
		bList.add(b13);

		/* Creating Bus14 */
		Bus b14 = new Bus();
		b14.travelName = new Travel().tList[4];
		b14.idNo = 2468;
		b14.regNo = "AP09AP";
		b14.travelling = new Travel();
		b14.travelling.route = "HYD-BLR";
		b14.travelling.actype = "AC";
		b14.travelling.seatType = "Seater";
		bList.add(b14);

		/* Creating Bus15 */
		Bus b15 = new Bus();
		b15.travelName = new Travel().tList[4];
		b15.idNo = 1359;
		b15.regNo = "TN01TN";
		b15.travelling = new Travel();
		b15.travelling.route = "Chennai-BLR";
		b15.travelling.actype = "Non-AC";
		b15.travelling.seatType = "Seater";
		bList.add(b15);

		/* Creating Bus16 */
		Bus b16 = new Bus();
		b16.travelName = new Travel().tList[5];
		b16.idNo = 1234;
		b16.regNo = "AP26AP";
		b16.travelling = new Travel();
		b16.travelling.route = "NLR-BLR";
		b16.travelling.actype = "AC";
		b16.travelling.seatType = "Seater";
		bList.add(b16);

		/* Creating Bus17 */
		Bus b17 = new Bus();
		b17.travelName = new Travel().tList[5];
		b17.idNo = 2468;
		b17.regNo = "AP09AP";
		b17.travelling = new Travel();
		b17.travelling.route = "HYD-BLR";
		b17.travelling.actype = "AC";
		b17.travelling.seatType = "Seater";
		bList.add(b17);

		/* Creating Bus18 */
		Bus b18 = new Bus();
		b18.travelName = new Travel().tList[5];
		b18.idNo = 1359;
		b18.regNo = "TN01TN";
		b18.travelling = new Travel();
		b18.travelling.route = "Chennai-BLR";
		b18.travelling.actype = "Non-AC";
		b18.travelling.seatType = "Seater";
		bList.add(b18);

		/* Creating Bus19 */
		Bus b19 = new Bus();
		b19.travelName = new Travel().tList[6];
		b19.idNo = 1234;
		b19.regNo = "AP26AP";
		b19.travelling = new Travel();
		b19.travelling.route = "NLR-BLR";
		b19.travelling.actype = "AC";
		b19.travelling.seatType = "Seater";
		bList.add(b19);

		/* Creating Bus20 */
		Bus b20 = new Bus();
		b20.travelName = new Travel().tList[6];
		b20.idNo = 2468;
		b20.regNo = "AP09AP";
		b20.travelling = new Travel();
		b20.travelling.route = "HYD-BLR";
		b20.travelling.actype = "AC";
		b20.travelling.seatType = "Seater";
		bList.add(b20);

		/* Creating Bus21 */
		Bus b21 = new Bus();
		b21.travelName = new Travel().tList[6];
		b21.idNo = 1359;
		b21.regNo = "TN01TN";
		b21.travelling = new Travel();
		b21.travelling.route = "Chennai-BLR";
		b21.travelling.actype = "Non-AC";
		b21.travelling.seatType = "Seater";
		bList.add(b21);

		/* Creating Bus22 */
		Bus b22 = new Bus();
		b22.travelName = new Travel().tList[7];
		b22.idNo = 1234;
		b22.regNo = "AP26AP";
		b22.travelling = new Travel();
		b22.travelling.route = "NLR-BLR";
		b22.travelling.actype = "AC";
		b22.travelling.seatType = "Seater";
		bList.add(b22);

		/* Creating Bus23 */
		Bus b23 = new Bus();
		b23.travelName = new Travel().tList[7];
		b23.idNo = 2468;
		b23.regNo = "AP09AP";
		b23.travelling = new Travel();
		b23.travelling.route = "HYD-BLR";
		b23.travelling.actype = "AC";
		b23.travelling.seatType = "Seater";
		bList.add(b23);

		/* Creating Bus24 */
		Bus b24 = new Bus();
		b24.travelName = new Travel().tList[7];
		b24.idNo = 1359;
		b24.regNo = "TN01TN";
		b24.travelling = new Travel();
		b24.travelling.route = "Chennai-BLR";
		b24.travelling.actype = "Non-AC";
		b24.travelling.seatType = "Seater";
		bList.add(b24);

		Collections.sort(bList, new idSort());
//		Collections.sort(bList, new travelNameSort());
		return bList;
	}
}
class idSort implements Comparator<Bus>{ 

	@Override
	public int compare(Bus b1, Bus b2) {
		
		if (b1.idNo == b2.idNo) {
			return 0;
		} else if (b1.idNo > b2.idNo)
			return 1;
		else
			return -1;
	}
}
class travelNameSort implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		
		return o1.travelName.compareToIgnoreCase(o2.travelName);
	}
	
}