package io.github.dbc;

public class LeapYearChecker {
	/**
	 * This method checks if the given year is a leap year.
	 *
	 * @param year the year to check for leap year.
	 * @return true if the year is a leap year, false otherwise.
	 */
	public boolean isLeapYear(int year) {
		if (((year%4==0) && (year%100 != 0)) || (year%400 == 0))
		{
			return  true;
		}
		return false;
	}
}
