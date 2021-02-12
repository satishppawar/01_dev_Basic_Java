package com.java_basic_files;

public class AutoClosableCustomDemo {
	public static void main(String[] args) {
		try (DemoFileClass demoFileClass = new DemoFileClass();) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class DemoFileClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Auto closing the resources");
	}

}