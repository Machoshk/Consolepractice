package calender;

import java.util.Calendar;

public class Caledar {
	static final int CAL_WIDTH = 7;
	final static int CAL_HEIGHT = 6;
	static int calDates[][] = new int[CAL_HEIGHT][CAL_WIDTH];
	public static int calYear;
	public static int calMonth;
	public static int calDayOfMon;
	public final int calLastDateOfMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int calLastDate;
	public static Calendar today = Calendar.getInstance();
	Calendar cal;
}
