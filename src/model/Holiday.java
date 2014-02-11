package model;

import java.util.Calendar;

public class Holiday {
	
	private int month;
	private int day;
	
	public Holiday(Calendar calendar) {
		setMonth(calendar.get(Calendar.MONTH)+1);
		setDay(calendar.get(Calendar.DAY_OF_MONTH));
	}
	public Holiday(int month, int day) {
		setMonth(month);
		setDay(day);
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

}
