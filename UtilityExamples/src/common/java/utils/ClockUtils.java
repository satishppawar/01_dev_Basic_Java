package common.java.utils;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockUtils {

	public static void main(String[] args) {
		getTimezoneDetails();

	}

	private static void getTimezoneDetails() {
		/*
		 * Returns:
		 * 
		 * a clock that uses the best available system clock in the default zone, not
		 * null
		 */
		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = " + clock);

		/*
		 * Returns:
		 * 
		 * the time-zone being used to interpret instants, not null
		 */
		ZoneId zoneId = clock.getZone();
		System.out.println("zoneId = " + zoneId);
	}

	private static void name() {
		/*
		 * Returns:
		 * 
		 * a clock that uses the best available system clock in the UTC zone, not null
		 */
		Clock clock = Clock.systemUTC();
		System.out.println("clock = " + clock);
		/*
		 * Returns:
		 * 
		 * the current instant from this clock, not null
		 */
		Instant instant = clock.instant();
		System.out.println("instant = " + instant);
	}
}
