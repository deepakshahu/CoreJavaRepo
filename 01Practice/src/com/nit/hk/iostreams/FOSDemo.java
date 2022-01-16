package com.nit.hk.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("E:\\Deepak\\Classcontent\\bbc.txt");
		fos.write(5);
		System.out.println("data is saved");
		fos.close();
	}
}