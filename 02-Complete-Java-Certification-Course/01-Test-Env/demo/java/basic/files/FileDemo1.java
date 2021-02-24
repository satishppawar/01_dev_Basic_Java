package demo.java.basic.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("DemoFile1.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);

			System.out.println("Conent of the line is -");
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
			e.printStackTrace();
		}

	}
}
