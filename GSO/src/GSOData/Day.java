package GSOData;

import java.util.*;


public class Day {
	private int DayID; // Day in semester (including weekends)
	private DateDays ThisDateDay; //What place in week calendar
	
	List<Integer> list = new ArrayList<Integer>();
	Importance HighestImportance;
	
	
	public Day(int ID, DateDays d)
	{
		DayID = ID;
		ThisDateDay = d;
		
		HighestImportance = Importance.None;
	}
}
