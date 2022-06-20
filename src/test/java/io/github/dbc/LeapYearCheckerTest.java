package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LeapYearCheckerTest {

	private LeapYearChecker leapYearChecker;

	@BeforeEach
	void setUp() {
		leapYearChecker = new LeapYearChecker();
	}

	@ParameterizedTest(name = "isLeapYear({arguments})")
	@CsvSource(value = {
			"1904", "1908", "1912", "1916", "1920",
			"1924", "1928", "1932", "1936", "1940",
			"1944", "1948", "1952", "1956", "1960",
			"1964", "1968", "1972", "1976", "1980",
			"1984", "1988", "1992", "1996", "2000",
			"2004", "2008", "2012", "2016", "2020"
	})
	void isLeapYear(int year) {
		Assertions.assertTrue(leapYearChecker.isLeapYear(year));
	}
}