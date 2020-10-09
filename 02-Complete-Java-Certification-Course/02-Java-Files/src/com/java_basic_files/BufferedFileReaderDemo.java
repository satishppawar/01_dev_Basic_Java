package com.java_basic_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderDemo {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		File file = new File("Demo.txt");
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File " + file + " not found \n" + e);
		} catch (IOException e) {
			System.out.println("Problem reading the file" + e);
		} finally {
			try {
				// Old way to avoid NullPointerException prior to J7
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close the file");
				e.printStackTrace();
			} catch (NullPointerException ex) {
				System.out.println("File was not opened at all \n " + ex);
			}
		}

	}
}
