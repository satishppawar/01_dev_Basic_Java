package demo.basic.util;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Sample Input 08 05 2015
 * 
 * Sample Output WEDNESDAY
 *
 */
class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		int d = Integer.valueOf(day);
		int m = Integer.valueOf(month);
		int y = Integer.valueOf(year);
		LocalDate date = LocalDate.of(y, m, d);
		return date.getDayOfWeek().toString();
	}

	public static String findDay2(int month, int day, int year) {
		int d = Integer.valueOf(day);
		int m = Integer.valueOf(month);
		int y = Integer.valueOf(year);
		Calendar cal = new GregorianCalendar(Locale.US);
		cal.set(y, m - 1, d);
		return cal.getDisplayName(GregorianCalendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	}

	public static void findDay3(int m, int d, int y) {
		String month = String.valueOf(m);
		String day = String.valueOf(d);
		String year = String.valueOf(y);

		String inputDateStr = String.format("%s/%s/%s", day, month, year);
		Date inputDate = null;
		try {
			inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(inputDate);

		String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		System.out.println(dayOfWeek);
	}

}

public class DayFromDate {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);
		String res2 = Result.findDay2(month, day, year);

		bufferedReader.close();
		System.out.println(res);
		System.out.println(res2);
		System.out.println("Approach 3 ");
		Result.findDay3(month, day, year);
	}

}