package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	
	private String monthName;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * 
	 * @param monthName
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(String monthName, int day, int year, boolean isHoliday) {
		this.monthName = monthName;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
//	/**
//	 * 
//	 * @return
//	 */
//	public String getMonthName() {
//		return monthName;
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public int getDay() {
//		return day;
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public int getYear() {
//		return year;
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public boolean isHoliday() {
//		return isHoliday;
//	}
	 public String toString() {
		 return this.monthName + " " + this.day + ", " + this.year + " " + this.isHoliday;
	    }
	
    public static void main(String[] args) {
    	Date d1 = new Date("February", 14, 2023, true);
    	Date d2 = new Date("March", 2, 2023, false);
    	Date d3 = new Date("January", 1, 2023, true);
    	Date d4 = new Date("April", 8, 2004, false);
    	Date d5 = new Date("April", 8, 2004, false);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d3);
    	list.add(d4);
    	list.add(d5);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d3);
    	set.add(d4);
    	set.add(d4);
    	System.out.println(set);

    }
    
}

	
