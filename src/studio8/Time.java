package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Time {

	private int hour;
	private String minute;
	private boolean isTwelve;

	public Time(int hour, String minute, boolean isTwelve) {
		this.hour = hour;
		this.minute = minute;
		this.isTwelve = isTwelve;
	}
	
	public int isTwelve() {
		if (true) {
			if (hour > 12) {
				return hour - 12;
				
			}
		}
		return hour;
	}

	public String toString() {
		if(isTwelve) {
			if (hour > 12) {
				return (hour - 12) + ":" + this.minute + "pm";	
		}
			return this.hour + ":" + this.minute + "am";
	}
		return this.hour + ":" + this.minute;
	}

	public static void main(String[] args) {
		Time t1 = new Time(23, "00", true);
		Time t2 = new Time(12, "40", false);
		Time t3 = new Time(4, "12", false);

		LinkedList<Time> list = new LinkedList<Time>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		System.out.println(list);

		HashSet<Time> set = new HashSet<Time>();
		set.add(t1);
		set.add(t2);
		set.add(t2);
		System.out.println(set);

	}

}