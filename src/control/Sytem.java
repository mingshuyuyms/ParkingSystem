package control;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import model.Holiday;
import model.PublicCustomer;
import view.AdminLogin;
import view.Parking;

public class Sytem {
	
	public static List<Integer> spaceNoList;
	public static BigDecimal cashCollections = new BigDecimal("0");
	public static final int totalBlankTickets = 300;
	public static int nowBlankTickets = 300;
	public static int spaceCount = 30;
	public static Hashtable<String, PublicCustomer> consumerHashtable = new Hashtable<String, PublicCustomer>();
	public static String systemDate;
	public static String systemTime;
	public static boolean isHoliday = true;
	public static HashSet<Holiday> holidays = new HashSet<Holiday>();
	public static BigDecimal fee2 = new BigDecimal("0.5");
	public static BigDecimal fee4 = new BigDecimal("1");
	public static BigDecimal fee8 = new BigDecimal("2");
	public static BigDecimal fee12= new BigDecimal("3");
	public static BigDecimal fee24= new BigDecimal("5");
	public static final BigDecimal feeForStaffPerDay = new BigDecimal("1");
	
	
	

	static {
		spaceNoList = new ArrayList<Integer>();
		for (int i = 1; i <= spaceCount; i++) {
			spaceNoList.add(new Integer(i));
		}
		
		holidays.add(new Holiday(5, 1));
	}
	
	public static void main(String[] args) {
		AdminLogin.adminLogin = new AdminLogin();
		Parking.parking = new Parking();
	}

}
