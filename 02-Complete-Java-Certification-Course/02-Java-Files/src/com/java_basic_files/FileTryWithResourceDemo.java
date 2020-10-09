package com.java_basic_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Satish
 * 
 *         TryWithResource does not need the finally block to close the
 *         resources
 * 
 *         It is supported by JDK7 and above
 *         
 *         Any class implementing the interface @class AutoCloseable
 *
 */
public class FileTryWithResourceDemo {
	public static void main(String[] args) {
		File file = new File("Demo.txt");

		// Step1 : declare and instantiate the required resources (From J7)
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + file + " not found \n" + e);
		} catch (IOException e) {
			System.out.println("Problem reading the file" + e);
		}

	}
}
